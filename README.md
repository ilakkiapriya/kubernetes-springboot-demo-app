# kubernetes-springboot-demo-app
Create kubernetes namespace and context
  1) kubectl apply -f kube-yamls/mysql-db/tracker-nm.yml //create the namespace
  2) kubectl config set-context --current --namespace=trackerapp --cluster=kubernetes --user=kubernetes-admin
  
To Create the mysql pod
  1) Create secret for dbpassword
    a) echo -n "myrootpassword" | base64 //Use your own root password
    b) Update the encrypted password output from the above command in value for key ROOT_PASSWORD in dbsecret.yml
    c) kubectl apply -f kube-yamls/mysql-db/dbsecret.yml
  2) Create pv/pvc
    a) mkdir -p ~/data/mysql to create a dir for storing mysql db data, and update the directory name in the path value in dbpv.xml 
    b) kubectl apply -f kube-yamls/mysql-db/dbpv.yml  //Create persisted volume (pv)
    c) kubectl apply -f kube-yamls/mysql-db/dbpvc.yml //Create persisted volume claim (pvc)
  3) Create mysql db instance 
    a) kubectl apply -f kube-yamls/mysql-db/mysql-dc.yml  //to create the db instance 
    b) kubectl apply -f mysql-service.yml //to expose the dbinstance via service 
  4) Access db from outside kubernetes cluster (say via mysql bench) for testing
    a) kubectl get pods //note down the mysql podname.
    b) sudo apt install mysql-workbench // install the mysql client on the machine where you intend to access the db
    c) kubectl port-forward <mysql podname> 3306:3306  //run this on above machine machine where sqlbench client is installed
    c) Open mysql-workbench and connect to mysql-db (localhost and port 3306).

To create spring-boot app and exposing it via NodePort service outside the cluster
   1) Build and publish the docker image for the spring-boot app 
        docker build -t ilakkiapriya/demoapps .
        docker images (check the image in the local docker report)
        docker push ilakkiapriya/demoapps
   2) kubectl apply -f kube-yamls/spring-boot/springboot-deployment.yml  
   3) kubectl exec -it <pod-name> -- /bin/sh  (Check if the pod is running and exposing the http port 3000 via netstat command)
   4) kubectl apply -f kube-yamls/spring-boot/tasktracker-service.yml  (expose the spring boot app via NodePort service)
   5) Open the link in any of the node's browser http://localhost:30000/tasks/listTask

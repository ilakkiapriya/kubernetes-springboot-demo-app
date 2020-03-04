drop table if exists tasks;

create table if not exists tasks (
tid	int(11) AUTO_INCREMENT PRIMARY KEY,
tname	varchar(100) NOT NULL,
createddate	timestamp,
lastupdated	timestamp,
deadline	datetime,
tstatus	varchar(20),
assignedto	varchar(45),
comments	varchar(100),
priority	varchar(10),
closeddate	datetime,
complexity	varchar(45),
label	varchar(100),
);

insert into tasks (tname, tstatus, assignedto, label) values
    ('CKAD Certification', 'open', 'Priya', 'Personal'),
    ('Openshift deployment', 'open', 'Srivatsan', 'Official');
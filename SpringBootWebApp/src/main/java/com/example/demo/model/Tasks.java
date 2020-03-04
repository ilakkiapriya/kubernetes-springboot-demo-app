package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Annotate Task class as JPA Entity class. 
 * Because do not specify the entity table name 
 * then use Task as the table name by default. */
@Entity
public class Tasks {

    /* Identify id as this entity's unique identifier. The id value is auto generated. */
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 @Column(name="tid", updatable=false,nullable=false)
	private Long tid;
 
	private String tname;

	private Date createddate;

	private Date lastupdated;

	private Date deadline;

	private String tstatus;

	private String assignedto;

	private String comments;

    private String priority;

	private Date closeddate;

    private String complexity;

	private String label;


	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getTstatus() {
		return tstatus;
	}

	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(Date closeddate) {
		this.closeddate = closeddate;
	}

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
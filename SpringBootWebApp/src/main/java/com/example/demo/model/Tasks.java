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
@Table
public class Tasks {

    /* Identify id as this entity's unique identifier. The id value is auto generated. */
	 @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 @Column(name="tid", updatable=false,nullable=false)
	private Long tid;
 
	private String taskName;

    private String assignedTo;

    private Date date;

    private String priority;

    private String status;
    
	/*
	 * public Long getTid() { return tid; }
	 * 
	 * public void setTid(Long tid) { this.tid = tid; }
	 */

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
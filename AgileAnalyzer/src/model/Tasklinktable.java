package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TASKLINKTABLE database table.
 * 
 */
@Entity
@Table(name="TASKLINKTABLE")
public class Tasklinktable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TaskLinkTableId")
	private int taskLinkTableId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENTRYDATE")
	private Date entrydate;

	@Column(name="EXPECTEDHOURS")
	private int expectedhours;

	@Column(name="RATING")
	private int rating;

	@Column(name="REMAININGHOURS")
	private int remaininghours;

	@Column(name="TaskIssues")
	private String taskIssues;

	@Column(name="VERSION")
	private int version;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="UserID")
	private Employee employee;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="StatusId")
	private Status status;

	//bi-directional many-to-one association to Task
	@ManyToOne
	@JoinColumn(name="TaskId")
	private Task task;

	//bi-directional many-to-one association to Userstory
	@ManyToOne
	@JoinColumn(name="USID")
	private Userstory userstory;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Tasklinktable() {
	}

	public int getTaskLinkTableId() {
		return this.taskLinkTableId;
	}

	public void setTaskLinkTableId(int taskLinkTableId) {
		this.taskLinkTableId = taskLinkTableId;
	}

	public Date getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public int getExpectedhours() {
		return this.expectedhours;
	}

	public void setExpectedhours(int expectedhours) {
		this.expectedhours = expectedhours;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRemaininghours() {
		return this.remaininghours;
	}

	public void setRemaininghours(int remaininghours) {
		this.remaininghours = remaininghours;
	}

	public String getTaskIssues() {
		return this.taskIssues;
	}

	public void setTaskIssues(String taskIssues) {
		this.taskIssues = taskIssues;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Userstory getUserstory() {
		return this.userstory;
	}

	public void setUserstory(Userstory userstory) {
		this.userstory = userstory;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
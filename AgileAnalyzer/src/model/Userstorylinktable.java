package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USERSTORYLINKTABLE database table.
 * 
 */
@Entity
@Table(name="USERSTORYLINKTABLE")
public class Userstorylinktable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UserStoryLinkTableId")
	private int userStoryLinkTableId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENTRYDATE")
	private Date entrydate;

	@Column(name="EXPECTEDFINISHDATE")
	private String expectedfinishdate;

	@Column(name="POINTS")
	private int points;

	@Column(name="STARTDATE")
	private String startdate;

	@Column(name="VERSION")
	private int version;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EmpID")
	private Employee employee;

	//bi-directional many-to-one association to Epic
	@ManyToOne
	@JoinColumn(name="epicId")
	private Epic epic;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="StatusId")
	private Status status;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="TeamID")
	private Team team;

	//bi-directional many-to-one association to Userstory
	@ManyToOne
	@JoinColumn(name="USID")
	private Userstory userstory;

	public Userstorylinktable() {
	}

	public int getUserStoryLinkTableId() {
		return this.userStoryLinkTableId;
	}

	public void setUserStoryLinkTableId(int userStoryLinkTableId) {
		this.userStoryLinkTableId = userStoryLinkTableId;
	}

	public Date getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getExpectedfinishdate() {
		return this.expectedfinishdate;
	}

	public void setExpectedfinishdate(String expectedfinishdate) {
		this.expectedfinishdate = expectedfinishdate;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
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

	public Epic getEpic() {
		return this.epic;
	}

	public void setEpic(Epic epic) {
		this.epic = epic;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Userstory getUserstory() {
		return this.userstory;
	}

	public void setUserstory(Userstory userstory) {
		this.userstory = userstory;
	}

}
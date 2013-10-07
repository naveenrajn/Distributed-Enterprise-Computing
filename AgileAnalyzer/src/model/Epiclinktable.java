package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the EPICLINKTABLE database table.
 * 
 */
@Entity
@Table(name="EPICLINKTABLE")
public class Epiclinktable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EpicLinkTableId")
	private int epicLinkTableId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ENTRYDATE")
	private Date entrydate;

	@Column(name="EXPECTEDDATE")
	private String expecteddate;

	@Column(name="STARTDATE")
	private String startdate;

	@Column(name="VERSION")
	private int version;

	//bi-directional many-to-one association to Businessusecase
	@ManyToOne
	@JoinColumn(name="bucId")
	private Businessusecase businessusecase;

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

	public Epiclinktable() {
	}

	public int getEpicLinkTableId() {
		return this.epicLinkTableId;
	}

	public void setEpicLinkTableId(int epicLinkTableId) {
		this.epicLinkTableId = epicLinkTableId;
	}

	public Date getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getExpecteddate() {
		return this.expecteddate;
	}

	public void setExpecteddate(String expecteddate) {
		this.expecteddate = expecteddate;
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

	public Businessusecase getBusinessusecase() {
		return this.businessusecase;
	}

	public void setBusinessusecase(Businessusecase businessusecase) {
		this.businessusecase = businessusecase;
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

}
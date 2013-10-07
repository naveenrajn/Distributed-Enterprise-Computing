package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the BUCLINKTABLE database table.
 * 
 */
@Entity
@Table(name="BUCLINKTABLE")
public class Buclinktable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUCLINKID")
	private int buclinkid;

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

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="StatusId")
	private Status status;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="TeamId")
	private Team team;

	public Buclinktable() {
	}

	public int getBuclinkid() {
		return this.buclinkid;
	}

	public void setBuclinkid(int buclinkid) {
		this.buclinkid = buclinkid;
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
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USERTEAMLINK database table.
 * 
 */
@Entity
@Table(name="USERTEAMLINK")
public class Userteamlink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UTLID")
	private int utlid;

	@Column(name="ENTRYDATE")
	private String entrydate;

	@Column(name="VERSION")
	private int version;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EmpID")
	private Employee employee;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="TeamId")
	private Team team;

	public Userteamlink() {
	}

	public int getUtlid() {
		return this.utlid;
	}

	public void setUtlid(int utlid) {
		this.utlid = utlid;
	}

	public String getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
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

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
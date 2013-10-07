package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EmpID")
	private int empID;

	@Column(name="EmpName")
	private String empName;

	//bi-directional many-to-one association to Employeerolelink
	@OneToMany(mappedBy="employee")
	private List<Employeerolelink> employeerolelinks;

	//bi-directional many-to-one association to Tasklinktable
	@OneToMany(mappedBy="employee")
	private List<Tasklinktable> tasklinktables;

	//bi-directional many-to-one association to Userstorylinktable
	@OneToMany(mappedBy="employee")
	private List<Userstorylinktable> userstorylinktables;

	//bi-directional many-to-one association to Userteamlink
	@OneToMany(mappedBy="employee")
	private List<Userteamlink> userteamlinks;

	public Employee() {
	}

	public int getEmpID() {
		return this.empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Employeerolelink> getEmployeerolelinks() {
		return this.employeerolelinks;
	}

	public void setEmployeerolelinks(List<Employeerolelink> employeerolelinks) {
		this.employeerolelinks = employeerolelinks;
	}

	public Employeerolelink addEmployeerolelink(Employeerolelink employeerolelink) {
		getEmployeerolelinks().add(employeerolelink);
		employeerolelink.setEmployee(this);

		return employeerolelink;
	}

	public Employeerolelink removeEmployeerolelink(Employeerolelink employeerolelink) {
		getEmployeerolelinks().remove(employeerolelink);
		employeerolelink.setEmployee(null);

		return employeerolelink;
	}

	public List<Tasklinktable> getTasklinktables() {
		return this.tasklinktables;
	}

	public void setTasklinktables(List<Tasklinktable> tasklinktables) {
		this.tasklinktables = tasklinktables;
	}

	public Tasklinktable addTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().add(tasklinktable);
		tasklinktable.setEmployee(this);

		return tasklinktable;
	}

	public Tasklinktable removeTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().remove(tasklinktable);
		tasklinktable.setEmployee(null);

		return tasklinktable;
	}

	public List<Userstorylinktable> getUserstorylinktables() {
		return this.userstorylinktables;
	}

	public void setUserstorylinktables(List<Userstorylinktable> userstorylinktables) {
		this.userstorylinktables = userstorylinktables;
	}

	public Userstorylinktable addUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().add(userstorylinktable);
		userstorylinktable.setEmployee(this);

		return userstorylinktable;
	}

	public Userstorylinktable removeUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().remove(userstorylinktable);
		userstorylinktable.setEmployee(null);

		return userstorylinktable;
	}

	public List<Userteamlink> getUserteamlinks() {
		return this.userteamlinks;
	}

	public void setUserteamlinks(List<Userteamlink> userteamlinks) {
		this.userteamlinks = userteamlinks;
	}

	public Userteamlink addUserteamlink(Userteamlink userteamlink) {
		getUserteamlinks().add(userteamlink);
		userteamlink.setEmployee(this);

		return userteamlink;
	}

	public Userteamlink removeUserteamlink(Userteamlink userteamlink) {
		getUserteamlinks().remove(userteamlink);
		userteamlink.setEmployee(null);

		return userteamlink;
	}

}
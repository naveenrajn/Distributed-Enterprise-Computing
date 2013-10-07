package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EMPLOYEEROLELINK database table.
 * 
 */
@Entity
@Table(name="EMPLOYEEROLELINK")
public class Employeerolelink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMPLOYEEROLELINKID")
	private int employeerolelinkid;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeId")
	private Employee employee;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role;

	public Employeerolelink() {
	}

	public int getEmployeerolelinkid() {
		return this.employeerolelinkid;
	}

	public void setEmployeerolelinkid(int employeerolelinkid) {
		this.employeerolelinkid = employeerolelinkid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
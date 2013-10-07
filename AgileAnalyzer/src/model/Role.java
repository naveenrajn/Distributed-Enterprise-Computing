package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ROLE database table.
 * 
 */
@Entity
@Table(name="ROLE")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLEID")
	private int roleid;

	@Column(name="ROLENAME")
	private String rolename;

	//bi-directional many-to-one association to Employeerolelink
	@OneToMany(mappedBy="role")
	private List<Employeerolelink> employeerolelinks;

	public Role() {
	}

	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Employeerolelink> getEmployeerolelinks() {
		return this.employeerolelinks;
	}

	public void setEmployeerolelinks(List<Employeerolelink> employeerolelinks) {
		this.employeerolelinks = employeerolelinks;
	}

	public Employeerolelink addEmployeerolelink(Employeerolelink employeerolelink) {
		getEmployeerolelinks().add(employeerolelink);
		employeerolelink.setRole(this);

		return employeerolelink;
	}

	public Employeerolelink removeEmployeerolelink(Employeerolelink employeerolelink) {
		getEmployeerolelinks().remove(employeerolelink);
		employeerolelink.setRole(null);

		return employeerolelink;
	}

}
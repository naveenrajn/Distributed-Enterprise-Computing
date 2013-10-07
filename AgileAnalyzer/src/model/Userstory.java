package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the USERSTORY database table.
 * 
 */
@Entity
@Table(name="USERSTORY")
public class Userstory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USID")
	private int usid;

	@Column(name="USDESCRIPTION")
	private String usdescription;

	@Column(name="USNAME")
	private String usname;

	//bi-directional many-to-one association to Tasklinktable
	@OneToMany(mappedBy="userstory")
	private List<Tasklinktable> tasklinktables;

	//bi-directional many-to-one association to Userstorylinktable
	@OneToMany(mappedBy="userstory")
	private List<Userstorylinktable> userstorylinktables;

	public Userstory() {
	}

	public int getUsid() {
		return this.usid;
	}

	public void setUsid(int usid) {
		this.usid = usid;
	}

	public String getUsdescription() {
		return this.usdescription;
	}

	public void setUsdescription(String usdescription) {
		this.usdescription = usdescription;
	}

	public String getUsname() {
		return this.usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public List<Tasklinktable> getTasklinktables() {
		return this.tasklinktables;
	}

	public void setTasklinktables(List<Tasklinktable> tasklinktables) {
		this.tasklinktables = tasklinktables;
	}

	public Tasklinktable addTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().add(tasklinktable);
		tasklinktable.setUserstory(this);

		return tasklinktable;
	}

	public Tasklinktable removeTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().remove(tasklinktable);
		tasklinktable.setUserstory(null);

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
		userstorylinktable.setUserstory(this);

		return userstorylinktable;
	}

	public Userstorylinktable removeUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().remove(userstorylinktable);
		userstorylinktable.setUserstory(null);

		return userstorylinktable;
	}

}
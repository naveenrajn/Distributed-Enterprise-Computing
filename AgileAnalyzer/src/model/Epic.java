package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EPIC database table.
 * 
 */
@Entity
@Table(name="EPIC")
public class Epic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EPICID")
	private int epicid;

	@Column(name="EPICDESCRIPTION")
	private String epicdescription;

	@Column(name="EPICNAME")
	private String epicname;

	//bi-directional many-to-one association to Epiclinktable
	@OneToMany(mappedBy="epic")
	private List<Epiclinktable> epiclinktables;

	//bi-directional many-to-one association to Userstorylinktable
	@OneToMany(mappedBy="epic")
	private List<Userstorylinktable> userstorylinktables;

	public Epic() {
	}

	public int getEpicid() {
		return this.epicid;
	}

	public void setEpicid(int epicid) {
		this.epicid = epicid;
	}

	public String getEpicdescription() {
		return this.epicdescription;
	}

	public void setEpicdescription(String epicdescription) {
		this.epicdescription = epicdescription;
	}

	public String getEpicname() {
		return this.epicname;
	}

	public void setEpicname(String epicname) {
		this.epicname = epicname;
	}

	public List<Epiclinktable> getEpiclinktables() {
		return this.epiclinktables;
	}

	public void setEpiclinktables(List<Epiclinktable> epiclinktables) {
		this.epiclinktables = epiclinktables;
	}

	public Epiclinktable addEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().add(epiclinktable);
		epiclinktable.setEpic(this);

		return epiclinktable;
	}

	public Epiclinktable removeEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().remove(epiclinktable);
		epiclinktable.setEpic(null);

		return epiclinktable;
	}

	public List<Userstorylinktable> getUserstorylinktables() {
		return this.userstorylinktables;
	}

	public void setUserstorylinktables(List<Userstorylinktable> userstorylinktables) {
		this.userstorylinktables = userstorylinktables;
	}

	public Userstorylinktable addUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().add(userstorylinktable);
		userstorylinktable.setEpic(this);

		return userstorylinktable;
	}

	public Userstorylinktable removeUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().remove(userstorylinktable);
		userstorylinktable.setEpic(null);

		return userstorylinktable;
	}

}
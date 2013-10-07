package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the STATUS database table.
 * 
 */
@Entity
@Table(name="STATUS")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="StatusId")
	private int statusId;

	@Column(name="StatusText")
	private String statusText;

	//bi-directional many-to-one association to Buclinktable
	@OneToMany(mappedBy="status")
	private List<Buclinktable> buclinktables;

	//bi-directional many-to-one association to Epiclinktable
	@OneToMany(mappedBy="status")
	private List<Epiclinktable> epiclinktables;

	//bi-directional many-to-one association to Tasklinktable
	@OneToMany(mappedBy="status")
	private List<Tasklinktable> tasklinktables;

	//bi-directional many-to-one association to Userstorylinktable
	@OneToMany(mappedBy="status")
	private List<Userstorylinktable> userstorylinktables;

	public Status() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusText() {
		return this.statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public List<Buclinktable> getBuclinktables() {
		return this.buclinktables;
	}

	public void setBuclinktables(List<Buclinktable> buclinktables) {
		this.buclinktables = buclinktables;
	}

	public Buclinktable addBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().add(buclinktable);
		buclinktable.setStatus(this);

		return buclinktable;
	}

	public Buclinktable removeBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().remove(buclinktable);
		buclinktable.setStatus(null);

		return buclinktable;
	}

	public List<Epiclinktable> getEpiclinktables() {
		return this.epiclinktables;
	}

	public void setEpiclinktables(List<Epiclinktable> epiclinktables) {
		this.epiclinktables = epiclinktables;
	}

	public Epiclinktable addEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().add(epiclinktable);
		epiclinktable.setStatus(this);

		return epiclinktable;
	}

	public Epiclinktable removeEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().remove(epiclinktable);
		epiclinktable.setStatus(null);

		return epiclinktable;
	}

	public List<Tasklinktable> getTasklinktables() {
		return this.tasklinktables;
	}

	public void setTasklinktables(List<Tasklinktable> tasklinktables) {
		this.tasklinktables = tasklinktables;
	}

	public Tasklinktable addTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().add(tasklinktable);
		tasklinktable.setStatus(this);

		return tasklinktable;
	}

	public Tasklinktable removeTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().remove(tasklinktable);
		tasklinktable.setStatus(null);

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
		userstorylinktable.setStatus(this);

		return userstorylinktable;
	}

	public Userstorylinktable removeUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().remove(userstorylinktable);
		userstorylinktable.setStatus(null);

		return userstorylinktable;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Tasks database table.
 * 
 */
@Entity
@Table(name="Tasks")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TaskId")
	private int taskId;

	@Column(name="TaskDescription")
	private String taskDescription;

	@Column(name="TaskName")
	private String taskName;

	//bi-directional many-to-one association to Tasklinktable
	@OneToMany(mappedBy="task")
	private List<Tasklinktable> tasklinktables;

	public Task() {
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return this.taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public List<Tasklinktable> getTasklinktables() {
		return this.tasklinktables;
	}

	public void setTasklinktables(List<Tasklinktable> tasklinktables) {
		this.tasklinktables = tasklinktables;
	}

	public Tasklinktable addTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().add(tasklinktable);
		tasklinktable.setTask(this);

		return tasklinktable;
	}

	public Tasklinktable removeTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().remove(tasklinktable);
		tasklinktable.setTask(null);

		return tasklinktable;
	}

}
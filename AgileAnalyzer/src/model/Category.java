package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@NamedQuery(
name="fetchCategory",
query="SELECT b FROM Category b where b.categoryText = :categoryText")
@Entity
@Table(name="category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int categoryId;

	private String categoryText;

	//bi-directional many-to-one association to Tasklinktable
	@OneToMany(mappedBy="category")
	private List<Tasklinktable> tasklinktables;

	public Category() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryText() {
		return this.categoryText;
	}

	public void setCategoryText(String categoryText) {
		this.categoryText = categoryText;
	}

	public List<Tasklinktable> getTasklinktables() {
		return this.tasklinktables;
	}

	public void setTasklinktables(List<Tasklinktable> tasklinktables) {
		this.tasklinktables = tasklinktables;
	}

	public Tasklinktable addTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().add(tasklinktable);
		tasklinktable.setCategory(this);

		return tasklinktable;
	}

	public Tasklinktable removeTasklinktable(Tasklinktable tasklinktable) {
		getTasklinktables().remove(tasklinktable);
		tasklinktable.setCategory(null);

		return tasklinktable;
	}

}
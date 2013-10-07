package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the BUSINESSUSECASE database table.
 * 
 */
@Entity
@Table(name="BUSINESSUSECASE")
public class Businessusecase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUCID")
	private int bucid;

	@Column(name="BUCDESCRIPTION")
	private String bucdescription;

	@Column(name="BUCNAME")
	private String bucname;

	//bi-directional many-to-one association to Buclinktable
	@OneToMany(mappedBy="businessusecase")
	private List<Buclinktable> buclinktables;

	//bi-directional many-to-one association to Epiclinktable
	@OneToMany(mappedBy="businessusecase")
	private List<Epiclinktable> epiclinktables;

	public Businessusecase() {
	}

	public int getBucid() {
		return this.bucid;
	}

	public void setBucid(int bucid) {
		this.bucid = bucid;
	}

	public String getBucdescription() {
		return this.bucdescription;
	}

	public void setBucdescription(String bucdescription) {
		this.bucdescription = bucdescription;
	}

	public String getBucname() {
		return this.bucname;
	}

	public void setBucname(String bucname) {
		this.bucname = bucname;
	}

	public List<Buclinktable> getBuclinktables() {
		return this.buclinktables;
	}

	public void setBuclinktables(List<Buclinktable> buclinktables) {
		this.buclinktables = buclinktables;
	}

	public Buclinktable addBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().add(buclinktable);
		buclinktable.setBusinessusecase(this);

		return buclinktable;
	}

	public Buclinktable removeBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().remove(buclinktable);
		buclinktable.setBusinessusecase(null);

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
		epiclinktable.setBusinessusecase(this);

		return epiclinktable;
	}

	public Epiclinktable removeEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().remove(epiclinktable);
		epiclinktable.setBusinessusecase(null);

		return epiclinktable;
	}

}
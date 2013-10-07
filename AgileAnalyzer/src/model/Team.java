package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the TEAM database table.
 * 
 */
@NamedQuery(
name="fetchTeam",
query="SELECT b FROM Team b where b.teamName = :teamName"
)
@Entity
@Table(name="TEAM")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TeamId")
	private int teamId;

	@Column(name="TeamName")
	private String teamName;

	@Column(name="TeamNode")
	private String teamNode;

	//bi-directional many-to-one association to Buclinktable
	@OneToMany(mappedBy="team")
	private List<Buclinktable> buclinktables;

	//bi-directional many-to-one association to Epiclinktable
	@OneToMany(mappedBy="team")
	private List<Epiclinktable> epiclinktables;

	//bi-directional many-to-one association to Userstorylinktable
	@OneToMany(mappedBy="team")
	private List<Userstorylinktable> userstorylinktables;

	//bi-directional many-to-one association to Userteamlink
	@OneToMany(mappedBy="team")
	private List<Userteamlink> userteamlinks;

	public Team() {
	}

	public int getTeamId() {
		return this.teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamNode() {
		return this.teamNode;
	}

	public void setTeamNode(String teamNode) {
		this.teamNode = teamNode;
	}

	public List<Buclinktable> getBuclinktables() {
		return this.buclinktables;
	}

	public void setBuclinktables(List<Buclinktable> buclinktables) {
		this.buclinktables = buclinktables;
	}

	public Buclinktable addBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().add(buclinktable);
		buclinktable.setTeam(this);

		return buclinktable;
	}

	public Buclinktable removeBuclinktable(Buclinktable buclinktable) {
		getBuclinktables().remove(buclinktable);
		buclinktable.setTeam(null);

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
		epiclinktable.setTeam(this);

		return epiclinktable;
	}

	public Epiclinktable removeEpiclinktable(Epiclinktable epiclinktable) {
		getEpiclinktables().remove(epiclinktable);
		epiclinktable.setTeam(null);

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
		userstorylinktable.setTeam(this);

		return userstorylinktable;
	}

	public Userstorylinktable removeUserstorylinktable(Userstorylinktable userstorylinktable) {
		getUserstorylinktables().remove(userstorylinktable);
		userstorylinktable.setTeam(null);

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
		userteamlink.setTeam(this);

		return userteamlink;
	}

	public Userteamlink removeUserteamlink(Userteamlink userteamlink) {
		getUserteamlinks().remove(userteamlink);
		userteamlink.setTeam(null);

		return userteamlink;
	}

}
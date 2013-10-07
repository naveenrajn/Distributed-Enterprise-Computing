package access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Buclinktable;
import model.Businessusecase;
import model.Category;
import model.Employee;
import model.Epic;
import model.Epiclinktable;
import model.Status;
import model.Task;
import model.Tasklinktable;
import model.Team;
import model.Userstory;
import model.Userstorylinktable;




public class BasicDAO {
	private static final String PERSISTENCE_UNIT_NAME = "AgileJPA";
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;

	public List<Buclinktable> getBUCLinkById(int bucId) {
		Query query = getEntityManager().createNamedQuery(
				"fetchByBUCIdVersionOrder").setParameter("bucId", bucId);
		List<Buclinktable> bucList = (List<Buclinktable>)query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Epiclinktable> getEpicLinkById(int epicId) {
		Query query = getEntityManager().createNamedQuery(
				"fetchByEpicIdVersionOrder").setParameter("epicId", epicId);
		List<Epiclinktable> bucList = (List<Epiclinktable>)query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Userstorylinktable> getUSLinkById(int usId) {
		Query query = getEntityManager().createNamedQuery(
				"fetchByUserStoryIdVersionOrder").setParameter("usid", usId);
		List<Userstorylinktable> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Tasklinktable> getTaskLinkById(int taskId) {
		Query query = getEntityManager().createNamedQuery(
				"fetchByTaskIdVersionOrder").setParameter("taskId", taskId);
		List<Tasklinktable> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public Status getStatusByText(String statustext) {
		Query query = getEntityManager().createNamedQuery("fetchStatus")
				.setParameter("statusText", statustext);
		List<Status> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList.get(0);
	}

	public Team getTeamByName(String teamName) {
		Query query = getEntityManager().createNamedQuery("fetchTeam")
				.setParameter("teamName", teamName);
		List<Team> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList.get(0);
	}

	public List<Businessusecase> getBUCByName(String bucName) {
		Query query = getEntityManager().createNamedQuery("fetchBUC")
				.setParameter("bucName", bucName);
		List<Businessusecase> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Epic> getEpicByName(String epicName) {
		Query query = getEntityManager().createNamedQuery("fetchEpic")
				.setParameter("epicName", epicName);
		List<Epic> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Userstory> getUserStoryByName(String userStoryName) {
		Query query = getEntityManager().createNamedQuery("fetchUserStory")
				.setParameter("USName", userStoryName);
		List<Userstory> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Task> getTaskByName(String taskName) {
		Query query = getEntityManager().createNamedQuery("fetchTask")
				.setParameter("taskName", taskName);
		List<Task> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Employee> getEmployeeByName(String userName) {
		Query query = getEntityManager().createNamedQuery("fetchUser")
				.setParameter("userName", userName);
		List<Employee> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Category> getCategoryByName(String categoryName) {
		Query query = getEntityManager().createNamedQuery("fetchCategory")
				.setParameter("categoryText", categoryName);
		List<Category> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public List<Tasklinktable> getTaskDetailsByTimeRange(String t1, String t2) {
		Query query = getEntityManager().createNamedQuery(
				"fetchByTaskIdTimeRange");
		query.setParameter("lowerBound", t1);
		query.setParameter("upperBound", t2);
		List<Tasklinktable> bucList = query.getResultList();
		if (bucList.size() == 0)
			return null;
		return bucList;
	}

	public static EntityManager getEntityManager() {
		if(emf == null){
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		}
		return em;
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection(
					"jdbc:h2:file:///home/kottisudha/Agile", "sa", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
public static void main(String[] args) {
	BasicDAO dao = new BasicDAO();
	dao.getCategoryByName("abc");
}
}

package com.tcs.Hibernatedao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.tcs.dao.IEmployeeOperations;
import com.tcs.pojo.Employee;

public class HibernateDao implements IEmployeeOperations {

	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public boolean registerEmp(Employee employee) {
		try {
			Session session = sessionFactory.openSession();
			session.save(employee);
			session.beginTransaction().commit();
			session.close();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean loginUser(Employee employee) {
		Session session = sessionFactory.openSession(); 
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("eemail", employee.getEemail()));
		// criteria.add(Restrictions.eq("password", employee.getPassword()));
		List<Employee> list = criteria.list();
		Transaction transaction = session.beginTransaction();
		if (list.size() == 1) {
			// model.addAttribute("message", "successfully Loggedin");
			for (Employee employee2 : list) {

				if (employee2.getPassword().equals(employee.getPassword())) {

					return true;
				} else {
					int count=employee2.getCount();
					if (count == 4) {
						employee2.setLocked(true);
						employee2.setCount(4);
						session.update(employee2);
						session.beginTransaction().commit();
						session.close();
						return false;
					} else {
						++count;
						employee2.setCount(count);
						session.update(employee2);
						System.out.println("count:" + count);
						transaction.commit();
						session.close();
					}
					return false;

				}
			}

			// model.addAttribute("message","Please Check your details");
			// in this email is wrong
			return true;
		}
		else{
		return false;
		}
	}

}

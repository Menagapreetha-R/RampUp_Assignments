package com.hcl.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.aspectj.apache.bcel.classfile.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.model.Salesman;

public class SalesmanServImpl implements SalesmanService{
	static Session session = Utility.getSession();
	Transaction transaction;

	public Salesman saveSalesman(Salesman salesman) {
		transaction = session.beginTransaction();
		session.save(salesman);
		transaction.commit();
		return salesman;
	}

	public Salesman updateSalesman(Salesman salesman) {
		session.saveOrUpdate(salesman);
		transaction.commit();
		return salesman;
	}

	public Salesman getSalesman(int Salesman_id) {
		Salesman salesman = (Salesman) session.get(Salesman.class,Salesman_id);
		return salesman;
	}

	public void deleteSalesman(int Salesman_id) {
		transaction = session.beginTransaction();
		Query q = session.createQuery("delete from Salesman where Salesman_id=:Id1");
		q.setParameter("Id1", Salesman_id);
		q.executeUpdate();
		transaction.commit();
	}

	public List<Salesman> getAllSalesman() {
		List<Salesman> salesman = session.createQuery("from Salesman", Salesman.class).list();
		return salesman;

	}

}



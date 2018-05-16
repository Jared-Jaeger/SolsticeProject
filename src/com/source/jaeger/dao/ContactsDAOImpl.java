package com.source.jaeger.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.source.jaeger.entity.Contacts;

@Repository
public class ContactsDAOImpl implements ContactsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Contacts> getContacts() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Contacts> theQuery = currentSession.createQuery("from Customer order by lastName", Contacts.class);

		List<Contacts> customers = theQuery.getResultList();
		
		return customers;
				
	}

	@Override
	public void saveContact(Contacts theContact) {
	Session currentSession = sessionFactory.getCurrentSession();
	
	currentSession.saveOrUpdate(theContact);
	
	}

	@Override
	public Contacts getContact(int id) {
	Session currentSession = sessionFactory.getCurrentSession();
	
	Contacts theContact = currentSession.get(Contacts.class, id);
	
	return theContact;
	}

	@Override
	public void deleteContact(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Customer where id=:idcontact");

		theQuery.setParameter("idcontact", id);
		
		theQuery.executeUpdate();
	}

}


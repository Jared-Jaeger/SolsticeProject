package com.source.jaeger.dao;

import java.util.List;

import com.source.jaeger.entity.Contacts;

public interface ContactsDAO {

	public List<Contacts> getContacts();
		// TODO Auto-generated method stub

	public void saveContact(Contacts theContact);

	public Contacts getContact(int id);

	public void deleteContact(int id);

}

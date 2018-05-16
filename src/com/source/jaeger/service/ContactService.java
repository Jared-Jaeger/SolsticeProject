package com.source.jaeger.service;

import java.util.List;

import com.source.jaeger.entity.Contacts;

public interface ContactService {

	void deleteContact(int id);

	Contacts getContact(int id);

	void saveContact(Contacts theContact);

	List<Contacts> getContacts();

}

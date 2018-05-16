package com.source.jaeger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.source.jaeger.dao.ContactsDAO;
import com.source.jaeger.entity.Contacts;
import com.source.jaeger.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {


		@Autowired
		private ContactsDAO contactsDAO;
		
		@Override
		@Transactional
		public List<Contacts> getContacts() {
			// TODO Auto-generated method stub
			return contactsDAO.getContacts();
		}

		@Override
		@Transactional
		public void saveContact(Contacts theContact) {
			
			contactsDAO.saveContact(theContact);
		}

		@Override
		@Transactional
		public Contacts getContact(int id) {
			// TODO Auto-generated method stub
			return contactsDAO.getContact(id);
		}

		@Override
		@Transactional
		public void deleteContact(int id) {
			// TODO Auto-generated method stub
		 contactsDAO.deleteContact(id);
		}

	}


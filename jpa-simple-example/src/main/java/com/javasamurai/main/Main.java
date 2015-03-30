package com.javasamurai.main;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.javasamurai.dao.SamuraiDAO;
import com.javasamurai.entity.Samurai;
import com.javasamurai.enums.Gender;

public class Main {
	public static void main(String[] args) {
		
		EntityManager em = Persistence
							.createEntityManagerFactory("RESOURCE_MYSQL")
							.createEntityManager();
		
		SamuraiDAO dao = new SamuraiDAO(em);
		
		Samurai s1 = new Samurai("Miyamoto Musashi", 
								 new GregorianCalendar(1675, 6, 13), 
								 Gender.M);
		//CREATE
		dao.insert(s1);
		
		//READ
		s1 = dao.searchById(1); //change id if necessary
		System.out.println("Samurai found: " + s1.getName());
		
		//UPDATE
		s1.setName("Oda Nobunaga");
		dao.update(s1);
		s1 = dao.searchById(1);
		System.out.println("New samurai name: " + s1.getName());
		
		//DELETE
		dao.delete(s1);
		s1 = dao.searchById(1);
		System.out.println("Is there any samurai? " + (s1 != null));
		
		em.close();
		System.exit(0);
	}

}

package com.rk.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.rk.ifacepkg.AddressDAO;
import com.rk.projectbean.Address;


public class AddressDAOImpl implements AddressDAO{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void create() {
		// TODO Auto-generated method stub
		Address add1 = new Address("I30999","tavarakare","bangalore","KA");
		//hibernateTemplate.save(add1);
		hibernateTemplate.saveOrUpdate(add1);
		System.err.println(hibernateTemplate.getFlushMode());

	}


	public void update() {
		// TODO Auto-generated method stub
		
	}


	public void read() {
		// TODO Auto-generated method stub
		
		Address add1  =hibernateTemplate.get(Address.class, "I309192");

		System.out.println("AREA:::"+add1.getArea());

		
	}


	public void delete() {
		// TODO Auto-generated method stub
		
	}

}

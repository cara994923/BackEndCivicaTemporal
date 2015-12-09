package com.proyectocivica.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.proyectocivica.dao.CivicaDAO;
import com.proyectocivica.dto.Civica;
import com.proyectocivica.exception.MyException;


public class CivicaDAOImpl extends HibernateDaoSupport implements CivicaDAO{

	public List<Civica> leerTodos() throws MyException {
		// TODO Auto-generated method stub
		
		List<Civica> lista=new ArrayList<Civica>();
		Session session=null;
		try{
			
			session=getSession();
			Criteria criteria=session.createCriteria(Civica.class);
			lista=criteria.list();
			
		}catch(HibernateException e){
			
			throw new MyException(e);
			
		}/*finally{
			
				if(session!=null){
				
				try{
					
					session.close();
					
				}catch(HibernateException e){
					
					throw new MyException(e);
					
				}
			
		}*/
		return lista;
		
	}

	public Civica leer(String identificador) throws MyException {
		// TODO Auto-generated method stub
		Civica civica = null;
		Session session = null;

		try {

			session = getSession();
			//Criteria criteria = session.createCriteria(Usuario.class).add(Restrictions.eq("Login", login));;
			civica = (Civica) session.get(Civica.class, identificador);

		} catch (HibernateException e) {

			throw new MyException(e);

		} /*finally {
			try{
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				
				throw new MyException(e);
			}
			
			
		}*/
		
		return civica;
		
	}

	public void crear(Civica civica) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.save(civica);
			tr.commit();

		} catch (HibernateException e) {

			throw new MyException(e);

		}/* finally {
			try{
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				
				throw new MyException(e);
			}
			
			
		}*/
		
		
	}

	public void actualizar(Civica civica) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.update(civica);
			tr.commit();

		} catch (HibernateException e) {

			throw new MyException(e);

		}/* finally {
			try{
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				
				throw new MyException(e);
			}
			
			
		}*/
		
	}

	public void borrar(Civica civica) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.delete(civica);
			tr.commit();

		} catch (HibernateException e) {

			throw new MyException(e);

		}/* finally {
			try{
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				
				throw new MyException(e);
			}
			
			
		}*/
		
	}


}

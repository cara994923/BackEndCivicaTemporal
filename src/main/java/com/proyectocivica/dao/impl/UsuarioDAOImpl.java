package com.proyectocivica.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.proyectocivica.dao.UsuarioDAO;
import com.proyectocivica.dto.Usuario;
import com.proyectocivica.exception.MyException;




public class UsuarioDAOImpl extends HibernateDaoSupport implements UsuarioDAO{

	public List<Usuario> leerTodos() throws MyException {
		// TODO Auto-generated method stub
		
		List<Usuario> lista=new ArrayList<Usuario>();
		Session session=null;
		try{
			
			session=getSession();
			Criteria criteria=session.createCriteria(Usuario.class);
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

	public Usuario leer(Long cedula) throws MyException {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		Session session = null;

		try {

			session = getSession();
			//Criteria criteria = session.createCriteria(Usuario.class).add(Restrictions.eq("Login", login));;
			usuario = (Usuario) session.get(Usuario.class, cedula);

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
		
		return usuario;		
		
	}

	public void crear(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.save(usuario);
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

	public void actualizar(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.update(usuario);;
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

	public void borrar(Usuario usuario) throws MyException {
		// TODO Auto-generated method stub
		Session session = null;

		try {

			session = getSession();
			//Guarda el objeto
			//Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.delete(usuario);
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

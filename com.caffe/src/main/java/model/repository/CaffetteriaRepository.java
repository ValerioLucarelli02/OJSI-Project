package model.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.Caffetteria;

@Repository
public class CaffetteriaRepository implements IDao <Caffetteria> {

	@Autowired
	private EntityManager em;

	private Session getSessione() {
		return em.unwrap(Session.class);
	}
	
	@Override
	@Transactional
	public boolean insert(Caffetteria t) {
		Session sessione = this.getSessione();
		
		try {
			sessione.save(t);
		}catch (Exception e) {
			System.out.println("errore");
		}finally {
			sessione.close();
		}
		if(t.getId()==null)
			return false;
					return true;
	}

	@Override
	@Transactional
	public List<Caffetteria> findAll() {
		Session sessione = this.getSessione();
		
		List<Caffetteria> elenco = new ArrayList<Caffetteria>();
		try {
			elenco = sessione.createQuery("FROM Caffetteria").list();
		}catch (Exception e) {
			System.out.println("Sono in Error");
		}finally {
				sessione.close();
			}
		
		return elenco;
	}

	@Override
	@Transactional
	public Caffetteria findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Caffetteria t) {
		// TODO Auto-generated method stub
		return false;
	}

}

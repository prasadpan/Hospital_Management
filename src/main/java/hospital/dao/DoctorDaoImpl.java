package hospital.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import hospital.entity.Doctor;

@Repository
public class DoctorDaoImpl implements DoctorDao {

	  @Autowired
	    private HibernateTemplate hibernateTemplate;

	  @Override
	  @Transactional
	  public boolean addDoctor(Doctor d) {
		  try {
	            hibernateTemplate.save(d);
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
		
	  }

	  @Override
	  public List<Doctor> getAllDoctor() {
		  List<Doctor> list = hibernateTemplate.loadAll(Doctor.class);
		return list;
	  }

	  @Override
	  public Doctor getDoctorById(int id) {
		return hibernateTemplate.get(Doctor.class, id);

	  }

	  @Override
	  @Transactional
	  public boolean updateDoctor(Doctor d) {
		  try {
	            hibernateTemplate.update(d);
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
		
	  }

	  @Override
	  @Transactional
	  public boolean deleteDoctor(int id) {
		Doctor d = hibernateTemplate.get(Doctor.class, id);
		if(d != null) {
			hibernateTemplate.delete(d);
			return true;
		}
		return false;
	  }
	  
	  @Override
	  public int countDoctorlist() {
		  String hql = "select count(*) from Doctor";
	        List<Long> list = 
	                (List<Long>) hibernateTemplate.find(hql);

	        return list.get(0).intValue();
	  }

	  @Override
	  public Doctor loginDoctor(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	  }

	  
	  public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}

	  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			  this.hibernateTemplate = hibernateTemplate;
		}
}

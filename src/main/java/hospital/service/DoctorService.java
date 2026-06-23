package hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.dao.DoctorDao;
import hospital.entity.Doctor;

@Service
public class DoctorService {

	@Autowired
	public DoctorDao doctorDao;
	
	 public boolean addDoctor(Doctor d) {

	        return doctorDao.addDoctor(d);
	    }

	    public List<Doctor> getAllDoctor() {

	        return doctorDao.getAllDoctor();
	    }
	    
	    public Doctor getDoctorById(int id) {
	    	return doctorDao.getDoctorById(id);
	    }
	    
	    public boolean deleteDoctor(int id) {
	    	return doctorDao.deleteDoctor(id);
	    }
	    
	    public boolean updateDoctor(Doctor d) {
	    	return doctorDao.updateDoctor(d);
	    }

	    public int countDoctor() {

	        return doctorDao.countDoctorlist();
	    }
}

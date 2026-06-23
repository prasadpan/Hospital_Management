package hospital.dao;

import java.util.List;

import hospital.entity.Doctor;

public interface DoctorDao {

	public boolean addDoctor(Doctor d);
	public List<Doctor> getAllDoctor();
	public Doctor getDoctorById(int id);
	public boolean updateDoctor(Doctor d);
	public boolean deleteDoctor(int id);
	
	public Doctor loginDoctor(String email,String password);
	
	int countDoctorlist();
	
}

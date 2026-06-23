package hospital.dao;

import java.util.List;

import hospital.entity.Specialist;

public interface SpecialistDao {

    public boolean addSpecialist(Specialist s);

    public List<Specialist> getAllSpecialist();

    int countSpecialist();
}
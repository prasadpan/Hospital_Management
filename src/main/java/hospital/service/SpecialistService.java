package hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hospital.dao.SpecialistDao;
import hospital.entity.Specialist;

@Service

public class SpecialistService {

    @Autowired
    private SpecialistDao specialistDao;

    public boolean addSpecialist(Specialist s) {

        return specialistDao.addSpecialist(s);
    }

    public List<Specialist> getAllSpecialist() {

        return specialistDao.getAllSpecialist();
    }

    public int countSpecialist() {

        return specialistDao.countSpecialist();
    }
}
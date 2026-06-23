package hospital.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hospital.entity.Specialist;

@Repository
@Transactional
public class SpecialistDaoImpl implements SpecialistDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean addSpecialist(Specialist s) {
        try {
            hibernateTemplate.save(s);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Specialist> getAllSpecialist() {
        List<Specialist> list = hibernateTemplate.loadAll(Specialist.class);
        return list;
    }

    @Override
    public int countSpecialist() {
    	String hql = "select count(*) from Specialist";
        List<Long> list = 
                (List<Long>) hibernateTemplate.find(hql);

        return list.get(0).intValue();
    }
}
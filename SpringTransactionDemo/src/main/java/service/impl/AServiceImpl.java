package service.impl;

import dao.AMapper;
import model.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.AService;
import service.BService;

/**
 * Created by admin on 2017/8/25.
 */
@Service
public class AServiceImpl implements AService {

    @Autowired
    private AMapper mapper;

    @Autowired
    private BService bService;

    @Override
//    @Transactional
    public int save() {
        A a1 = new A();
        a1.setId(1);
        a1.setUsername("a1");
        mapper.insert(a1);

        util.DiveByZeroUtil.exec();

        A a2 = new A();
        a2.setId(2);
        a2.setUsername("a2");
        mapper.insert(a2);

        return 2;
    }

    @Override
    @Transactional
//    @Transactional(propagation= Propagation.REQUIRED)
    public int saveAB() {
        A a1 = new A();
        a1.setId(1);
        a1.setUsername("a1");
        mapper.insert(a1);

        A a2 = new A();
        a2.setId(2);
        a2.setUsername("a2");
        mapper.insert(a2);

        bService.save();

        return 4;
    }


}

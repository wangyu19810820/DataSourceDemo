package service.impl;

import dao.BMapper;
import model.A;
import model.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.BService;

/**
 * Created by admin on 2017/8/25.
 */
@Service
public class BServiceImpl implements BService {

    @Autowired
    private BMapper mapper;

    @Transactional
    public int save() {
        B b1 = new B();
        b1.setId(1);
        b1.setUsername("b1");
        mapper.insert(b1);

        util.DiveByZeroUtil.exec();

        B b2 = new B();
        b2.setId(2);
        b2.setUsername("b2");
        mapper.insert(b2);

        return 2;
    }
}

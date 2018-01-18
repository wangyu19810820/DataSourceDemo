package service.impl;

import dao.TESTMapper;
import model.TEST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TestService;

import java.util.List;

/**
 * Created by admin on 2017/8/31.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TESTMapper testMapper;

    @Override
    public TEST getFirst() {
        return testMapper.selectByPrimaryKey(1);
    }
}

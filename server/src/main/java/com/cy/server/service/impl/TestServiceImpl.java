package com.cy.server.service.impl;

import com.cy.server.domain.Test;
import com.cy.server.mapper.TestMapper;
import com.cy.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:  {一句话描述类是干什么的}<br/>
 *
 * @author chenyu
 * @version 1.0
 * @date: 2020/11/9 17:52
 * @since JDK 1.8
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list() {
        return testMapper.selectByExample(null);
    }
}

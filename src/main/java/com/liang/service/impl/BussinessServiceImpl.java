package com.liang.service.impl;

import com.liang.domain.OrganizationVO;
import com.liang.domain.SysDictVO;
import com.liang.mapper.cluster.SysDictMapper;
import com.liang.mapper.master.OrganizationMapper;
import com.liang.service.BussinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Liangxp
 * @date 2020/8/26 15:55
 */
@Service
public class BussinessServiceImpl implements BussinessService {
    @Resource
    private SysDictMapper sysDictMapper;

    @Resource
    private OrganizationMapper organizationMapper;

    @Override
    // 事物的用法
    // @Transactional(transactionManager = "masterTransactionManager")
    public Object get() {
        OrganizationVO organizationVO = organizationMapper.getById(1356288699138080L);
        SysDictVO dict = sysDictMapper.getById(1359370518528032L);
        organizationVO.setSysDictVO(dict);
        return organizationVO;
    }
}

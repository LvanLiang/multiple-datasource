package com.liang;

import com.liang.service.BussinessService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Liangxp
 * @date 2020/8/26 16:07
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class MultipleDataSourceTest {
    @Resource
    private BussinessService bussinessService;

    @Test
    public void testGetData() {
        Object obj = bussinessService.get();
        log.info("数据:{}", obj);
    }
}

package com.liang.mapper.cluster;

import com.liang.domain.SysDictVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Liangxp
 * @date 2020/8/26 15:52
 */
@Mapper
public interface SysDictMapper {
    SysDictVO getById(Long id);
}

package com.liang.mapper.master;

import com.liang.domain.OrganizationVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Liangxp
 * @date 2020/8/26 15:53
 */
@Mapper
public interface OrganizationMapper {
    OrganizationVO getById(Long id);
}

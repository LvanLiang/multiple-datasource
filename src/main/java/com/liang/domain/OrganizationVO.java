package com.liang.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 单位详情对象
 * @author liuyuanjing
 * @Description 单位详情对象
 * @date 15:11 2020/6/9
 **/
@Data
public class OrganizationVO implements Serializable {

    public Long id;

    private String name;

    /**
     * 分类
     */
    private Long category;

    /**
     * 所属地区
     */
    private String regionCode;

    /**
     * 地区名称
     */
    private String regionName;
    /**
     * 地区父级
     */
    private String regionNodes;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 单位网址
     */
    private String website;

    /**
     * 简介
     */
    private String brief;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 标签
     */
    private String tag;

    private SysDictVO sysDictVO;
}
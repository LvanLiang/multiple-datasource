package com.liang.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liangxp
 * @date 2020/7/16 11:35
 */
@Data
public class SysDictVO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 父级
     */
    private Long pid;

    /**
     * 类型
     */
    private String type;

    /**
     * 字典名
     */
    private String name;

    /**
     * 字典值
     */
    private String value;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 备注
     */
    private String remark;

    /**
     * 扩展字段
     */
    private String ext;
}

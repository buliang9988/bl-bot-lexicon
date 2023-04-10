package com.bl.bot.entity;

import lombok.Data;

/**
 * @ClassName Tense
 * @Description 时态实体类
 * @Author ljf
 * @Date 2023/4/3 16:07
 * @Version 2.0
 **/
@Data
public class Tense {
    //ID
    private Integer id;
    //关键词
    private String key;
    //时态
    private String tense;
}

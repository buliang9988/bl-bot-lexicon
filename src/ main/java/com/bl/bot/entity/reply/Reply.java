package com.bl.bot.entity.reply;

import lombok.Data;

/**
 * @ClassName Reply
 * @Description 基础回复实体类
 * @Author ljf
 * @Date 2023/3/28 10:10
 * @Version 2.0
 **/
@Data
public class Reply {
    //id
    private Long id;
    //关键词
    private String key;
    //回复
    private String reply;
    //情绪
    private String emotion;
    //时态
    private String time;
    //创建时间
    private String ctrTime;


}

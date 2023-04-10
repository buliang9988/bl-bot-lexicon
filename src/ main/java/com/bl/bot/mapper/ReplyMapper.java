package com.bl.bot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bl.bot.entity.reply.Reply;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName ReplyMapper
 * @Description TODO
 * @Author ljf
 * @Date 2023/3/28 13:41
 * @Version 2.0
 **/
@Mapper
public interface ReplyMapper extends BaseMapper<Reply> {
}

package com.tencent.supersonic.chat.persistence.mapper;

import com.tencent.supersonic.chat.persistence.dataobject.ChatParseDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ChatParseMapper {

    boolean batchSaveParseInfo(@Param("list") List<ChatParseDO> list);

    ChatParseDO getParseInfo(Long questionId, String userName, int parseId);

}

package com.rz.repast.mapper;

import com.rz.repast.model.MemberLevel;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface MemberLevelMapper extends Mapper<MemberLevel> {
    MemberLevel selectMemberLevel(String openID);
}
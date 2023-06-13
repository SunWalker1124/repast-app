package com.rz.repast.mapper;

import com.rz.repast.model.InterHistory;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface InterHistoryMapper extends Mapper<InterHistory> {
    List<InterHistory> selectInterHistory(long id);
}
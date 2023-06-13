package com.rz.repast.mapper;

import com.rz.repast.model.SkuStock;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface SkuStockMapper extends Mapper<SkuStock> {
    SkuStock selectSkuById(Long productId);
}
package com.rz.repast.mapper;

import com.rz.repast.model.ProductCom;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface ProductComMapper extends Mapper<ProductCom> {
    ProductCom selectPcomById(Long productId);
}
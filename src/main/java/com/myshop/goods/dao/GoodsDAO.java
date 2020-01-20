package com.myshop.goods.dao;

import com.myshop.goods.vo.GoodsVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface GoodsDAO {
    public List<GoodsVO> selectGoodsList(String goodsStatus) throws DataAccessException;
}

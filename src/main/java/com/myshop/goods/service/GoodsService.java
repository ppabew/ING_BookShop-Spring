package com.myshop.goods.service;

import com.myshop.goods.vo.GoodsVO;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    public Map<String, List<GoodsVO>> listGoods() throws Exception;
}

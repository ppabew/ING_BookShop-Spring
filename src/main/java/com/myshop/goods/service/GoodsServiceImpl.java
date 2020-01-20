package com.myshop.goods.service;

import com.myshop.goods.dao.GoodsDAO;
import com.myshop.goods.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDAO goodsDAO;


    @Override
    public Map<String, List<GoodsVO>> listGoods() throws Exception {
        Map<String, List<GoodsVO>> goodsMap = new HashMap<String, List<GoodsVO>>();
        List<GoodsVO> goodsList=goodsDAO.selectGoodsList("bestseller");
        goodsMap.put("bestseller",goodsList);
        goodsList=goodsDAO.selectGoodsList("newbook");
        goodsMap.put("newbook",goodsList);
        goodsList=goodsDAO.selectGoodsList("steadyseller");
        goodsMap.put("steadyseller",goodsList);
        return goodsMap;
    }
}

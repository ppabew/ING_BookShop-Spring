package com.myshop.main;

import com.myshop.common.base.BaseController;
import com.myshop.goods.service.GoodsService;
import com.myshop.goods.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller("mainController")
@EnableAspectJAutoProxy
public class MainController extends BaseController {
	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value = "/")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("===>컨트롤러로 main 메서드 접속");
		HttpSession session;
		ModelAndView mav = new ModelAndView();
		String viewName = "/main/main";
		System.out.println("viewName : "+viewName);
		mav.setViewName(viewName);

		session = request.getSession();
		session.setAttribute("side_menu", "user");
		Map<String, List<GoodsVO>> goodsMap = goodsService.listGoods();
		mav.addObject("goodsMap", goodsMap);
		return mav;
	}
}

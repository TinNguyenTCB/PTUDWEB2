package tcb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	// Trả về cho User trang để đăng nhập
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String loginGet()
	{
		return "login";
	}
	// Xử lý khi user nhấn submit đăng nhập
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String loginPost(ModelMap model,HttpServletRequest request)
	{
		String id = request.getParameter("id");
		String pass = request.getParameter("pwd");
		if (id.equals("admin")&& pass.equals("62cnttclc"))
		{// đăng nhập thành công,thì do sth
			return "redirect: admincp/index.html";
		}else //đăng nhập thất bai
		{
			model.addAttribute("thongbaoloi","Thông tin đăng nhập không đúng");
			return "login";
		}
	}

}

package sample05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import common.HtmlTags;

public class SampleController extends HtmlTags implements Controller {
	private SampleBean bean;

	public SampleBean getBean() {
		return bean;
	}

	public void setBean(SampleBean bean) {
		this.bean = bean;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		bean.setText(request.getParameter("text"));

		PrintWriter out = response.getWriter();

		out.println(
			html(
				head(META),
				body(
					p(this.getClass().getName()),
					bean.getText())
			)
		);
		return null;
	}
}

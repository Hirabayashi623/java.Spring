package sample07;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import common.HtmlTags;

public class SampleServlet extends HtmlTags{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		this.exesute(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		this.exesute(request, response);
	}

	private void exesute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();

		Resource resource = new ClassPathResource("bean-conf.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		SampleBean bean = (SampleBean)factory.getBean("sample07.bean");

		List<?> list = bean.getAll();

		StringBuilder sb = new StringBuilder();
		for(Iterator<?> it = list.iterator(); it.hasNext();){
			Map<?,?> map = (Map<?,?>)it.next();
			sb.append(
					tr(
						td((String)map.get("ID")),
						td((String)map.get("NAME"))
					));
		}

		out.println(html(
			head(META),
			body(
				table(
					tr(
						th("ID"),
						th("NAME")
					),
					sb.toString()
				)
			)
		));
	}
}

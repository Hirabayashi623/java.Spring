package sample01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		Resource resorce = new ClassPathResource("bean-conf.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resorce);
		SampleBean test = (SampleBean)beanFactory.getBean("sample01.test");
		PrintWriter out = response.getWriter();

		out.println("<html><head></head>");
		out.println("<body>");

		out.println("<p>" + this.getClass().getName() + "</p>");
		test.doTest(out);

		out.println("</body></html>");
	}
}


package sample01;

import java.io.PrintWriter;

public class SampleBean {
	public void doTest(PrintWriter out){
		out.println("<h3>Hello Spring Framework!</h3>");
		out.println(this.getClass().getName());
	}
}

package sample02;

import java.io.PrintWriter;

public class SampleBean {
	private String title;
	private String message;

	public void execute(PrintWriter out){
		out.println(title);
		out.println("<br>");
		out.println(message);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

package sample03;

import java.io.PrintWriter;

public class SampleBean implements BeanIF{
	private String title;
	private String message;

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void execute(PrintWriter out) {
		out.println("<p>" + this.getClass().getName() + "</p>");
		out.println("title: " + title);
		out.println("<br>");
		out.println("message: " + message);
	}

}

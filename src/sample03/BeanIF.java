package sample03;

import java.io.PrintWriter;

public interface BeanIF {
	public String getTitle();
	public void setTitle(String title);
	public String getMessage();
	public void setMessage(String message);

	public void execute(PrintWriter out);
}

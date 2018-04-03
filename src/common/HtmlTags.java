package common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

public class HtmlTags extends HttpServlet{
	public static final String META = "<meta http-equiv='Content-type' content='text/html' charset='utf-8' />";

	public void print(PrintWriter out, String str){
		out.println(str);
	}

	public String br(){
		return "<br/>";
	}

	public String p(String str){
		return "<p>" + str + "</p>";
	}

	public String table(String... str){
		StringBuilder sb = new StringBuilder("<table border=1 cellspacing=0>");

		for(String s : str){
			sb.append(s);
		}

		sb.append("</table>");
		return sb.toString();
	}

	public String tr(String... str){
		StringBuilder sb = new StringBuilder("<tr>");

		for(String s : str){
			sb.append(s);
		}

		sb.append("</tr>");
		return sb.toString();
	}

	public String td(String str){
		return "<td>" + str + "</td>";
	}

	public String th(String str){
		return "<th>" + str + "</th>";
	}

	public String html(String... str){
		StringBuilder sb = new StringBuilder("<html>");

		for(String s : str){
			sb.append(s);
		}

		sb.append("</html>");
		return sb.toString();
	}

	public String body(String... str){
		StringBuilder sb = new StringBuilder("<body>");

		for(String s : str){
			sb.append(s);
		}

		sb.append("</body>");
		return sb.toString();
	}

	public String head(String... str){
		StringBuilder sb = new StringBuilder("<head>");

		for(String s : str){
			sb.append(s);
		}

		sb.append("</head>");
		return sb.toString();
	}
}

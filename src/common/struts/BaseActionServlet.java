package common.struts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionServlet;

/*
 * ActionServletを継承させることで独自仕様にできる
 */
public class BaseActionServlet extends ActionServlet {

	/**
	 * 使用するエンコーディング
	 */
	private static String encodingName = "utf-8";


	public void init() throws ServletException {
		super.init();
	}

	/**
	  * process をオーバーライドして request の encoding を設定.
	  * @param      HttpServletRequestオブジェクト
	  * @param      HttpServletResponseオブジェクト
	  * @exception  IOException, ServletException
	  */
	protected void process(HttpServletRequest request,
					HttpServletResponse response)
		throws IOException, ServletException {

		request.setCharacterEncoding(encodingName);

		super.process(request, response);
	}
}
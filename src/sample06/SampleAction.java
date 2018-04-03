package sample06;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SampleAction extends Action{
	public ActionForward execute(ActionMapping map,
							ActionForm form,
							HttpServletRequest request,
							HttpServletResponse response){

		SampleForm form_ = (SampleForm)form;
		String msg = form_.getText();
		request.setAttribute("message", msg);

		return map.findForward("result");
	}
}

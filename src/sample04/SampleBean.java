package sample04;

import java.io.PrintWriter;
import common.HtmlTags;

public class SampleBean extends HtmlTags{
	private ActionBean action;

	public void execute(PrintWriter out){
		print(out,
			table(
				tr(td(action.getTitle())),
				tr(td(action.getMessage()))
			)
		);
	}

	public ActionBean getAction() {
		return action;
	}

	public void setAction(ActionBean action) {
		this.action = action;
	}
}

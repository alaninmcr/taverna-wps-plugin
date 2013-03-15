package ogc.wps.ui.serviceprovider;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import ogc.wps.WpsProcessActivity;

import net.sf.taverna.t2.workbench.activityicons.ActivityIconSPI;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;

public class WpsProcessServiceIcon implements ActivityIconSPI {

	private static Icon icon;

	public int canProvideIconScore(Activity<?> activity) {
		if (activity instanceof WpsProcessActivity) {
			return DEFAULT_ICON;
		}
		return NO_ICON;
	}

	public Icon getIcon(Activity<?> activity) {
		return getIcon();
	}
	
	public static Icon getIcon() {
		if (icon == null) {
			icon = new ImageIcon(WpsProcessServiceIcon.class.getResource("/exampleIcon.png"));
		}
		return icon;
	}

}

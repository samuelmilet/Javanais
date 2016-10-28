package com.actionBean;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * 
 * @author esmi9130
 *
 */
public abstract class AbstractActionBean implements ActionBean {

	/**
	 * action bean context
	 */
	private ActionBeanContext context;
	
	
	/**
	 * getter du context
	 */
	@Override
	public ActionBeanContext getContext() { return context; }
	
	/**
	 * setter du context
	 */
    @Override
	public void setContext(final ActionBeanContext context) { this.context = context; }
	
}

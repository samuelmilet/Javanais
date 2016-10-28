package com.actionBean;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

import com.metier.TransfoJava2Javanais;
import com.metier.TransfoJavanais2Java;

/**
 * 
 * @author esmi9130
 *
 */
@UrlBinding("/")
public class MonActionBean extends AbstractActionBean {

	
	/**
	 * textJava
	 */
	private String textJava;
	
	/**
	 * textJavanais
	 */
    private String textJavanais;
    
    /**
     * resultJava
     */
    private String resultJava;
    
    /**
     * resultJavanais
     */
    private String resultJavanais;


    /**
     * chargement de la page index.jsp 
     * @return page index.jsp
     */
	@DefaultHandler
    public Resolution index() {
        return new ForwardResolution("WEB-INF/index.jsp");
    }
	
	/**
	 * action de la transformation d'un text en francais vers du javanais
	 * 
	 * @return la page index.jsp
	 */
	@HandlesEvent("transfoJava")
    public Resolution transfofrancais() {
		resultJavanais = new TransfoJava2Javanais().transfo(getTextJava());
        return new ForwardResolution("WEB-INF/index.jsp");
    }
	
	/**
	 * action de la transformation d'un text en javanais vers du francais
	 * 
	 * @return la page index.jsp
	 */
	@HandlesEvent("transfoJavanais")
    public Resolution transfoJavanais() {
		resultJava = new TransfoJavanais2Java().transfo(getTextJavanais());
		return new ForwardResolution("WEB-INF/index.jsp");
    }





	/**
	 * @return the textJava
	 */
	public final String getTextJava() {
		return textJava;
	}





	/**
	 * @param pTextJava the textJava to set
	 */
	public final void setTextJava(final String pTextJava) {
		textJava = pTextJava;
	}





	/**
	 * @return the textJavanais
	 */
	public final String getTextJavanais() {
		return textJavanais;
	}





	/**
	 * @param pTextJavanais the textJavanais to set
	 */
	public final void setTextJavanais(final String pTextJavanais) {
		textJavanais = pTextJavanais;
	}





	/**
	 * @return the resultJava
	 */
	public final String getResultJava() {
		return resultJava;
	}





	/**
	 * @param pResultJava the resultJava to set
	 */
	public final void setResultJava(final String pResultJava) {
		resultJava = pResultJava;
	}





	/**
	 * @return the resultJavanais
	 */
	public final String getResultJavanais() {
		return resultJavanais;
	}





	/**
	 * @param pResultJavanais the resultJavanais to set
	 */
	public final void setResultJavanais(final String pResultJavanais) {
		resultJavanais = pResultJavanais;
	}
	
	
	
	
}

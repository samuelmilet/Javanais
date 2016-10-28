package com.enumerateur;

public enum Voyelles {

	/**
	 * Voyelles
	 */
	A("A"), E("E"), I("I"), O("O"), U("U"), Y("Y");

	/**
	 * code
	 */
	private final String code;

	/**
	 * Constructeur
	 * 
	 * @param pCode
	 *            pCode
	 */
	private Voyelles(final String pCode) {
		this.code = pCode;
	}

	/**
	 * Renvoie code.
	 * 
	 * @return Le code.
	 */
	public String getCode() {
		return code;
	}

}

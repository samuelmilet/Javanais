package com.enumerateur;

public enum Consonnes {

	/**
	 * Consonnes
	 */
	Z("Z"), R("R"), T("T"), P("P"), Q("Q"), S("S"), D("D"), F("F"), G("G"), H(
			"H"), J("J"), K("K"), L("L"), M("M"), W("W"), X("X"), C("C"), V("V"), B(
			"B"), N("N");

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
	private Consonnes(final String pCode) {
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

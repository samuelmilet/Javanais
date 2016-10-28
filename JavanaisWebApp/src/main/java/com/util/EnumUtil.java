package com.util;

import com.enumerateur.Consonnes;
import com.enumerateur.Voyelles;

/**
 * 
 * @author esmi9130
 *
 */
public class EnumUtil {

	/**
	 * vérifie si la valeur en entrée est une voyelle
	 * @param value valeur d'entrée
	 * @return true si value est une voyelle , false sinon
	 */
	public boolean isVoyelle(final String value) {
		for (final Voyelles e : Voyelles.class.getEnumConstants()) {
			if (e.name().equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * vérifie si la valeur en entrée est une consonne
	 * @param value valeur d'entrée
	 * @return true si value est une consonne , false sinon
	 */
	public boolean isConsonne(final String value) {
		for (final Consonnes e : Consonnes.class.getEnumConstants()) {
			if (e.name().equals(value)) {
				return true;
			}
		}
		return false;
	}
}

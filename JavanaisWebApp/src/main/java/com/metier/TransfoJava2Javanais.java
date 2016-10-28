package com.metier;

import com.util.EnumUtil;

/**
 * 
 * @author esmi9130
 *
 */
public class TransfoJava2Javanais {


	
	/**
	 * transformation d'un text du francais vers le javanais
	 * @param pTextJava text en francais
	 * @return text en javanais
	 */
	public String transfo(final String pTextFrancais) {

		final EnumUtil enumUtil = new EnumUtil();
		
		Boolean precedent = true;
		final StringBuilder result = new StringBuilder();
		if(pTextFrancais != null)
		{
			
			for (int i = 0 ; i < pTextFrancais.length() ;i++)
			{
				final char caractere  = pTextFrancais.charAt(i);
				if(precedent && enumUtil.isVoyelle(String.valueOf(caractere).toUpperCase()))
				{
					result.append("av");
				}
				result.append(caractere);
				
				precedent = enumUtil.isConsonne(String.valueOf(caractere).toUpperCase());
			}
		}

		
		return result.toString();
	}

}

package com.metier;

import com.util.EnumUtil;

/**
 * 
 * @author esmi9130
 *
 */
public class TransfoJavanais2Java {
	
	
	/**
	 * transformation d'un text du javanais vers le francais
	 * @param pTextJava text en javanais
	 * @return text en francais
	 */
	public String transfo(final String pTextJavanais) {
		
		String result = pTextJavanais;
		final EnumUtil enumUtil = new EnumUtil();
	
		if(pTextJavanais != null)
		{
			 
			int j = 0;
			for (int i = 0 ; i < pTextJavanais.length()-2 ;i++)
			{
				char caractereMoins1 = 0  ;
				final char caractere  = pTextJavanais.charAt(i);
				final char caracterePlus1  = pTextJavanais.charAt(i+1);
				final char caracterePlus2  = pTextJavanais.charAt(i+2);
				if(i>0)
				{
					caractereMoins1  = pTextJavanais.charAt(i-1);
				}
				
				
				if((enumUtil.isConsonne(String.valueOf(caractereMoins1).toUpperCase()) || i==0)
						&&  "A".equals(String.valueOf(caractere).toUpperCase() ) &&
						 "V".equals(String.valueOf(caracterePlus1).toUpperCase()) && 
						enumUtil.isVoyelle(String.valueOf(caracterePlus2).toUpperCase()))
				{
					
					result  = result.substring(0, i-j) + result.substring(i+2-j, result.length());
					j = j+2;
				}
			}	
				
		}
		return result;
		
		
	}


}

package com.metier;

import javax.inject.Inject;

import junit.framework.Assert;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * 
 * @author esmi9130
 *
 */
@RunWith(CdiRunner.class)
public class TransfoTest {

	
	/**
	 * transfoJava2Javanais
	 */
	@Inject
	private TransfoJava2Javanais transfoJava2Javanais;
	
	
	/**
	 * transfoJavanais2Java
	 */
	@Inject
	private TransfoJavanais2Java transfoJavanais2Java;
	
	
	
	/**
	 * Test de la fonction transfo du francais vers le javanais
	 */
	@Test
	public void testTransfoJava2Javanais() {
		
		Assert.assertEquals(transfoJava2Javanais.transfo("exemple"), "avexavemplave");
	}
	
	
	/**
	 * Test de la fonction transfo du javanais vers le francais
	 */
	@Test
	public void testTransfoJavanais2Java() {
		
		Assert.assertEquals(transfoJavanais2Java.transfo("avexavemplave"), "exemple");
	}
	
	
}

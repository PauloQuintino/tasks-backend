package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		System.out.println("Data do teste: " + date);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}	
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2010, 01, 01);
		System.out.println("Data do teste: " + date);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deveRetornarTrueParaDatasAtual() {
		LocalDate date = LocalDate.now();
		System.out.println("Data do teste: " + date);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
}

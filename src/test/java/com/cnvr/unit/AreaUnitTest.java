package com.cnvr.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
public class AreaUnitTest {

	@InjectMocks
	Area areaService;

	@Test
	public void positiveNoSqCMTest() {
		assertEquals(6.451, areaService.convertToMetric(1, "sqcm"));
	}

	@Test
	public void positiveNoSqtoYardTest() {
		assertEquals(1.1960, areaService.convertToMetric(1, "sqm"));
	}

	@Test
	public void positiveHactToAcreTest() {
		assertEquals(2.4711, areaService.convertToMetric(1, "hectare"));
	}

	@Test
	public void positiveSqKmToMileTest() {
		assertEquals(0.3861, areaService.convertToMetric(1, "sqkm"));
	}
	
	
}

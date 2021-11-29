package com.cnvr.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
public class MassUnitTest {

	@InjectMocks
	Mass massService;

	@Test
	public void positiveConvertmassMgtoGrain() {
		assertEquals(0.0154, massService.convertToMetric(1, "mg"));
	}

	@Test
	public void positiveConvertmassGramtoOz() {
		assertEquals(0.0353, massService.convertToMetric(1, "gram"));
	}

	@Test
	public void positiveConvertmassKgToLb() {
		assertEquals(2.2046, massService.convertToMetric(1, "kg"));
	}

	@Test
	public void positiveConvertmassTonneToShTonne() {
		assertEquals(0.3861, massService.convertToMetric(1, "tonne"));
	}

}

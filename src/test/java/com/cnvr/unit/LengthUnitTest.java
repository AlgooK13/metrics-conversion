package com.cnvr.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
public class LengthUnitTest {

	@InjectMocks
	Length lengthService;
	
	@Test
	public void positiveConvertMmToInch() {
		assertEquals(0.03937, lengthService.convertToMetric(1, "mm"));
	}
	@Test
	public void positiveConvertlengthCMtoInch() {
		assertEquals(0.3937, lengthService.convertToMetric(1, "cm"));
	}
	@Test
	public void positiveConvertlengthMetertoYard() {
		assertEquals(1.0936, lengthService.convertToMetric(1, "meter"));
	}
	@Test
	public void positiveConvertlengthKmToMile() {
		assertEquals(0.6214, lengthService.convertToMetric(1, "km"));
	}
	
}

package com.cnvr.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
public class TempperatureUnitTest {

	@InjectMocks
	Temperature tempService;

	// Positive testing
	@Test
	public void positiveConvertToFerh() {
		assertEquals(32.0, tempService.convertToImperial(0, null));
	}

	@Test
	public void positiveConvertToCelsius() {
		assertEquals(0, tempService.convertToMetric(32, null));
	}

	@Test
	public void positiveConvertToCelsiuswithSameResult() {
		assertEquals(-40, tempService.convertToMetric(-40, null));
	}

	@Test
	public void positiveConvertToFerhwithSameResult() {
		assertEquals(-40, tempService.convertToImperial(-40, null));
	}

}

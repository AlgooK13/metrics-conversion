package com.cnvr.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
public class VolumeUnitTest {

	@InjectMocks
	Volume volumeService;

	@Test
	public void positiveConvertvolumeCucmToIn() {
		assertEquals(0.0610, volumeService.convertToMetric(1, "cucm"));
	}

	@Test
	public void positiveConvertvolumeCuDeciToFt() {
		assertEquals(0.0353, volumeService.convertToMetric(1, "cudecimeter"));
	}

	@Test
	public void positiveConvertvolumeCuMeterToYard() {
		assertEquals(1.3080, volumeService.convertToMetric(1, "cumeter"));
	}

	@Test
	public void positiveConvertvolumeliterToPt() {
		assertEquals(1.7598, volumeService.convertToMetric(1, "liter"));
	}

}

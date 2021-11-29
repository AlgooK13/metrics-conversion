package com.cnvr.util;

import org.apache.commons.math3.util.Precision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConversionUtility {

	static Logger log = LoggerFactory.getLogger(ConversionUtility.class);

	public static double convertUnit(double unitValue, double unitConst) {
		try {
			double convetedUnit = Precision.round(unitValue * unitConst, 5);
			log.info("unitValue:" + unitValue + " to unitValue:" + unitConst + " = " + convetedUnit);
			return convetedUnit;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static double convertToCelsius(double unitValue) {
		// formula to calculate the Celsius
		double celsiusValue = Precision.round((unitValue - 32) / 1.8, 2);
		return celsiusValue;
	}

	public static double convertToFahrenheit(double unitValue) {
		// formula to calculate the Fahrenheit
		double fahrenheitValue = Precision.round((unitValue * 1.8) + 32, 2);
		return fahrenheitValue;

	}
}

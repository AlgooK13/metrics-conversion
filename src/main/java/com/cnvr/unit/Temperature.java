package com.cnvr.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cnvr.service.IConvertor;
import com.cnvr.util.ConversionUtility;

@Component
public class Temperature implements IConvertor {
	Logger log = LoggerFactory.getLogger(Temperature.class);

	@Override
	public double convertToMetric(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		log.info("Coversion in matirc ie Celsius..");
		return ConversionUtility.convertToCelsius(frmvalue);
	}

	@Override
	public double convertToImperial(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		log.info("Coversion in imperial ie Fahrenheit..");
		return ConversionUtility.convertToFahrenheit(frmvalue);
	}
}

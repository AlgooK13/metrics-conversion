package com.cnvr.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cnvr.constant.UnitConstants;
import com.cnvr.service.IConvertor;
import com.cnvr.util.ConversionUtility;

@Component
public class Length implements IConvertor {

	Logger log = LoggerFactory.getLogger(Length.class);

	@Override
	public double convertToMetric(double frmvalue, String unitType) {
		// TODO Auto-generated method stub

		double convetedUnit = 0;
		switch (unitType) {
		case "mm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthMMtoInch);
			break;
		case "cm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthCMtoInch);
			break;
		case "meter":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthMetertoYard);
			break;
		case "km":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthKmToMile);
			break;

		}
		return convetedUnit;
	}

	@Override
	public double convertToImperial(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		double convetedUnit = 0;
		switch (unitType) {
		case "in":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthInchToCM);
			break;
		case "ft":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthFtToM);
			break;
		case "yd":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthYardToM);
			break;
		case "mile":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.lengthMileToKm);
			break;
		}
		return convetedUnit;
	}

}

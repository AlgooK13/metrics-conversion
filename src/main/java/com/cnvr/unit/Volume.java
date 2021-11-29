package com.cnvr.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cnvr.constant.UnitConstants;
import com.cnvr.service.IConvertor;
import com.cnvr.util.ConversionUtility;

@Component
public class Volume implements IConvertor {

	static Logger log = LoggerFactory.getLogger(Volume.class);
	@Override
	public double convertToMetric(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		double convetedUnit = 0;
		switch (unitType) {
		case "cucm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeCucmToIn);
			break;
		case "cudecimeter":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeCuDeciToFt);
			break;
		case "cumeter":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeCuMeterToYard);
			break;
		case "liter":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeliterToPt);
			break;
		}
		return convetedUnit;
	}

	@Override
	public double convertToImperial(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		double convetedUnit = 0;
		switch (unitType) {
		case "cuInch":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeCuInToCm);
			break;
		case "cuft":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeCuFtToMeter);
			break;
		case "fluidOunce":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeFluidOunceToMl);
			break;
		case "gallon":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.volumeGallonToLtr);
			break;
		}
		return convetedUnit;
	}

}

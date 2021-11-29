package com.cnvr.unit;

import org.springframework.stereotype.Component;

import com.cnvr.constant.UnitConstants;
import com.cnvr.service.IConvertor;
import com.cnvr.util.ConversionUtility;

@Component
public class Mass implements IConvertor {

	@Override
	public double convertToMetric(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		double convetedUnit = 0;
		switch (unitType) {
		case "mg":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massMgtoGrain);
			break;
		case "gram":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massGramtoOz);
			break;
		case "kg":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massKgToLb);
			break;
		case "tonne":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massTonneToShTonne);
			break;
		}
		return convetedUnit;
	}

	@Override
	public double convertToImperial(double frmvalue, String unitType) {
		// TODO Auto-generated method stub

		double convetedUnit = 0;
		switch (unitType) {
		case "ounce":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massOunceToGram);
			break;
		case "pound":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massPoundToKg);
			break;
		case "stone":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massStoneToKg);
			break;
		case "cwt":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.massCwtToKg);
			break;

		}
		return convetedUnit;
	}

}

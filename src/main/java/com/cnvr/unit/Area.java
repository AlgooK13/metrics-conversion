package com.cnvr.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cnvr.constant.UnitConstants;
import com.cnvr.service.IConvertor;
import com.cnvr.util.ConversionUtility;

@Component
public class Area implements IConvertor {

	static Logger log = LoggerFactory.getLogger(Area.class);

	@Override
	public double convertToMetric(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		
		double convetedUnit = 0;
		switch (unitType) {
		case "sqcm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaCmToInSquire);
		    break;  

		case "sqm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaSqmToYard);
		    break;  

		case "hectare":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaHactToAcre);
		    break;  

		case "sqkm":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaSqkmToMile);
		    break;  

		}
		return convetedUnit;
	}

	@Override
	public double convertToImperial(double frmvalue, String unitType) {
		// TODO Auto-generated method stub
		double convetedUnit = 0;
		switch (unitType) {
		case "acre":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaAcreToM);
		    break;  

		case "sqinch":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaInTOCmSquire);
		    break;  

		case "sqft":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areaSqftToM);
		    break;  

		case "sqyd":
			convetedUnit = ConversionUtility.convertUnit(frmvalue, UnitConstants.areasqydToM);
		    break;  

		}
		return convetedUnit;
	}

	
}

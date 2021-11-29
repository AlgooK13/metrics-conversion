package com.cnvr.service;

public interface IConvertor {

	double convertToMetric(double frmvalue, String unitType);

	double convertToImperial(double frmvalue, String unitType);
}

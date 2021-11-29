package com.cnvr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnvr.unit.Area;
import com.cnvr.unit.Length;
import com.cnvr.unit.Mass;
import com.cnvr.unit.Temperature;
import com.cnvr.unit.Volume;

@Component
public class ConvertorServiceFactory {
	
	@Autowired
	private Area areaService;
	
	@Autowired
	private Length lengthService;
	
	@Autowired
	private Mass massService;
	
	@Autowired	
	private Temperature tempService;

	@Autowired
	private Volume volService;
	
	public IConvertor getConvertorService(final String unitType) {
		switch (unitType) {
		case "area":
			return areaService;
		case "length":
			return lengthService;
		case "mass":
			return massService;
		case "temp":
			return tempService;
		case "volume":
			return volService;
		}
		return null;
	}
}

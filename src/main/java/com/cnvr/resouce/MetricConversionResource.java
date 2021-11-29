package com.cnvr.resouce;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnvr.service.ConvertorServiceFactory;
import com.cnvr.service.IConvertor;

@RestController
@RequestMapping("/api/conversion")
public class MetricConversionResource {

	@PostMapping(path = "/")
	public String testResouce() {
		return "Hello World ..!";
	}

	static Logger log = LoggerFactory.getLogger(MetricConversionResource.class);

	@Autowired
	private ConvertorServiceFactory serviceFactory;

	private IConvertor consverion;

	@RequestMapping(value = "/matric/{unit}/{subUnit}/{unitValue}", method = RequestMethod.GET)
	public double conversionProcessMatic(@PathVariable String unit, @PathVariable String subUnit,
			@PathVariable double unitValue) {
		log.info("----------conversionProcessMatic-----------:" + unit + ": " + subUnit + " :" + unitValue);
		HashMap<String, String> resp = new HashMap<String, String>();
		consverion = serviceFactory.getConvertorService(unit);
		double unitResponse = consverion.convertToMetric(unitValue, subUnit);
		log.info(resp.toString());
		return unitResponse;
	}

	@RequestMapping(value = "/imperial/{unit}/{subUnit}/{unitValue}", method = RequestMethod.GET)
	public double conversionProcessImperial(@PathVariable String unit, @PathVariable String subUnit,
			@PathVariable double unitValue) {
		log.info("----------conversionProcessImperial-----------:" + unit + ": " + subUnit + " :" + unitValue);
		HashMap<String, String> resp = new HashMap<String, String>();
		consverion = serviceFactory.getConvertorService(unit);
		double unitResponse = consverion.convertToImperial(unitValue, subUnit);
		log.info(resp.toString());
		return unitResponse;
	}
	
	// new end-point can be introduce to return the combine output all possible conversion with one unit.
	
	
}

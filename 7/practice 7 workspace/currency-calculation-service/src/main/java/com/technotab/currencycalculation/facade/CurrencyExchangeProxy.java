package com.technotab.currencycalculation.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.technotab.currencycalculation.model.CalculatedAmount;

//@FeignClient(name="currency-exchange-service",url="http://localhost:8000/")
@FeignClient(name="currency-exchange-service")
@ribbonclient
public interface CurrencyExchangeProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CalculatedAmount retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) ;
}

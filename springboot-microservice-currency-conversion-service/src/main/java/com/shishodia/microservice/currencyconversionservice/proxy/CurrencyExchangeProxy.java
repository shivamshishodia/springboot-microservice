package com.shishodia.microservice.currencyconversionservice.proxy;

import com.shishodia.microservice.currencyconversionservice.bean.CurrencyConversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
public interface CurrencyExchangeProxy {
    
    // The below mapping is copied as is from `currency-exchange` microservice.
    // CurrencyConversion data members are super set of CurrencyExchange object.
    @GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}

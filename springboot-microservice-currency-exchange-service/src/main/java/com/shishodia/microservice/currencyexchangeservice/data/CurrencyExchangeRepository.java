package com.shishodia.microservice.currencyexchangeservice.data;

import com.shishodia.microservice.currencyexchangeservice.bean.CurrencyExchange;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);

}

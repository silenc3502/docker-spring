package com.example.singlebean.controller;

import com.example.singlebean.domain.FixedDepositDetails;
import com.example.singlebean.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}

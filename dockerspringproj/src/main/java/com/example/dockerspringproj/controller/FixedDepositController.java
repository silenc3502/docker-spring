package com.example.dockerspringproj.controller;

import com.example.dockerspringproj.domain.FixedDepositDetails;
import com.example.dockerspringproj.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}

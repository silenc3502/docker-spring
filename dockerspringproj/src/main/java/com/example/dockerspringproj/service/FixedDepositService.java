package com.example.dockerspringproj.service;

import com.example.dockerspringproj.dao.FixedDepositDao;
import com.example.dockerspringproj.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

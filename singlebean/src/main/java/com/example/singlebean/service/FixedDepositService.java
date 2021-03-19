package com.example.singlebean.service;

import com.example.singlebean.dao.FixedDepositDao;
import com.example.singlebean.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}

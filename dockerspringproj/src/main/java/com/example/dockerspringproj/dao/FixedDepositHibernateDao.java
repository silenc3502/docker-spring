package com.example.dockerspringproj.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.dockerspringproj.domain.FixedDepositDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FixedDepositHibernateDao implements FixedDepositDao {
	private static Logger logger = LogManager.getLogger(FixedDepositHibernateDao.class);

	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public FixedDepositHibernateDao() {
		logger.info("initializing");
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
}

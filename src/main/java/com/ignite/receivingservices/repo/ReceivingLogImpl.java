package com.ignite.receivingservices.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ignite.receivingservices.model.ReceivingLog;

public interface ReceivingLogImpl extends CrudRepository<ReceivingLog, Long>{
	ReceivingLog findByItemNbr(int itemNbr);
	}

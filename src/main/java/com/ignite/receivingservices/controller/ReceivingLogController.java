package com.ignite.receivingservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.receivingservices.model.ReceivingLog;
import com.ignite.receivingservices.model.SuperOverride;
import com.ignite.receivingservices.repo.ReceivingLogImpl;
import com.ignite.receivingservices.repo.SuperOverrideImpl;

@RestController
public class ReceivingLogController {

	@Autowired
	ReceivingLogImpl receivingRepo;
	
	@Autowired
	SuperOverrideImpl superOverrideImpl;
		
	@RequestMapping("/setitem")
	public ReceivingLog process(@RequestParam(value="item") int itemNbr){
		/*receivingRepo.save(new ReceivingLog("1234","Test",10,"TETSUPC"));*/
			return receivingRepo.findByItemNbr(itemNbr);
				
	}
	
	@RequestMapping("/setiteminfo")
	public String addItem(){
		ReceivingLog receivingLog = new ReceivingLog(1234,"Test",10,"TETSUPC");
		receivingRepo.save(receivingLog);
		return "Done";
	}
	
	@RequestMapping( method=RequestMethod.PUT, value="/update/{itemNbr}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ReceivingLog updateItemInfo( @RequestBody ReceivingLog  receivingLog){
		receivingRepo.save(receivingLog);
		return receivingLog ;

	}
	
	@RequestMapping("/setpoinfo")
	public String addPOReceipt(){
		SuperOverride superOverride = new SuperOverride();
		superOverride.setPoNbr(12345);
		superOverrideImpl.save(superOverride);
		return "Done";
	}
	
	
	}

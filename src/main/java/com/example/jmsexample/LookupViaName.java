package com.example.jmsexample;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

@Stateless
public class LookupViaName {

	@Resource(name = "java:/queue1")
	private Queue queue;

	public Queue getQueue() {
		return queue;
	}

}

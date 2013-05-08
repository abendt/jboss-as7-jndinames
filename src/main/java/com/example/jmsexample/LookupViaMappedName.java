package com.example.jmsexample;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

/**
 * @author Alphonse Bendt
 */
@Stateless
public class LookupViaMappedName {

    @Resource(mappedName = "java:/queue1")
    private Queue queue;

    public Queue getQueue() {
        return queue;
    }
}

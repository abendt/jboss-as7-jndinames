package com.example.jmsexample;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

/**
 * @author Alphonse Bendt
 */
@Stateless
public class LookupViaAliasMappedName {

    @Resource(mappedName = "LookupViaAliasMappedName")
    private Queue queue;

    public Queue getQueue() {
        return queue;
    }
}

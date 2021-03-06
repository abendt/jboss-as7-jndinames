package com.example.jmsexample;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

/**
 * @author Alphonse Bendt
 */
@Stateless
public class LookupViaAliasName {

    @Resource(name = "LookupViaAliasName")
    private Queue queue;

    public Queue getQueue() {
        return queue;
    }
}

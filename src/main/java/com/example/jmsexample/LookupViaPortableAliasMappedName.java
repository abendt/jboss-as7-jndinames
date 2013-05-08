package com.example.jmsexample;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;

/**
 * @author Alphonse Bendt
 */
@Stateless
public class LookupViaPortableAliasMappedName {

    @Resource(mappedName = "java:comp/env/LookupViaPortableAliasMappedName")
    private Queue queue;

    public Queue getQueue() {
        return queue;
    }
}

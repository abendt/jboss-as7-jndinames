package com.example.jmsexample;

import static org.junit.Assert.assertNotNull;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class LookupViaNameTest {
	@EJB
	private LookupViaName service;

	@Deployment
	public static JavaArchive createDeployment() {
		return DeploymentArchive.ARCHIVE;
	}

	@Test
	public void canLookupViaName() {
		assertNotNull(service.getQueue());
	}
}

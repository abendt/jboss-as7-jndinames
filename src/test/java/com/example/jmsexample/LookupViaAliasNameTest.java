package com.example.jmsexample;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import static org.junit.Assert.assertNotNull;

@RunWith(Arquillian.class)
public class LookupViaAliasNameTest {
	@EJB
	private LookupViaAliasName service;

	@Deployment
	public static JavaArchive createDeployment() {
		return DeploymentArchive.ARCHIVE;
	}

	@Test
	public void canLookupViaAliasName() {
		assertNotNull(service.getQueue());
	}
}

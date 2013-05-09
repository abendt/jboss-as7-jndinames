package com.example.jmsexample;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public interface DeploymentArchive {

	JavaArchive ARCHIVE = ShrinkWrap.create(JavaArchive.class, "test.jar")
			.addAsResource("META-INF/jboss-ejb3.xml")
			.addPackage(LookupViaAliasMappedName.class.getPackage());

}

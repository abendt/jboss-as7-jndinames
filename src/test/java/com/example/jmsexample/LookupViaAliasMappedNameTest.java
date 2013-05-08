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
public class LookupViaAliasMappedNameTest
{
   @EJB
   private LookupViaAliasMappedName service;

   @Deployment
   public static JavaArchive createDeployment()
   {
       JavaArchive javaArchive = ShrinkWrap.create(JavaArchive.class)
               .addAsResource("META-INF/jboss-ejb3.xml")
               .addClass(LookupViaAliasMappedName.class);

       return javaArchive;
   }

   @Test
   public void canLookupViaAliasMappedName()
   {
      assertNotNull(service.getQueue());
   }
}

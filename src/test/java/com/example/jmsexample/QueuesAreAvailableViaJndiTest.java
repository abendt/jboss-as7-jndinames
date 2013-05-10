package com.example.jmsexample;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Alphonse Bendt
 */
@RunWith(Arquillian.class)
public class QueuesAreAvailableViaJndiTest {

    @Deployment
    public static JavaArchive createDeployment() {
    	return DeploymentArchive.ARCHIVE;
    }

    private Context context;

    /**
     * https://docs.jboss.org/author/display/AS71/How+do+I+migrate+my+application+from+AS5+or+AS6+to+AS7
     */
    @Test
    public void canLookupProgramatically() throws Exception {

        context = new InitialContext();

        lookup("java:/queue1");

        // laut Doku sollte das hier funktionieren? 
        // ???  
        //lookup("java:jboss/queue1");
    }


    private void lookup(String name) {
        lookup(name, true);
    }

    private void lookup(String name, boolean shouldExist) {
        System.out.print("Lookup " + name + " => ");
        try {
            context.lookup(name);
            System.out.println("OK");

            assertTrue(shouldExist);
        } catch (NamingException e) {
            System.out.println("FAILED");
            assertFalse(shouldExist);
        }
    }
}

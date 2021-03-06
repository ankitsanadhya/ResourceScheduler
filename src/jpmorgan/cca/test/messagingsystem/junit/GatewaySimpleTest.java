package jpmorgan.cca.test.messagingsystem.junit;

import static org.junit.Assert.*;
import jpmorgan.cca.test.messagingsystem.Message;
import jpmorgan.cca.test.messagingsystem.impl.GatewaySimple;
import jpmorgan.cca.test.messagingsystem.impl.MessageImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GatewaySimpleTest {
	
	private GatewaySimple gateway;
	
	@Before
	public void setUp() throws Exception {
		gateway = new GatewaySimple();
	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * Test the send() method of GatewaySimple. The messasge's 
	 * isCompleted() method should return true afterwards.
	 */
	@Test
	public void testSend() {
		Message msg = new MessageImpl(1, "1");
		gateway.send(msg);
		assertTrue(msg.isCompleted());
	}

}

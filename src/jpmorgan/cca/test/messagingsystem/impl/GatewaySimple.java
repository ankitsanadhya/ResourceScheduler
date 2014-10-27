package jpmorgan.cca.test.messagingsystem.impl;

import jpmorgan.cca.test.messagingsystem.Gateway;
import jpmorgan.cca.test.messagingsystem.Message;

/***
 * A simple implementation of the Gateway interface.
 * @author buivuhoang
 *
 */
public class GatewaySimple implements Gateway {

	/***
	 * Very simple implementation of send(). Just call the method completed()
	 * of the Message object, without any further processing.
	 */
	@Override
	public void send(Message msg) {
		if (!msg.isCompleted())
			msg.completed();
	}

}

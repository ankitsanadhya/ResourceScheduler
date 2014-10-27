package jpmorgan.cca.test.messagingsystem.impl;

import jpmorgan.cca.test.messagingsystem.Message;
import jpmorgan.cca.test.messagingsystem.MessageFactory;

/***
 * A simple implementation of MessageFactory. Returns a new object of the requested 
 * class.
 * @author buivuhoang
 *
 */
public class MessageFactoryImpl extends MessageFactory {
	
	private int index = 0;
	
	/***
	 * Simple implementation of createMessage. Returns a new MessageImpl object
	 * with an increasing index number as the name.
	 */
	@Override
	public Message createMessage(String group) {
		index++;
		Message msg = new MessageImpl(index, group);
		return msg;
	}

	/***
	 * Simple implementation of createTerminationMessage. Returns a new MessageTermination 
	 * object
	 */
	@Override
	public Message createTerminationMessage(String group) {
		Message msg = new MessageTermination(group);
		return msg;
	}
}

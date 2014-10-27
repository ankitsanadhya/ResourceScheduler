package jpmorgan.cca.test.messagingsystem.impl;

import jpmorgan.cca.test.messagingsystem.Message;

/***
 * Simple implementation of Message. Contains a boolean to represent 
 * the state of "completed".
 * @author buivuhoang
 *
 */
public class MessageImpl extends Message {
	private volatile boolean completed = false;
	
	public MessageImpl() {
		super();
	}
	
	public MessageImpl(int index, String group) {
		super(index + "", group);
	}

	@Override
	public void completed() {
		completed = true;
	}

	@Override
	public boolean isCompleted() {
		return completed;
	}

}

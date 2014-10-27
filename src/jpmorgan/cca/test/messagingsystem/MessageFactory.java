package jpmorgan.cca.test.messagingsystem;

/***
 * The MessageFactory is a pure fabrication, in charge of creating 
 * Messages 
 * @author buivuhoang
 *
 */
public abstract class MessageFactory {
	/***
	 * This method returns a new message of the group.
	 * @param group
	 * @return new message
	 */
	public abstract Message createMessage(String group);
	
	/***
	 * This method a new termination message of the group
	 * @param group
	 * @return new termination message
	 */
	public abstract Message createTerminationMessage(String group);
}

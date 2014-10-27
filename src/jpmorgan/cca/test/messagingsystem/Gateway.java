package jpmorgan.cca.test.messagingsystem;

/***
 * The Gateway interface represents the final destination that 
 * messages should be sent to. 
 * @author buivuhoang
 *
 */
public interface Gateway {
	/***
	 * Foward the message to the gateway
	 */
	public void send(Message msg);
}

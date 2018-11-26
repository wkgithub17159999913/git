package pojo;

public class WeatherStatusMessages {
	private	String btteryVoltage;
	private	String aCDCVlotage;
	private	String mainMainBoardVlotage;
	private	String selfDetectingStatus;
	private	String receiver;
	private	String sender;
	private	String windowPollution;
	public String getBtteryVoltage() {
		return btteryVoltage;
	}
	public void setBtteryVoltage(String btteryVoltage) {
		this.btteryVoltage = btteryVoltage;
	}
	public String getaCDCVlotage() {
		return aCDCVlotage;
	}
	public void setaCDCVlotage(String aCDCVlotage) {
		this.aCDCVlotage = aCDCVlotage;
	}
	public String getMainMainBoardVlotage() {
		return mainMainBoardVlotage;
	}
	public void setMainMainBoardVlotage(String mainMainBoardVlotage) {
		this.mainMainBoardVlotage = mainMainBoardVlotage;
	}
	public String getSelfDetectingStatus() {
		return selfDetectingStatus;
	}
	public void setSelfDetectingStatus(String selfDetectingStatus) {
		this.selfDetectingStatus = selfDetectingStatus;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getWindowPollution() {
		return windowPollution;
	}
	public void setWindowPollution(String windowPollution) {
		this.windowPollution = windowPollution;
	}
	public WeatherStatusMessages(String btteryVoltage, String aCDCVlotage, String mainMainBoardVlotage,
			String selfDetectingStatus, String receiver, String sender, String windowPollution) {
		super();
		this.btteryVoltage = btteryVoltage;
		this.aCDCVlotage = aCDCVlotage;
		this.mainMainBoardVlotage = mainMainBoardVlotage;
		this.selfDetectingStatus = selfDetectingStatus;
		this.receiver = receiver;
		this.sender = sender;
		this.windowPollution = windowPollution;
	}
	public WeatherStatusMessages() {
		super();
	}
	
}

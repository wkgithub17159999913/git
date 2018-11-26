package pojo;

public class VisibilityStatusMessages {
	private String acDcVoltage;
	private String selfDetectingStatus;
	private String receiver;
	private String sender;
	private String windowPollution;
	public String getAcDcVoltage() {
		return acDcVoltage;
	}
	public void setAcDcVoltage(String acDcVoltage) {
		this.acDcVoltage = acDcVoltage;
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
	public VisibilityStatusMessages(String acDcVoltage, String selfDetectingStatus, String receiver, String sender,
			String windowPollution) {
		super();
		this.acDcVoltage = acDcVoltage;
		this.selfDetectingStatus = selfDetectingStatus;
		this.receiver = receiver;
		this.sender = sender;
		this.windowPollution = windowPollution;
	}
	public VisibilityStatusMessages() {
		super();
	}
	
}

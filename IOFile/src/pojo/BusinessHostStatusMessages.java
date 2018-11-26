package pojo;

public class BusinessHostStatusMessages {
	private String time;
	private String totalMemory;
	private String currentuseMemory;
	private String currentUseCPUUtilization;
	private String currentDiskTotalMemory;
	private String currentDiskResidueMemory;
	private String retain;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTotalMemory() {
		return totalMemory;
	}
	public void setTotalMemory(String totalMemory) {
		this.totalMemory = totalMemory;
	}
	public String getCurrentuseMemory() {
		return currentuseMemory;
	}
	public void setCurrentuseMemory(String currentuseMemory) {
		this.currentuseMemory = currentuseMemory;
	}
	public String getCurrentUseCPUUtilization() {
		return currentUseCPUUtilization;
	}
	public void setCurrentUseCPUUtilization(String currentUseCPUUtilization) {
		this.currentUseCPUUtilization = currentUseCPUUtilization;
	}
	public String getCurrentDiskTotalMemory() {
		return currentDiskTotalMemory;
	}
	public void setCurrentDiskTotalMemory(String currentDiskTotalMemory) {
		this.currentDiskTotalMemory = currentDiskTotalMemory;
	}
	public String getCurrentDiskResidueMemory() {
		return currentDiskResidueMemory;
	}
	public void setCurrentDiskResidueMemory(String currentDiskResidueMemory) {
		this.currentDiskResidueMemory = currentDiskResidueMemory;
	}
	public String getRetain() {
		return retain;
	}
	public void setRetain(String retain) {
		this.retain = retain;
	}
	public BusinessHostStatusMessages(String time, String totalMemory, String currentuseMemory,
			String currentUseCPUUtilization, String currentDiskTotalMemory, String currentDiskResidueMemory,
			String retain) {
		super();
		this.time = time;
		this.totalMemory = totalMemory;
		this.currentuseMemory = currentuseMemory;
		this.currentUseCPUUtilization = currentUseCPUUtilization;
		this.currentDiskTotalMemory = currentDiskTotalMemory;
		this.currentDiskResidueMemory = currentDiskResidueMemory;
		this.retain = retain;
	}
	public BusinessHostStatusMessages() {
		super();
	}
}

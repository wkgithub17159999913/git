package pojo;

public class VisibilityBasicParameter {
	private String dsid;
	private String year;
	private String month;
	private String day;
	private String longiutude;
	private String latitude;
	private String fieldAltitude;
	private String airSensorAltitude;
	private String serverType;
	private String deviceLogo;
	private String deviceId;
	private String retain;
	public String getDsid() {
		return dsid;
	}
	public void setDsid(String dsid) {
		this.dsid = dsid;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getLongiutude() {
		return longiutude;
	}
	public void setLongiutude(String longiutude) {
		this.longiutude = longiutude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getFieldAltitude() {
		return fieldAltitude;
	}
	public void setFieldAltitude(String fieldAltitude) {
		this.fieldAltitude = fieldAltitude;
	}
	public String getAirSensorAltitude() {
		return airSensorAltitude;
	}
	public void setAirSensorAltitude(String airSensorAltitude) {
		this.airSensorAltitude = airSensorAltitude;
	}
	public String getServerType() {
		return serverType;
	}
	public void setServerType(String serverType) {
		this.serverType = serverType;
	}
	public String getDeviceLogo() {
		return deviceLogo;
	}
	public void setDeviceLogo(String deviceLogo) {
		this.deviceLogo = deviceLogo;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getRetain() {
		return retain;
	}
	public void setRetain(String retain) {
		this.retain = retain;
	}
	public VisibilityBasicParameter(String dsid, String year, String month, String day, String longiutude,
			String latitude, String fieldAltitude, String airSensorAltitude, String serverType, String deviceLogo,
			String deviceId, String retain) {
		super();
		this.dsid = dsid;
		this.year = year;
		this.month = month;
		this.day = day;
		this.longiutude = longiutude;
		this.latitude = latitude;
		this.fieldAltitude = fieldAltitude;
		this.airSensorAltitude = airSensorAltitude;
		this.serverType = serverType;
		this.deviceLogo = deviceLogo;
		this.deviceId = deviceId;
		this.retain = retain;
	}
	public VisibilityBasicParameter() {
		super();
	}
}

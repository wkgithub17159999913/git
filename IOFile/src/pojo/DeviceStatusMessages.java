package pojo;

public class DeviceStatusMessages {
	private Integer dsid;
	private String year;
	private String month;
	private String day;
	private String longiutude;
	private String latitude;
	private Integer altitude;
	private String typeStatusLogo;
	private String mainControllerLogo;
	private String earthControllerLogo;
	private String humiControllerLogo;
	private String cFDeviceLogo;
	private String sensorLogo;
	private String version;
	public Integer getDsid() {
		return dsid;
	}
	public void setDsid(Integer dsid) {
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
	public Integer getAltitude() {
		return altitude;
	}
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}
	public String getTypeStatusLogo() {
		return typeStatusLogo;
	}
	public void setTypeStatusLogo(String typeStatusLogo) {
		this.typeStatusLogo = typeStatusLogo;
	}
	public String getMainControllerLogo() {
		return mainControllerLogo;
	}
	public void setMainControllerLogo(String mainControllerLogo) {
		this.mainControllerLogo = mainControllerLogo;
	}
	public String getEarthControllerLogo() {
		return earthControllerLogo;
	}
	public void setEarthControllerLogo(String earthControllerLogo) {
		this.earthControllerLogo = earthControllerLogo;
	}
	public String getHumiControllerLogo() {
		return humiControllerLogo;
	}
	public void setHumiControllerLogo(String humiControllerLogo) {
		this.humiControllerLogo = humiControllerLogo;
	}
	public String getcFDeviceLogo() {
		return cFDeviceLogo;
	}
	public void setcFDeviceLogo(String cFDeviceLogo) {
		this.cFDeviceLogo = cFDeviceLogo;
	}
	public String getSensorLogo() {
		return sensorLogo;
	}
	public void setSensorLogo(String sensorLogo) {
		this.sensorLogo = sensorLogo;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public DeviceStatusMessages(Integer dsid, String year, String month, String day, String longiutude, String latitude,
			Integer altitude, String typeStatusLogo, String mainControllerLogo, String earthControllerLogo,
			String humiControllerLogo, String cFDeviceLogo, String sensorLogo, String version) {
		super();
		this.dsid = dsid;
		this.year = year;
		this.month = month;
		this.day = day;
		this.longiutude = longiutude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.typeStatusLogo = typeStatusLogo;
		this.mainControllerLogo = mainControllerLogo;
		this.earthControllerLogo = earthControllerLogo;
		this.humiControllerLogo = humiControllerLogo;
		this.cFDeviceLogo = cFDeviceLogo;
		this.sensorLogo = sensorLogo;
		this.version = version;
	}
	public DeviceStatusMessages() {
		super();
	}
}

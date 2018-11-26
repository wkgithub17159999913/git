package pojo;

public class BusinessHostBasicParameter {
	private String dsid;
	private String year;
	private String month;
	private String day;
	private String longiutude;
	private String latitude;
	private String fieldAltitude;
	private String airSensorAltitude;
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
	public BusinessHostBasicParameter(String dsid, String year, String month, String day, String longiutude,
			String latitude, String fieldAltitude, String airSensorAltitude) {
		super();
		this.dsid = dsid;
		this.year = year;
		this.month = month;
		this.day = day;
		this.longiutude = longiutude;
		this.latitude = latitude;
		this.fieldAltitude = fieldAltitude;
		this.airSensorAltitude = airSensorAltitude;
	}
	public BusinessHostBasicParameter() {
		super();
	}
}

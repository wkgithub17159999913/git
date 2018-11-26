package serviceInterface;

import pojo.BusinessHostBasicParameter;
import pojo.BusinessHostStatusMessages;
import pojo.DeviceStatusMessages;
import pojo.DeviceWorkStatus;
import pojo.RadiationBasicParameter;
import pojo.RadiationStatusMessages;
import pojo.VisibilityBasicParameter;
import pojo.VisibilityStatusMessages;
import pojo.WeatherBasicParameter;
import pojo.WeatherStatusMessages;

public interface InsertServiceInterface {
	/**
	 * 设备信息表
	 * @param sm
	 */
	void insertDeviceStatusMessages(DeviceStatusMessages dsm);
	void insertDeviceWorkStatus(DeviceWorkStatus dws);
	/**
	 * 能见度信息表
	 * @param bvp
	 */
	void insertVisibilityBasicParameter(VisibilityBasicParameter vbp);
	void insertVisibilityStatusMessages(VisibilityStatusMessages vsm);
	/**
	 * 天气信息表
	 * @param wbp
	 */
	void insertWeatherBasicParameter(WeatherBasicParameter wbp);
	void insertWeatherStatusMessages(WeatherStatusMessages wsm);
	/**
	 * 辐射信息表
	 * @param rbp
	 */
	void insertRadiationBasicParameter(RadiationBasicParameter rbp);
	void insertRadiationStatusMessages(RadiationStatusMessages rsm);
	/**
	 * 业务主机信息表
	 * @param bhbp
	 */
	void insertBusinessHostBasicParameter(BusinessHostBasicParameter bhbp);
	void insertBusinessHostStatusMessages(BusinessHostStatusMessages bhsm);
	
}

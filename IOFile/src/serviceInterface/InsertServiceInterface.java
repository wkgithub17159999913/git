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
	 * �豸��Ϣ��
	 * @param sm
	 */
	void insertDeviceStatusMessages(DeviceStatusMessages dsm);
	void insertDeviceWorkStatus(DeviceWorkStatus dws);
	/**
	 * �ܼ�����Ϣ��
	 * @param bvp
	 */
	void insertVisibilityBasicParameter(VisibilityBasicParameter vbp);
	void insertVisibilityStatusMessages(VisibilityStatusMessages vsm);
	/**
	 * ������Ϣ��
	 * @param wbp
	 */
	void insertWeatherBasicParameter(WeatherBasicParameter wbp);
	void insertWeatherStatusMessages(WeatherStatusMessages wsm);
	/**
	 * ������Ϣ��
	 * @param rbp
	 */
	void insertRadiationBasicParameter(RadiationBasicParameter rbp);
	void insertRadiationStatusMessages(RadiationStatusMessages rsm);
	/**
	 * ҵ��������Ϣ��
	 * @param bhbp
	 */
	void insertBusinessHostBasicParameter(BusinessHostBasicParameter bhbp);
	void insertBusinessHostStatusMessages(BusinessHostStatusMessages bhsm);
	
}

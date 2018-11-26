package utils;

import java.io.File;
import java.util.List;

import constant.BusinessHostBasicParameterConstant;
import constant.BusinessHostStatusMessagesConstant;
import constant.DeviceStatusMessagesConstant;
import constant.DeviceWorkStatusConstant;
import constant.RadiationBasicParameterConstant;
import constant.RadiationStatusMessagesConstant;
import constant.VisibilityBasicParameterConstant;
import constant.VisibilityStatusMessagesConstant;
import constant.WeatherBasicParameterConstant;
import constant.WeatherStatusMessagesConstant;
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
import serviceInterface.InsertServiceInterface;
import serviceinterfaceimpl.InsertServiceInterfaceImpl;

public class TranslateFile {
	private static InsertServiceInterface insert = new InsertServiceInterfaceImpl();
	public static void main(String[] args) {
		getTranslateFilesAWS("F:\\work\\d");
	}
	
	/**
	 * 设备基本信息
	 * AWS_M_ST__58361_20181010第一行数据
	 * @param path
	 */
	
	static void getTranslateFilesAWS(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		//遍历所有文件单独操作
		for (File file : fileSort) {
			//根据文件绝对路径获取文件内容
			String fileContent = InPutStreamFileContent.getFileContent(file.toString());
			//将获取的文本内容进行切割
			Integer dsid = Integer.valueOf(fileContent.substring(DeviceStatusMessagesConstant.DSID_START, DeviceStatusMessagesConstant.DSID_END));
			String year = fileContent.substring(DeviceStatusMessagesConstant.YEAR_START, DeviceStatusMessagesConstant.YEAR_END);
			String month = fileContent.substring(DeviceStatusMessagesConstant.MONTH_START, DeviceStatusMessagesConstant.MONTH_END);
			String day =fileContent.substring(DeviceStatusMessagesConstant.DAY_START,DeviceStatusMessagesConstant.DAY_END);
			String longiutude =fileContent.substring(DeviceStatusMessagesConstant.LONGIUTUDE_START,DeviceStatusMessagesConstant.LONGIUTUDE_END);
			String latitude =fileContent.substring(DeviceStatusMessagesConstant.LATITUDE_START,DeviceStatusMessagesConstant.LATITUDE_END);
			Integer altitude =Integer.valueOf(fileContent.substring(DeviceStatusMessagesConstant.ALTITUDE_START,DeviceStatusMessagesConstant.ALTITUDE_END).trim());
			String typeStatus = fileContent.substring(DeviceStatusMessagesConstant.TYPESTATUS_START,DeviceStatusMessagesConstant.TYPESTATUS_END);
			String mainController = fileContent.substring(DeviceStatusMessagesConstant.MAINCONTROLLER_START,DeviceStatusMessagesConstant.MAINCONTROLLER_END);
			String earthController = fileContent.substring(DeviceStatusMessagesConstant.EARTHCONTROLLER_START,DeviceStatusMessagesConstant.EARTHCONTROLLER_END);
			String humiController = fileContent.substring(DeviceStatusMessagesConstant.HUMICONTROLLER_START,DeviceStatusMessagesConstant.HUMICONTROLLER_END);
			String cFDevice = fileContent.substring(DeviceStatusMessagesConstant.CFEDVICE_START,DeviceStatusMessagesConstant.CFEDVICE_END);
			String sensor = fileContent.substring(DeviceStatusMessagesConstant.SENSOR_START,DeviceStatusMessagesConstant.SENSOR_END);
			String version =fileContent.substring(DeviceStatusMessagesConstant.VERSION_START,DeviceStatusMessagesConstant.VERSION_END);
			DeviceStatusMessages sm = new DeviceStatusMessages(dsid, year, month, day, longiutude, latitude, altitude, typeStatus, mainController, earthController, humiController, cFDevice, sensor, version);
			//保存到数据库
			insert.insertDeviceStatusMessages(sm);
		}
	}
	/**
	 * 设备状态信息
	 * AWS_M_ST__58361_20181010第二行开始的数据
	 * @param path
	 */
	static void getTranslateFilesAWSSecond(String path) {
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		String time;
		String maincontrollerRunStatus;
		String maincontrollerProwerVoltage;
		String maincontrollerProwerType;
		String maincontrollerTemperature;
		String maincontrollerADStatus;
		String maincontrollerCounterStatus;
		String maincontrollerCFStatus;
		String maincontrollerCFFree;
		String retain10;
		String maincontrollerDoorStatus;
		String maincontrollerLANStatus;
		String maincontrollerRS232_RS485Status;
		String CANBusStatus;
		String retain15;
		String retain16;
		String retain17;
		String retain18;
		String retain19;
		String retain20;
		String retain21;
		String retain22;
		String retain23;
		String retain24;
		String retain25;
		String retain26;
		String earthcontrollerRunStatus;
		String earthcontrollerPowerVoltage;
		String earthcontrollerPowerType;
		String earthcontrollerTemperature;
		String earthcontrollerADStatus;
		String earthcontrollerCounterStatus;
		String retain33;
		String retain34;
		String retain35;
		String retain36;
		String retain37;
		String retain38;
		String retain39;
		String retain40;
		String retain41;
		String retain42;
		String retain43;
		String retain44;
		String humisensorRunStatus;
		String retain46;
		String retain47;
		String retain48;
		String retain49;
		String retain50;
		String sensorRunStatus;
		String evaporationHeight;
		String precipitationLevel;
		String retain54;
		DeviceWorkStatus ws =null;
		for (File file : fileSort) {
			List<String> fileContent = InPutStreamFileContent.getFileContentSecond(file.toString());
			for (String string : fileContent) {
				time = string.substring(DeviceWorkStatusConstant.TIME_START, DeviceWorkStatusConstant.TIME_END);
				maincontrollerRunStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_RUN_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_RUN_STATUS_END);
				maincontrollerProwerVoltage = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_POWER_VOLTAGE_START,DeviceWorkStatusConstant.MAINCONTROLLER_POWER_VOLTAGE_END);
				maincontrollerProwerType = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_POWER_TYPE_START, DeviceWorkStatusConstant.MAINCONTROLLER_POWER_TYPE_END);		
				maincontrollerTemperature = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_TEMPERATURE_START, DeviceWorkStatusConstant.MAINCONTROLLER_TEMPERATURE_END);		
				maincontrollerADStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_AD_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_AD_STATUS_END);
				maincontrollerCounterStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_COUNTER_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_COUNTER_STATUS_END);
				maincontrollerCFStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_CF_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_CF_STATUS_END);
				maincontrollerCFFree = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_CF_FREE_START, DeviceWorkStatusConstant.MAINCONTROLLER_CF_FREE_END);
				retain10 = string.substring(DeviceWorkStatusConstant.RETAIN_10_START, DeviceWorkStatusConstant.RETAIN_10_END);
				maincontrollerDoorStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_DOOR_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_DOOR_STATUS_END);
				maincontrollerLANStatus = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_LAN_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_LAN_STATUS_END);
				maincontrollerRS232_RS485Status = string.substring(DeviceWorkStatusConstant.MAINCONTROLLER_RS232_RS485_STATUS_START, DeviceWorkStatusConstant.MAINCONTROLLER_RS232_RS485_STATUS_END);
				CANBusStatus = string.substring(DeviceWorkStatusConstant.CAN_BUS_STATUS_START, DeviceWorkStatusConstant.CAN_BUS_STATUS_END);
				retain15 = string.substring(DeviceWorkStatusConstant.RETAIN_15_START, DeviceWorkStatusConstant.RETAIN_15_END);
				retain16 = string.substring(DeviceWorkStatusConstant.RETAIN_16_START, DeviceWorkStatusConstant.RETAIN_16_END);
				retain17 = string.substring(DeviceWorkStatusConstant.RETAIN_17_START, DeviceWorkStatusConstant.RETAIN_17_END);
				retain18 = string.substring(DeviceWorkStatusConstant.RETAIN_18_START, DeviceWorkStatusConstant.RETAIN_18_END);
				retain19 = string.substring(DeviceWorkStatusConstant.RETAIN_19_START, DeviceWorkStatusConstant.RETAIN_19_END);
				retain20 = string.substring(DeviceWorkStatusConstant.RETAIN_20_START, DeviceWorkStatusConstant.RETAIN_20_END);
				retain21 = string.substring(DeviceWorkStatusConstant.RETAIN_21_START, DeviceWorkStatusConstant.RETAIN_21_END);
				retain22 = string.substring(DeviceWorkStatusConstant.RETAIN_22_START, DeviceWorkStatusConstant.RETAIN_22_END);
				retain23 = string.substring(DeviceWorkStatusConstant.RETAIN_23_START, DeviceWorkStatusConstant.RETAIN_23_END);			
				retain24 = string.substring(DeviceWorkStatusConstant.RETAIN_24_START, DeviceWorkStatusConstant.RETAIN_24_END);		
				retain25 = string.substring(DeviceWorkStatusConstant.RETAIN_25_START, DeviceWorkStatusConstant.RETAIN_25_END);
				retain26 = string.substring(DeviceWorkStatusConstant.RETAIN_26_START, DeviceWorkStatusConstant.RETAIN_26_END);
				earthcontrollerRunStatus = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_RUN_STATUS_START, DeviceWorkStatusConstant.EARTHCONTROLLER_RUN_STATUS_END);
				earthcontrollerPowerVoltage = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_POWER_VOLTAGE_START, DeviceWorkStatusConstant.EARTHCONTROLLER_POWER_VOLTAGE_END);
				earthcontrollerPowerType = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_POWER_TYPE_START, DeviceWorkStatusConstant.EARTHCONTROLLER_POWER_TYPE_END);
				earthcontrollerTemperature = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_TEMPERATURE_START, DeviceWorkStatusConstant.EARTHCONTROLLER_TEMPERATURE_END);
				earthcontrollerADStatus = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_AD_STATUS_START, DeviceWorkStatusConstant.EARTHCONTROLLER_AD_STATUS_END);
				earthcontrollerCounterStatus = string.substring(DeviceWorkStatusConstant.EARTHCONTROLLER_COUNTER_STATUS_START, DeviceWorkStatusConstant.EARTHCONTROLLER_COUNTER_STATUS_END);
				retain33 = string.substring(DeviceWorkStatusConstant.RETAIN_33_START, DeviceWorkStatusConstant.RETAIN_33_END);
				retain34 = string.substring(DeviceWorkStatusConstant.RETAIN_34_START, DeviceWorkStatusConstant.RETAIN_34_END);
				retain35 = string.substring(DeviceWorkStatusConstant.RETAIN_35_START, DeviceWorkStatusConstant.RETAIN_35_END);
				retain36 = string.substring(DeviceWorkStatusConstant.RETAIN_36_START, DeviceWorkStatusConstant.RETAIN_36_END);
				retain37 = string.substring(DeviceWorkStatusConstant.RETAIN_37_START, DeviceWorkStatusConstant.RETAIN_37_END);
				retain38 = string.substring(DeviceWorkStatusConstant.RETAIN_38_START, DeviceWorkStatusConstant.RETAIN_38_END);
				retain39 = string.substring(DeviceWorkStatusConstant.RETAIN_39_START, DeviceWorkStatusConstant.RETAIN_39_END);
				retain40 = string.substring(DeviceWorkStatusConstant.RETAIN_40_START, DeviceWorkStatusConstant.RETAIN_40_END);
				retain41 = string.substring(DeviceWorkStatusConstant.RETAIN_41_START, DeviceWorkStatusConstant.RETAIN_41_END);
				retain42 = string.substring(DeviceWorkStatusConstant.RETAIN_42_START, DeviceWorkStatusConstant.RETAIN_42_END);
				retain43 = string.substring(DeviceWorkStatusConstant.RETAIN_43_START, DeviceWorkStatusConstant.RETAIN_43_END);
				retain44 = string.substring(DeviceWorkStatusConstant.RETAIN_44_START, DeviceWorkStatusConstant.RETAIN_44_END);
				humisensorRunStatus = string.substring(DeviceWorkStatusConstant.HUMISENSOR_RUN_STATUS_START, DeviceWorkStatusConstant.HUMISENSOR_RUN_STATUS_END);
				retain46 = string.substring(DeviceWorkStatusConstant.RETAIN_46_START, DeviceWorkStatusConstant.RETAIN_46_END);
				retain47 = string.substring(DeviceWorkStatusConstant.RETAIN_47_START, DeviceWorkStatusConstant.RETAIN_47_END);
				retain48 = string.substring(DeviceWorkStatusConstant.RETAIN_48_START, DeviceWorkStatusConstant.RETAIN_48_END);
				retain49 = string.substring(DeviceWorkStatusConstant.RETAIN_49_START, DeviceWorkStatusConstant.RETAIN_49_END);
				retain50 = string.substring(DeviceWorkStatusConstant.RETAIN_50_START, DeviceWorkStatusConstant.RETAIN_50_END);
				sensorRunStatus = string.substring(DeviceWorkStatusConstant.SENSOR_RUN_STATUS_START, DeviceWorkStatusConstant.SENSOR_RUN_STATUS_END);
				evaporationHeight = string.substring(DeviceWorkStatusConstant.EVAPORATION_HEIGHT_START, DeviceWorkStatusConstant.EVAPORATION_HEIGHT_END);
				precipitationLevel = string.substring(DeviceWorkStatusConstant.PRECIPITATION_LEVEL_START, DeviceWorkStatusConstant.PRECIPITATION_LEVEL_END);
				retain54 = string.substring(DeviceWorkStatusConstant.RETAIN_54_START, DeviceWorkStatusConstant.RETAIN_54_END);
				ws = new DeviceWorkStatus(time, maincontrollerRunStatus, maincontrollerProwerVoltage, maincontrollerProwerType, maincontrollerTemperature, maincontrollerADStatus, maincontrollerCounterStatus, maincontrollerCFStatus, maincontrollerCFFree, retain10, maincontrollerDoorStatus, maincontrollerLANStatus, maincontrollerRS232_RS485Status, CANBusStatus, retain15, retain16, retain17, retain18, retain19, retain20, retain21, retain22, retain23, retain24, retain25, retain26, earthcontrollerRunStatus, earthcontrollerPowerVoltage, earthcontrollerPowerType, earthcontrollerTemperature, earthcontrollerADStatus, earthcontrollerCounterStatus, retain33, retain34, retain35, retain36, retain37, retain38, retain39, retain40, retain41, retain42, retain43, retain44, humisensorRunStatus, retain46, retain47, retain48, retain49, retain50, sensorRunStatus, evaporationHeight, precipitationLevel, retain54);
				insert.insertDeviceWorkStatus(ws);
			}
		}
	}
	/**
	 * 能见度基本信息
	 * @param path
	 */
	static void getTranslateFilesVisibility(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		//遍历所有文件单独操作
		for (File file : fileSort) {
			//根据文件绝对路径获取文件内容
			String fileContent = InPutStreamFileContent.getFileContent(file.toString());
			//将获取的文本内容进行切割
			String dsid = fileContent.substring(VisibilityBasicParameterConstant.DSID_START, VisibilityBasicParameterConstant.DSID_END);
			String year = fileContent.substring(VisibilityBasicParameterConstant.YEAR_START, VisibilityBasicParameterConstant.YEAR_END);
			String month = fileContent.substring(VisibilityBasicParameterConstant.MONTH_START, VisibilityBasicParameterConstant.MONTH_END);
			String day =fileContent.substring(VisibilityBasicParameterConstant.DAY_START,VisibilityBasicParameterConstant.DAY_END);
			String longiutude =fileContent.substring(VisibilityBasicParameterConstant.LONGIUTUDE_START,VisibilityBasicParameterConstant.LONGIUTUDE_END);
			String latitude =fileContent.substring(VisibilityBasicParameterConstant.LATITUDE_START,VisibilityBasicParameterConstant.LATITUDE_END);
			String fieldAltitude =fileContent.substring(VisibilityBasicParameterConstant.FIELD_ALTITUDE_START,VisibilityBasicParameterConstant.FIELD_ALTITUDE_END);
			String airSensorAltitude = fileContent.substring(VisibilityBasicParameterConstant.AIR_SENSOR_ALTITUDE_START,VisibilityBasicParameterConstant.AIR_SENSOR_ALTITUDE_END);
			String serverType = fileContent.substring(VisibilityBasicParameterConstant.SERVE_TYPE_START,VisibilityBasicParameterConstant.SERVE_TYPE_END);
			String deviceLogo = fileContent.substring(VisibilityBasicParameterConstant.DEVICE_LOGO_START,VisibilityBasicParameterConstant.DEVICE_LOGO_END);
			String deviceId = fileContent.substring(VisibilityBasicParameterConstant.DEVICE_ID_START,VisibilityBasicParameterConstant.DEVICE_ID_END);
			String retain = fileContent.substring(VisibilityBasicParameterConstant.RETAIN_START,VisibilityBasicParameterConstant.RETAIN_END);
			VisibilityBasicParameter bvp = new VisibilityBasicParameter(dsid, year, month, day, longiutude, latitude, fieldAltitude, airSensorAltitude, serverType, deviceLogo, deviceId, retain);
			insert.insertVisibilityBasicParameter(bvp);	
		}
	}
	/**
	 * 能见度状态信息
	 * @param path
	 */
	static void getTranslateFilesVisibilitySecond(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		for (File file : fileSort) {
			List<String> fileContent = InPutStreamFileContent.getFileContentSecond(file.toString());
			for (String string : fileContent) {
				String acDcVoltage=string.substring(VisibilityStatusMessagesConstant.AC_DC_VOLTAGE_START,VisibilityStatusMessagesConstant.AC_DC_VOLTAGE_END);
				String selfDetectingStatus=string.substring(VisibilityStatusMessagesConstant.SELF_DETECTING_STATUS_START,VisibilityStatusMessagesConstant.SELF_DETECTING_STATUS_END);
				String receiver=string.substring(VisibilityStatusMessagesConstant.RECEIVER_START, VisibilityStatusMessagesConstant.RECEIVER_END);
				String sender=string.substring(VisibilityStatusMessagesConstant.SENDER_START,VisibilityStatusMessagesConstant.SENDER_END);
				String windowPollution=string.substring(VisibilityStatusMessagesConstant.WINDOW_POLLUTION_START,VisibilityStatusMessagesConstant.WINDOW_POLLUTION_END);
				VisibilityStatusMessages vsm = new VisibilityStatusMessages(acDcVoltage, selfDetectingStatus, receiver, sender, windowPollution);
				insert.insertVisibilityStatusMessages(vsm);
			}
		}
	}
	/**
	 * 天气基本信息
	 * @param path
	 */
	static void getTranslateFilesWeather(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		//遍历所有文件单独操作
		for (File file : fileSort) {
			//根据文件绝对路径获取文件内容
			String fileContent = InPutStreamFileContent.getFileContent(file.toString());
			//将获取的文本内容进行切割
			String dsid = fileContent.substring(WeatherBasicParameterConstant.DSID_START, WeatherBasicParameterConstant.DSID_END);
			String year = fileContent.substring(WeatherBasicParameterConstant.YEAR_START, WeatherBasicParameterConstant.YEAR_END);
			String month = fileContent.substring(WeatherBasicParameterConstant.MONTH_START, WeatherBasicParameterConstant.MONTH_END);
			String day =fileContent.substring(WeatherBasicParameterConstant.DAY_START,WeatherBasicParameterConstant.DAY_END);
			String longiutude =fileContent.substring(WeatherBasicParameterConstant.LONGIUTUDE_START,WeatherBasicParameterConstant.LONGIUTUDE_END);
			String latitude =fileContent.substring(WeatherBasicParameterConstant.LATITUDE_START,WeatherBasicParameterConstant.LATITUDE_END);
			String fieldAltitude =fileContent.substring(WeatherBasicParameterConstant.FIELD_ALTITUDE_START,WeatherBasicParameterConstant.FIELD_ALTITUDE_END);
			String airSensorAltitude = fileContent.substring(WeatherBasicParameterConstant.AIR_SENSOR_ALTITUDE_START,WeatherBasicParameterConstant.AIR_SENSOR_ALTITUDE_END);
			String serverType = fileContent.substring(WeatherBasicParameterConstant.SERVE_TYPE_START,WeatherBasicParameterConstant.SERVE_TYPE_END);
			String deviceLogo = fileContent.substring(WeatherBasicParameterConstant.DEVICE_LOGO_START,WeatherBasicParameterConstant.DEVICE_LOGO_END);
			String deviceId = fileContent.substring(WeatherBasicParameterConstant.DEVICE_ID_START,WeatherBasicParameterConstant.DEVICE_ID_END);
			String retain = fileContent.substring(WeatherBasicParameterConstant.RETAIN_START,WeatherBasicParameterConstant.RETAIN_END);
			WeatherBasicParameter wbp = new WeatherBasicParameter(dsid, year, month, day, longiutude, latitude, fieldAltitude, airSensorAltitude, serverType, deviceLogo, deviceId, retain);
			insert.insertWeatherBasicParameter(wbp);
		}
	}
	/**
	 * 天气状态信息
	 * @param path
	 */
	static void getTranslateFilesWeatherSecond(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		for (File file : fileSort) {
			List<String> fileContent = InPutStreamFileContent.getFileContentSecond(file.toString());
			for (String string : fileContent) {
				String btteryVoltage=string.substring(WeatherStatusMessagesConstant.BTTERY_VOLTAGE_START,WeatherStatusMessagesConstant.BTTERY_VOLTAGE_EDN);
				String aCDCVlotage=string.substring(WeatherStatusMessagesConstant.AC_DC_VOLTAGE_START,WeatherStatusMessagesConstant.AC_DC_VOLTAGE_EDN);
				String mainMainBoardVlotage=string.substring(WeatherStatusMessagesConstant.MAIN_MAINBOARD_VOLTAGE_START,WeatherStatusMessagesConstant.MAIN_MAINBOARD_VOLTAGE_EDN);
				String selfDetectingStatus=string.substring(WeatherStatusMessagesConstant.SELF_DETECTING_STATUS_START,WeatherStatusMessagesConstant.SELF_DETECTING_STATUS_EDN);
				String receiver=string.substring(WeatherStatusMessagesConstant.RECEIVER_START,WeatherStatusMessagesConstant.RECEIVER_EDN);
				String sender=string.substring(WeatherStatusMessagesConstant.SENDER_START,WeatherStatusMessagesConstant.SENDER_EDN);
				String windowPollution=string.substring(WeatherStatusMessagesConstant.WINDOW_POLLUTION_START,WeatherStatusMessagesConstant.WINDOW_POLLUTION_EDN);
				WeatherStatusMessages wsm = new WeatherStatusMessages(btteryVoltage, aCDCVlotage, mainMainBoardVlotage, selfDetectingStatus, receiver, sender, windowPollution);
				insert.insertWeatherStatusMessages(wsm);		
			}
		}
	}
	/**
	 * 辐射基本信息
	 */
	static void getTranslateFilesRadiation(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		//遍历所有文件单独操作
		for (File file : fileSort) {
			//根据文件绝对路径获取文件内容
			String fileContent = InPutStreamFileContent.getFileContent(file.toString());
			//将获取的文本内容进行切割
			String dsid = fileContent.substring(RadiationBasicParameterConstant.DSID_START, RadiationBasicParameterConstant.DSID_END);
			String year = fileContent.substring(RadiationBasicParameterConstant.YEAR_START, RadiationBasicParameterConstant.YEAR_END);
			String month = fileContent.substring(RadiationBasicParameterConstant.MONTH_START, RadiationBasicParameterConstant.MONTH_END);
			String day =fileContent.substring(RadiationBasicParameterConstant.DAY_START,RadiationBasicParameterConstant.DAY_END);
			String longiutude =fileContent.substring(RadiationBasicParameterConstant.LONGIUTUDE_START,RadiationBasicParameterConstant.LONGIUTUDE_END);
			String latitude =fileContent.substring(RadiationBasicParameterConstant.LATITUDE_START,RadiationBasicParameterConstant.LATITUDE_END);
			String fieldAltitude =fileContent.substring(RadiationBasicParameterConstant.FIELD_ALTITUDE_START,RadiationBasicParameterConstant.FIELD_ALTITUDE_END);
			String airSensorAltitude = fileContent.substring(RadiationBasicParameterConstant.AIR_SENSOR_ALTITUDE_START,RadiationBasicParameterConstant.AIR_SENSOR_ALTITUDE_END);
			String serverType = fileContent.substring(RadiationBasicParameterConstant.SERVE_TYPE_START,RadiationBasicParameterConstant.SERVE_TYPE_END);
			String deviceLogo = fileContent.substring(RadiationBasicParameterConstant.DEVICE_LOGO_START,RadiationBasicParameterConstant.DEVICE_LOGO_END);
			String deviceId = fileContent.substring(RadiationBasicParameterConstant.DEVICE_ID_START,RadiationBasicParameterConstant.DEVICE_ID_END);
			String retain = fileContent.substring(RadiationBasicParameterConstant.RETAIN_START,RadiationBasicParameterConstant.RETAIN_END);
			RadiationBasicParameter rbp = new RadiationBasicParameter(dsid, year, month, day, longiutude, latitude, fieldAltitude, airSensorAltitude, serverType, deviceLogo, deviceId, retain);
			insert.insertRadiationBasicParameter(rbp);
		}
	}
	/**
	 * 辐射状态信息
	 */
	static void getTranslateFileRadiationSecond(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		for (File file : fileSort) {
			List<String> fileContent = InPutStreamFileContent.getFileContentSecond(file.toString());
			for (String string : fileContent) {
				String timeBeijing=string.substring(RadiationStatusMessagesConstant.TIME_BEIJING_START,RadiationStatusMessagesConstant.TIME_BEIJING_END);
				String timeLocal=string.substring(RadiationStatusMessagesConstant.TIME_LOCAL_START,RadiationStatusMessagesConstant.TIME_LOCAL_END);
				String selfDetectingStatus=string.substring(RadiationStatusMessagesConstant.SELF_DETECTING_STATUS_START,RadiationStatusMessagesConstant.SELF_DETECTING_STATUS_END);
				String externalPowerStatus=string.substring(RadiationStatusMessagesConstant.EXTERNAL_POWER_STATUS_START,RadiationStatusMessagesConstant.EXTERNAL_POWER_STATUS_END);
				String mainBoardVoltageStatus=string.substring(RadiationStatusMessagesConstant.MAINBOARD_VOLTAGE_STATUS_START,RadiationStatusMessagesConstant.MAINBOARD_VOLTAGE_STATUS_END);
				String btteryVoltageStatus=string.substring(RadiationStatusMessagesConstant.BTTERY_VOLTAGE_STATUS_START,RadiationStatusMessagesConstant.BTTERY_VOLTAGE_STATUS_END);
				String aCDCVoltageStatus=string.substring(RadiationStatusMessagesConstant.AC_DC_VOLTAGE_STATUS_START,RadiationStatusMessagesConstant.AC_DC_VOLTAGE_STATUS_END);
				String mainBoardTemperatureStatus=string.substring(RadiationStatusMessagesConstant.MAINBOARD_TEMPERATURE_STATUS_START,RadiationStatusMessagesConstant.MAINBOARD_TEMPERATURE_STATUS_END);
				String controllerCommunicateStatus=string.substring(RadiationStatusMessagesConstant.CONTROLLER_COMMUNICATE_SATUS_START,RadiationStatusMessagesConstant.CONTROLLER_COMMUNICATE_SATUS_END);
				String directRadiationTableTailStatus=string.substring(RadiationStatusMessagesConstant.DIRECT_RADIATIONTABLE_TAIL_STATUS_START,RadiationStatusMessagesConstant.DIRECT_RADIATIONTABLE_TAIL_STATUS_END);
				String controllerRunStatus=string.substring(RadiationStatusMessagesConstant.CONTROLLER_RUN_STATUS_START,RadiationStatusMessagesConstant.CONTROLLER_RUN_STATUS_END);
				String aDStatus=string.substring(RadiationStatusMessagesConstant.AD_STATUS_START,RadiationStatusMessagesConstant.AD_STATUS_END);
				String vasculumDoorWarning=string.substring(RadiationStatusMessagesConstant.VASCULUM_DOOR_WARNING_START,RadiationStatusMessagesConstant.VASCULUM_DOOR_WARNING_END);
				String mainRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.MAIN_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.MAIN_RADIATIONTABLE_STATUS_END);
				String reflectRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.REFLECT_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.REFLECT_RADIATIONTABLE_STATUS_END);
				String directRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.DIRECT_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.DIRECT_RADIATIONTABLE_STATUS_END);
				String scatteringRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.SCATTERING_RADIATIONTABLE_STAUS_START,RadiationStatusMessagesConstant.SCATTERING_RADIATIONTABLE_END);
				String ultravioletARadiationTableStatus=string.substring(RadiationStatusMessagesConstant.ULTRAVIOLET_A_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.ULTRAVIOLET_A_RADIATIONTABLE_STATUS_END);
				String ultravioletBRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.ULTRAVIOLET_B_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.ULTRAVIOLET_B_RADIATIONTABLE_STATUS_END);
				String photosyntheticRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.PHOTOSYNTHETIC_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.PHOTOSYNTHETIC_RADIATIONTABLE_STATUS_END);
				String airRadiationTableStatus=string.substring(RadiationStatusMessagesConstant.AIR_RADIATIONTABLE_STATUS_START,RadiationStatusMessagesConstant.AIR_RADIATIONTABLE_STATUS_END);
				String airRadiationTableTemperatureStatus=string.substring(RadiationStatusMessagesConstant.AIR_RADIATIONTABLE_TEMPERATURE_STATUS_START,RadiationStatusMessagesConstant.AIR_RADIATIONTABLE_TEMPERATURE_STATUS_END);
				String groundRadiation=string.substring(RadiationStatusMessagesConstant.GROUND_RADIATION_START,RadiationStatusMessagesConstant.GROUND_RADIATION_END);
				String groundRadiationTemperatureStatus=string.substring(RadiationStatusMessagesConstant.GROUND_RADIATION_TEMPERAURE_STATUSSTART,RadiationStatusMessagesConstant.GROUND_RADIATION_TEMPERAURE_STATUS_END);	
				RadiationStatusMessages rsm = new RadiationStatusMessages(timeBeijing, timeLocal, selfDetectingStatus, externalPowerStatus, mainBoardVoltageStatus, btteryVoltageStatus, aCDCVoltageStatus, mainBoardTemperatureStatus, controllerCommunicateStatus, directRadiationTableTailStatus, controllerRunStatus, aDStatus, vasculumDoorWarning, mainRadiationTableStatus, reflectRadiationTableStatus, directRadiationTableStatus, scatteringRadiationTableStatus, ultravioletARadiationTableStatus, ultravioletBRadiationTableStatus, photosyntheticRadiationTableStatus, airRadiationTableStatus, airRadiationTableTemperatureStatus, groundRadiation, groundRadiationTemperatureStatus);
				insert.insertRadiationStatusMessages(rsm);
			}
		}
	}
	/**
	 * 业务主机基本信息
	 */
	static void getTranslateFilesBusinessHost(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		//遍历所有文件单独操作
		for (File file : fileSort) {
			//根据文件绝对路径获取文件内容
			String fileContent = InPutStreamFileContent.getFileContent(file.toString());
			//将获取的文本内容进行切割
			String dsid = fileContent.substring(BusinessHostBasicParameterConstant.DSID_START, BusinessHostBasicParameterConstant.DSID_END);
			String year = fileContent.substring(BusinessHostBasicParameterConstant.YEAR_START, BusinessHostBasicParameterConstant.YEAR_END);
			String month = fileContent.substring(BusinessHostBasicParameterConstant.MONTH_START, BusinessHostBasicParameterConstant.MONTH_END);
			String day =fileContent.substring(BusinessHostBasicParameterConstant.DAY_START,BusinessHostBasicParameterConstant.DAY_END);
			String longiutude =fileContent.substring(BusinessHostBasicParameterConstant.LONGIUTUDE_START,BusinessHostBasicParameterConstant.LONGIUTUDE_END);
			String latitude =fileContent.substring(BusinessHostBasicParameterConstant.LATITUDE_START,BusinessHostBasicParameterConstant.LATITUDE_END);
			String fieldAltitude =fileContent.substring(BusinessHostBasicParameterConstant.FIELD_ALTITUDE_START,BusinessHostBasicParameterConstant.FIELD_ALTITUDE_END);
			String airSensorAltitude = fileContent.substring(BusinessHostBasicParameterConstant.AIR_SENSOR_ALTITUDE_START,BusinessHostBasicParameterConstant.AIR_SENSOR_ALTITUDE_END);
			BusinessHostBasicParameter bhbp = new BusinessHostBasicParameter(dsid, year, month, day, longiutude, latitude, fieldAltitude, airSensorAltitude);
			insert.insertBusinessHostBasicParameter(bhbp);		
		}
	}
	/**
	 * 业务主机状态信息
	 */
	static void getTranslateFileBusinessHostSecond(String path) {
		//获取目录下的所有文件夹绝对路径 按时间排序
		List<File> fileSort = InPutStreamFile.getFileSort(path);
		for (File file : fileSort) {
			List<String> fileContent = InPutStreamFileContent.getFileContentSecond(file.toString());
			for (String string : fileContent) {
				String time = string.substring(BusinessHostStatusMessagesConstant.TIME_START,BusinessHostStatusMessagesConstant.TIME_END);
				String totalMemory = string.substring(BusinessHostStatusMessagesConstant.TOTAL_MEMORY_START,BusinessHostStatusMessagesConstant.TOTAL_MEMORY_END);
				String currentuseMemory = string.substring(BusinessHostStatusMessagesConstant.CURRENTUSE_MEMORY_START,BusinessHostStatusMessagesConstant.CURRENTUSE_MEMORY_END);
				String currentUseCPUUtilization = string.substring(BusinessHostStatusMessagesConstant.CURRENT_CPU_UTILIZATION_START,BusinessHostStatusMessagesConstant.CURRENT_CPU_UTILIZATION_END);
				String currentDiskTotalMemory = string.substring(BusinessHostStatusMessagesConstant.CURRENT_DISK_TOTAL_MEMORY_START,BusinessHostStatusMessagesConstant.CURRENT_DISK_TOTAL_MEMORY_END);
				String currentDiskResidueMemory = string.substring(BusinessHostStatusMessagesConstant.CURRENT_DISK_RESIDUE_MEMORY_START,BusinessHostStatusMessagesConstant.CURRENT_DISK_RESIDUE_MEMORY_END);
				String retain = string.substring(BusinessHostStatusMessagesConstant.RETAIN_START,BusinessHostStatusMessagesConstant.RETAIN_END);
				BusinessHostStatusMessages bhsm = new BusinessHostStatusMessages(time, totalMemory, currentuseMemory, currentUseCPUUtilization, currentDiskTotalMemory, currentDiskResidueMemory, retain);
				insert.insertBusinessHostStatusMessages(bhsm);
			}
		}
	}
}

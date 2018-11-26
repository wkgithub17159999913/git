package constant;

public class DeviceWorkStatusConstant {
	/**
	 * WORK_STATUS表
	 */
	//时间（北京时间）
	public static final Integer TIME_START=0;
	public static final Integer TIME_END=4;
	//主采集器运行状态
	public static final Integer MAINCONTROLLER_RUN_STATUS_START=4;
	public static final Integer MAINCONTROLLER_RUN_STATUS_END=5;
	//主采集器电源电压
	public static final Integer MAINCONTROLLER_POWER_VOLTAGE_START=5;
	public static final Integer MAINCONTROLLER_POWER_VOLTAGE_END=9;
	//主采集器供电类型
	public static final Integer MAINCONTROLLER_POWER_TYPE_START=9;
	public static final Integer MAINCONTROLLER_POWER_TYPE_END=10;
	//主采集器主板温度
	public static final Integer MAINCONTROLLER_TEMPERATURE_START=10;
	public static final Integer MAINCONTROLLER_TEMPERATURE_END=14;
	//主采集器AD模块工作状态
	public static final Integer MAINCONTROLLER_AD_STATUS_START=14;
	public static final Integer MAINCONTROLLER_AD_STATUS_END=15;
	//主采集器计数器模块状态
	public static final Integer MAINCONTROLLER_COUNTER_STATUS_START=15;
	public static final Integer MAINCONTROLLER_COUNTER_STATUS_END=16;
	//主采集器CF卡状态
	public static final Integer MAINCONTROLLER_CF_STATUS_START=16;
	public static final Integer MAINCONTROLLER_CF_STATUS_END=17;
	//主采集器CF卡剩余空间
	public static final Integer MAINCONTROLLER_CF_FREE_START=17;
	public static final Integer MAINCONTROLLER_CF_FREE_END=21;
	//保留位存入1位“-”（序号为10）
	public static final Integer RETAIN_10_START=21;
	public static final Integer RETAIN_10_END=22;
	//主采集器门开关状态
	public static final Integer MAINCONTROLLER_DOOR_STATUS_START=22;
	public static final Integer MAINCONTROLLER_DOOR_STATUS_END=23;
	//主采集器LAN状态
	public static final Integer MAINCONTROLLER_LAN_STATUS_START=23;
	public static final Integer MAINCONTROLLER_LAN_STATUS_END=24;
	//主采集器RS-232/RS-485终端通讯状态
	public static final Integer MAINCONTROLLER_RS232_RS485_STATUS_START=24;
	public static final Integer MAINCONTROLLER_RS232_RS485_STATUS_END=25;
	//CAN总线状态
	public static final Integer CAN_BUS_STATUS_START=25;
	public static final Integer CAN_BUS_STATUS_END=26;
	//保留位存入1位“－”
	public static final Integer RETAIN_15_START=26;
	public static final Integer RETAIN_15_END=27;
	//保留位存入4位“－”
	public static final Integer RETAIN_16_START=27;
	public static final Integer RETAIN_16_END=31;
	//保留位存入1位“－”
	public static final Integer RETAIN_17_START=31;
	public static final Integer RETAIN_17_END=32;
	//保留位存入4位“－”
	public static final Integer RETAIN_18_START=32;
	public static final Integer RETAIN_18_END=36;
	//保留位存入1位“－”
	public static final Integer RETAIN_19_START=36;
	public static final Integer RETAIN_19_END=37;
	//保留位存入1位“－”
	public static final Integer RETAIN_20_START=37;
	public static final Integer RETAIN_20_END=38;
	//保留位存入1位“－”
	public static final Integer RETAIN_21_START=38;
	public static final Integer RETAIN_21_END=39;
	//保留位存入4位“－”
	public static final Integer RETAIN_22_START=39;
	public static final Integer RETAIN_22_END=43;
	//保留位存入1位“－”
	public static final Integer RETAIN_23_START=43;
	public static final Integer RETAIN_23_END=44;
	//保留位存入4位“－”
	public static final Integer RETAIN_24_START=44;
	public static final Integer RETAIN_24_END=48;
	//保留位存入1位“－”
	public static final Integer RETAIN_25_START=48;
	public static final Integer RETAIN_25_END=49;
	//保留位存入1位“－”
	public static final Integer RETAIN_26_START=49;
	public static final Integer RETAIN_26_END=50;
	//地温分采集器运行状态
	public static final Integer EARTHCONTROLLER_RUN_STATUS_START=50;
	public static final Integer EARTHCONTROLLER_RUN_STATUS_END=51;
	//地温分采集器供电电压
	public static final Integer EARTHCONTROLLER_POWER_VOLTAGE_START=51;
	public static final Integer EARTHCONTROLLER_POWER_VOLTAGE_END=55;
	//地温分采集器供电类型
	public static final Integer EARTHCONTROLLER_POWER_TYPE_START=55;
	public static final Integer EARTHCONTROLLER_POWER_TYPE_END=56;
	//地温分采集器主板温度
	public static final Integer EARTHCONTROLLER_TEMPERATURE_START=56;
	public static final Integer EARTHCONTROLLER_TEMPERATURE_END=60;
	//地温分采集器AD模块状态
	public static final Integer EARTHCONTROLLER_AD_STATUS_START=60;
	public static final Integer EARTHCONTROLLER_AD_STATUS_END=61;
	//地温分采集器计数器模块状态
	public static final Integer EARTHCONTROLLER_COUNTER_STATUS_START=61;
	public static final Integer EARTHCONTROLLER_COUNTER_STATUS_END=62;
	//保留位存入1位"-"
	public static final Integer RETAIN_33_START=62;
	public static final Integer RETAIN_33_END=63;
	//保留位存入4位"-"
	public static final Integer RETAIN_34_START=63;
	public static final Integer RETAIN_34_END=67;
	//保留位存入1位"-"
	public static final Integer RETAIN_35_START=67;
	public static final Integer RETAIN_35_END=68;
	//保留位存入4位"-"
	public static final Integer RETAIN_36_START=68;
	public static final Integer RETAIN_36_END=72;
	//保留位存入1位"-"
	public static final Integer RETAIN_37_START=72;
	public static final Integer RETAIN_37_END=73;
	//保留位存入1位"-"
	public static final Integer RETAIN_38_START=73;
	public static final Integer RETAIN_38_END=74;
	//保留位存入1位"-"
	public static final Integer RETAIN_39_START=74;
	public static final Integer RETAIN_39_END=75;
	//保留位存入4位"-"
	public static final Integer RETAIN_40_START=75;
	public static final Integer RETAIN_40_END=79;
	//保留位存入1位"-"
	public static final Integer RETAIN_41_START=79;
	public static final Integer RETAIN_41_END=80;
	//保留位存入4位"-"
	public static final Integer RETAIN_42_START=80;
	public static final Integer RETAIN_42_END=84;
	//保留位存入1位"-"
	public static final Integer RETAIN_43_START=84;
	public static final Integer RETAIN_43_END=85;
	//保留位存入1位"-"
	public static final Integer RETAIN_44_START=85;
	public static final Integer RETAIN_44_END=86;
	//温湿度智能传感器工作状态
	public static final Integer HUMISENSOR_RUN_STATUS_START=86;
	public static final Integer HUMISENSOR_RUN_STATUS_END=98;
	//保留(智能传感器1工作状态)
	public static final Integer RETAIN_46_START=98;
	public static final Integer RETAIN_46_END=110;
	//保留(智能传感器2工作状态)
	public static final Integer RETAIN_47_START=110;
	public static final Integer RETAIN_47_END=122;
	//保留(智能传感器3工作状态)
	public static final Integer RETAIN_48_START=122;
	public static final Integer RETAIN_48_END=134;
	//保留(智能传感器4工作状态)
	public static final Integer RETAIN_49_START=134;
	public static final Integer RETAIN_49_END=146;
	//保留(智能传感器5工作状态)
	public static final Integer RETAIN_50_START=146;
	public static final Integer RETAIN_50_END=158;
	//传感器工作状态
	public static final Integer SENSOR_RUN_STATUS_START=158;
	public static final Integer SENSOR_RUN_STATUS_END=231;
	//蒸发水位高度
	public static final Integer EVAPORATION_HEIGHT_START=231;
	public static final Integer EVAPORATION_HEIGHT_END=235;
	//称重式降水量水位
	public static final Integer PRECIPITATION_LEVEL_START=235;
	public static final Integer PRECIPITATION_LEVEL_END=239;
	//保留
	public static final Integer RETAIN_54_START=239;
	public static final Integer RETAIN_54_END=249;
}

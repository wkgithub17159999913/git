package utils;

import java.util.Timer;
import java.util.TimerTask;

public class TimeToRead extends TimerTask{
	static Timer t;
public static void startTime(int startTime) {
	t = new Timer();
	//time*1000延迟几秒后执行  ,300000 5分钟执行一次
	t.schedule(new TimeToRead(),startTime*1000,300000L);
}
	@Override
	public void run() {
		//读取设备基本信息
		TranslateFile.getTranslateFilesAWS("F:\\work\\am");
		//读取设备状态信息
		TranslateFile.getTranslateFilesAWSSecond("F:\\work\\am");
		//读取能见度基本信息
		TranslateFile.getTranslateFilesVisibility("F:\\work\\vi");
		//读取能见度状态信息
		TranslateFile.getTranslateFilesVisibilitySecond("F:\\work\\vi");
		//读取天气基本信息
		TranslateFile.getTranslateFilesWeather("F:\\work\\wa");
		//读取天气状态信息
		TranslateFile.getTranslateFilesWeatherSecond("F:\\work\\wa");
		//读取辐射基本信息
		TranslateFile.getTranslateFilesRadiation("F:\\work\\ra");
		//读取辐射状态信息
		TranslateFile.getTranslateFileRadiationSecond("F:\\work\\ra");
		//读取业务主机基本信息
		TranslateFile.getTranslateFilesBusinessHost("F:\\work\\am");
		//读取业务主机状态信息
		TranslateFile.getTranslateFileBusinessHostSecond("F:\\work\\am");
	}
}

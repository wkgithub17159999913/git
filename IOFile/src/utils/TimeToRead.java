package utils;

import java.util.Timer;
import java.util.TimerTask;

public class TimeToRead extends TimerTask{
	static Timer t;
public static void startTime(int startTime) {
	t = new Timer();
	//time*1000�ӳټ����ִ��  ,300000 5����ִ��һ��
	t.schedule(new TimeToRead(),startTime*1000,300000L);
}
	@Override
	public void run() {
		//��ȡ�豸������Ϣ
		TranslateFile.getTranslateFilesAWS("F:\\work\\am");
		//��ȡ�豸״̬��Ϣ
		TranslateFile.getTranslateFilesAWSSecond("F:\\work\\am");
		//��ȡ�ܼ��Ȼ�����Ϣ
		TranslateFile.getTranslateFilesVisibility("F:\\work\\vi");
		//��ȡ�ܼ���״̬��Ϣ
		TranslateFile.getTranslateFilesVisibilitySecond("F:\\work\\vi");
		//��ȡ����������Ϣ
		TranslateFile.getTranslateFilesWeather("F:\\work\\wa");
		//��ȡ����״̬��Ϣ
		TranslateFile.getTranslateFilesWeatherSecond("F:\\work\\wa");
		//��ȡ���������Ϣ
		TranslateFile.getTranslateFilesRadiation("F:\\work\\ra");
		//��ȡ����״̬��Ϣ
		TranslateFile.getTranslateFileRadiationSecond("F:\\work\\ra");
		//��ȡҵ������������Ϣ
		TranslateFile.getTranslateFilesBusinessHost("F:\\work\\am");
		//��ȡҵ������״̬��Ϣ
		TranslateFile.getTranslateFileBusinessHostSecond("F:\\work\\am");
	}
}

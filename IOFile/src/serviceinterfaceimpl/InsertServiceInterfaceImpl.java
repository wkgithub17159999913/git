package serviceinterfaceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pojo.VisibilityBasicParameter;
import pojo.VisibilityStatusMessages;
import pojo.WeatherBasicParameter;
import pojo.WeatherStatusMessages;
import pojo.BusinessHostBasicParameter;
import pojo.BusinessHostStatusMessages;
import pojo.DeviceStatusMessages;
import pojo.DeviceWorkStatus;
import pojo.RadiationBasicParameter;
import pojo.RadiationStatusMessages;
import serviceInterface.InsertServiceInterface;
import utils.JDBCUtils;

public class InsertServiceInterfaceImpl implements InsertServiceInterface {
	
	/**
	 * 将转译之后的数据保存到数据库
	 */
	@Override
	public void insertDeviceStatusMessages(DeviceStatusMessages dsm) {
		String sql="insert into DEVICE_STATUS_MESSAGES values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;	
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,dsm.getDsid());
			ps.setString(2,dsm.getYear());
			ps.setString(3,dsm.getMonth());
			ps.setString(4,dsm.getDay());
			ps.setString(5,dsm.getLongiutude());
			ps.setString(6,dsm.getLatitude());
			ps.setInt(7,dsm.getAltitude()*10);
			ps.setString(8,dsm.getTypeStatusLogo());
			ps.setString(9,dsm.getMainControllerLogo());
			ps.setString(10,dsm.getEarthControllerLogo());
			ps.setString(11,dsm.getHumiControllerLogo());
			ps.setString(12,dsm.getcFDeviceLogo());
			ps.setString(13,dsm.getSensorLogo());
			ps.setString(14,dsm.getVersion());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertDeviceWorkStatus(DeviceWorkStatus dws) {
		String sql="insert into DEVICE_WORK_STATUS values(?,?,?,?,?,?,?,?,?,'-',?,?,?,?,'-','----','-','----','-','-','-','----','-','----','-','-',?,?,?,?,?,?,'-','----','-','----','-','-','-','----','-','----','-','-',?,'-','-','-','-','-',?,?,?,'-')";
		Connection conn = null;
		PreparedStatement ps = null;
		conn = JDBCUtils.getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,dws.getTime());
			ps.setString(2,dws.getMaincontrollerRunStatus());
			ps.setString(3,dws.getMaincontrollerProwerVoltage());
			ps.setString(4,dws.getMaincontrollerProwerType());
			ps.setString(5,dws.getMaincontrollerTemperature());
			ps.setString(6,dws.getMaincontrollerADStatus());
			ps.setString(7,dws.getMaincontrollerCounterStatus());
			ps.setString(8,dws.getMaincontrollerCFStatus());
			ps.setString(9,dws.getMaincontrollerCFFree());
			ps.setString(10,dws.getMaincontrollerDoorStatus());
			ps.setString(11,dws.getMaincontrollerLANStatus());
			ps.setString(12,dws.getMaincontrollerRS232_RS485Status());
			ps.setString(13,dws.getCANBusStatus());
			ps.setString(14,dws.getEarthcontrollerRunStatus());
			ps.setString(15,dws.getEarthcontrollerPowerVoltage());
			ps.setString(16,dws.getEarthcontrollerPowerType());
			ps.setString(17,dws.getEarthcontrollerTemperature());
			ps.setString(18,dws.getEarthcontrollerADStatus());
			ps.setString(19,dws.getEarthcontrollerCounterStatus());
			ps.setString(20,dws.getHumisensorRunStatus());
			ps.setString(21,dws.getSensorRunStatus());
			ps.setString(22,dws.getEvaporationHeight());
			ps.setString(23,dws.getPrecipitationLevel());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertVisibilityBasicParameter(VisibilityBasicParameter vbp) {
		String sql="insert into VISIBILITY_BASIC_PARAMETER values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,vbp.getDsid());
			ps.setString(2,vbp.getYear());
			ps.setString(3,vbp.getMonth());
			ps.setString(4,vbp.getDay());
			ps.setString(5,vbp.getLongiutude());
			ps.setString(6,vbp.getLatitude());
			ps.setString(7,vbp.getFieldAltitude());
			ps.setString(8,vbp.getAirSensorAltitude());
			ps.setString(9,vbp.getServerType());
			ps.setString(10,vbp.getDeviceLogo());
			ps.setString(11,vbp.getDeviceId());
			ps.setString(12,vbp.getRetain());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertVisibilityStatusMessages(VisibilityStatusMessages vsm) {
		String sql="insert into VISIBILITY_STATUS_MESSAGES values(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,vsm.getAcDcVoltage());
			ps.setString(2,vsm.getSelfDetectingStatus());
			ps.setString(3,vsm.getReceiver());
			ps.setString(4,vsm.getSender());
			ps.setString(5,vsm.getWindowPollution());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertWeatherBasicParameter(WeatherBasicParameter wbp) {
		String sql="insert into WEATHER_BASIC_PARAMETER values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,wbp.getDsid());
			ps.setString(2,wbp.getYear());
			ps.setString(3,wbp.getMonth());
			ps.setString(4,wbp.getDay());
			ps.setString(5,wbp.getLongiutude());
			ps.setString(6,wbp.getLatitude());
			ps.setString(7,wbp.getFieldAltitude());
			ps.setString(8,wbp.getAirSensorAltitude());
			ps.setString(9,wbp.getServerType());
			ps.setString(10,wbp.getDeviceLogo());
			ps.setString(11,wbp.getDeviceId());
			ps.setString(12,wbp.getRetain());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void insertWeatherStatusMessages(WeatherStatusMessages wsm) {
		String sql="insert into WEATHER_STATUS_MESSAGES values(?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,wsm.getBtteryVoltage());
			ps.setString(2,wsm.getaCDCVlotage());
			ps.setString(3,wsm.getMainMainBoardVlotage());
			ps.setString(4,wsm.getSelfDetectingStatus());
			ps.setString(5,wsm.getReceiver());
			ps.setString(6,wsm.getSender());
			ps.setString(7,wsm.getWindowPollution());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void insertRadiationBasicParameter(RadiationBasicParameter rbp) {
		String sql="insert into RADIATION_BASIC_PARAMETER values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,rbp.getDsid());
			ps.setString(2,rbp.getYear());
			ps.setString(3,rbp.getMonth());
			ps.setString(4,rbp.getDay());
			ps.setString(5,rbp.getLongiutude());
			ps.setString(6,rbp.getLatitude());
			ps.setString(7,rbp.getFieldAltitude());
			ps.setString(8,rbp.getAirSensorAltitude());
			ps.setString(9,rbp.getServerType());
			ps.setString(10,rbp.getDeviceLogo());
			ps.setString(11,rbp.getDeviceId());
			ps.setString(12,rbp.getRetain());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertRadiationStatusMessages(RadiationStatusMessages rsm) {
		String sql="insert into RADIATION_STATUS_MESSAGES values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,rsm.getTimeBeijing());
			ps.setString(2,rsm.getTimeLocal());
			ps.setString(3,rsm.getSelfDetectingStatus());
			ps.setString(4,rsm.getExternalPowerStatus());
			ps.setString(5,rsm.getMainBoardVoltageStatus());
			ps.setString(6,rsm.getBtteryVoltageStatus());
			ps.setString(7,rsm.getaCDCVoltageStatus());
			ps.setString(8,rsm.getMainBoardTemperatureStatus());
			ps.setString(9,rsm.getControllerCommunicateStatus());
			ps.setString(10,rsm.getDirectRadiationTableTailStatus());
			ps.setString(11,rsm.getControllerRunStatus());
			ps.setString(12,rsm.getaDStatus());
			ps.setString(13,rsm.getVasculumDoorWarning());
			ps.setString(14,rsm.getMainRadiationTableStatus());
			ps.setString(15,rsm.getReflectRadiationTableStatus());
			ps.setString(16,rsm.getDirectRadiationTableStatus());
			ps.setString(17,rsm.getScatteringRadiationTableStatus());
			ps.setString(18,rsm.getUltravioletARadiationTableStatus());
			ps.setString(19,rsm.getUltravioletBRadiationTableStatus());
			ps.setString(20,rsm.getPhotosyntheticRadiationTableStatus());
			ps.setString(21,rsm.getAirRadiationTableStatus());
			ps.setString(22,rsm.getAirRadiationTableTemperatureStatus());
			ps.setString(23,rsm.getGroundRadiation());
			ps.setString(24,rsm.getGroundRadiationTemperatureStatus());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void insertBusinessHostBasicParameter(BusinessHostBasicParameter bhbp) {
		String sql="insert into BUSINESSHOST_BASIC_PARAMETER values(?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,bhbp.getDsid());
			ps.setString(2,bhbp.getYear());
			ps.setString(3,bhbp.getMonth());
			ps.setString(4,bhbp.getDay());
			ps.setString(5,bhbp.getLongiutude());
			ps.setString(6,bhbp.getLatitude());
			ps.setString(7,bhbp.getFieldAltitude());
			ps.setString(8,bhbp.getAirSensorAltitude());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void insertBusinessHostStatusMessages(BusinessHostStatusMessages bhsm) {
		String sql="insert into BUSINESSHOST_STATUS_MESSAGES values(?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,bhsm.getTime());
			ps.setString(2,bhsm.getTotalMemory());
			ps.setString(3,bhsm.getCurrentuseMemory());
			ps.setString(4,bhsm.getCurrentUseCPUUtilization());
			ps.setString(5,bhsm.getCurrentDiskTotalMemory());
			ps.setString(6,bhsm.getCurrentDiskResidueMemory());
			ps.setString(7,bhsm.getRetain());
			int rs = ps.executeUpdate();
			if(rs>0) {
				System.out.println("操作成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("添加失败!");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

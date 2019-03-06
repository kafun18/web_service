package cn.itcast.ws.jaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 
 * <p>Title: WeatherInterfaceImpl.java</p>
 * <p>Description:SEI实现类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日上午9:29:27
 * @version 1.0
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		// TODO Auto-generated method stub
		System.out.println("from client..."+cityName);
		String weather = "晴天";
		return weather;
	}

	
	

}

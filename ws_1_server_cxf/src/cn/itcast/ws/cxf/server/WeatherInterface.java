package cn.itcast.ws.cxf.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 
 * <p>Title: WeatherInterface.java</p>
 * <p>Description:SEI�ӿ�</p>
 * <p>Company: www.itcast.com</p>
 * @author  ����.at
 * @date    2015��11��27������9:47:43
 * @version 1.0
 */
//����SOAP1.2����
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {

	public String queryWeather(String cityName);
}

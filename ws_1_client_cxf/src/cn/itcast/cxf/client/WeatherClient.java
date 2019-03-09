package cn.itcast.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.cxf.weather.WeatherInterface;

/**
 * 
 * <p>
 * Title: WeatherClient.java
 * </p>
 * <p>
 * Description:�ͻ���
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author ����.at
 * @date 2015��11��27������10:12:24
 * @version 1.0
 */
public class WeatherClient {

	public static void main(String[] args) {
		// JaxWsProxyFactoryBean���÷����
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		// ���÷���ӿ�
		jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
		// ���÷����ַ
		jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		// ��ȡ����ӿ�ʵ��
		WeatherInterface weatherInterface = jaxWsProxyFactoryBean.create(WeatherInterface.class);
		// ���ò�ѯ����
		String weather = weatherInterface.queryWeather("����");
		System.out.println(weather);

	}

}

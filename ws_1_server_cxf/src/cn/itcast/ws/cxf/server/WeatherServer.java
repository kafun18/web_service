package cn.itcast.ws.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 
 * <p>
 * Title: WeatherServer.java
 * </p>
 * <p>
 * Description:�����
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author ����.at
 * @date 2015��11��27������9:51:36
 * @version 1.0
 */
public class WeatherServer {

	public static void main(String[] args) {
		// JaxWsServerFactoryBean��������
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		// ���÷���ӿ�
		jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		// ���÷���ʵ����
		jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		// ���÷����ַ
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");

		// ����������
		jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

		// ����
		jaxWsServerFactoryBean.create();

	}

}

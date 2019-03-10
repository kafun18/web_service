package cn.itcast.ws.rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * 
 * <p>
 * Title: StudentServer.java
 * </p>
 * <p>
 * Description:�����
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author ����.at
 * @date 2015��11��27������3:16:06
 * @version 1.0
 */
public class StudentServer {

	public static void main(String[] args) {
		// JAXRSServerFactoryBean����REST�ķ���
		JAXRSServerFactoryBean jaxRSServerFactoryBean = new JAXRSServerFactoryBean();

		// ���÷���ʵ����
		jaxRSServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
		// ������Դ�࣬����ж����Դ�࣬�����ԡ�,��������
		jaxRSServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
		// ���÷����ַ
		jaxRSServerFactoryBean.setAddress("http://127.0.0.1:12345/user");
		// ��������
		jaxRSServerFactoryBean.create();
	}

}

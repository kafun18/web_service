package cn.itcast.ws.rest.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * <p>Title: Student.java</p>
 * <p>Description:ѧ��ʵ����</p>
 * <p>Company: www.itcast.com</p>
 * @author  ����.at
 * @date    2015��11��27������3:00:17
 * @version 1.0
 */
@XmlRootElement(name="Student")//@XmlRootElement����ʵ�ֶ����XML����֮���ת��
public class Student {

private long id;
	
	private String name;
	
	private Date birthday;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}

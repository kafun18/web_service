package cn.itcast.ws.rest.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.itcast.ws.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentInterfaceImpl.java</p>
 * <p>Description:ѧ����ʵ����</p>
 * <p>Company: www.itcast.com</p>
 * @author  ����.at
 * @date    2015��11��27������3:12:54
 * @version 1.0
 */
public class StudentInterfaceImpl implements StudentInterface{

	@Override
	public Student query(long id) {
		Student st = new Student();
		st.setId(110);
		st.setName("����");
		st.setBirthday(new Date());
		return st;
	}

	@Override
	public List<Student> queryList(String name) {
		
		Student st = new Student();
		st.setId(110);
		st.setName("����");
		st.setBirthday(new Date());
		
		Student st2 = new Student();
		st2.setId(120);
		st2.setName("����");
		st2.setBirthday(new Date());
		
		List<Student> list = new ArrayList<Student>();
		list.add(st);
		list.add(st2);
		return list;
	}
}

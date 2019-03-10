package cn.itcast.ws.rest.server;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.itcast.ws.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentInterface.java</p>
 * <p>Description:ѧ���ӿ�</p>
 * <p>Company: www.itcast.com</p>
 * @author  ����.at
 * @date    2015��11��27������3:03:08
 * @version 1.0
 */
@WebService
@Path("/student")//@Path("/student")���ǽ�����·���еġ�/student��ӳ�䵽�ӿ���
public interface StudentInterface {
	
	//��ѯ����ѧ��
	@POST//ָ������ʽ���������˷�����ʱ��ָ������GET��POST������ô�ͻ��˷���ʱ����ʹ��GET��POST��
	@Produces(MediaType.APPLICATION_XML)//ָ��������������XML��ʽ
	@Path("/query/{id}")//@Path("/query/{id}")���ǽ���/query��ӳ�䵽�����ϣ���{id}��ӳ�䵽�����ϣ�����������ԡ�/���������ŵ���{}����
	public Student query(@PathParam("id")long id);
	
	//��ѯ���ѧ��
	@GET//ָ������ʽ���������˷�����ʱ��ָ������GET��POST������ô�ͻ��˷���ʱ����ʹ��GET��POST��
	//"application/json;charset=utf-8"��"MediaType.APPLICATION_XML"˭��ǰ��ָ��˭
	@Produces({"application/json;charset=utf-8",MediaType.APPLICATION_XML})//ָ��������������	
	@Path("/queryList/{name}")//@Path("/queryList/{name}")���ǽ���/queryList��ӳ�䵽�����ϣ���{name}��ӳ�䵽�����ϣ�����������ԡ�/���������ŵ���{}����
	public List<Student> queryList(@PathParam("name")String name);

}

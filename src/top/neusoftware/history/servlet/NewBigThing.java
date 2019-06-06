package top.neusoftware.history.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;

import top.neusoftware.history.mapper.DataMapper;
import top.neusoftware.history.model.Data;

/**
 * Servlet implementation class NewBigThing
 */
@WebServlet("/NewBigThing")
public class NewBigThing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewBigThing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("Access-Control-Allow-Origin", "*");  
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		int date=Integer.parseInt(request.getParameter("date"));
		String heading=request.getParameter("heading");
		String body=request.getParameter("body");
		Data data=new Data(date, heading, body);
		String resource = "conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		DataMapper mapper = session.getMapper(DataMapper.class);
		mapper.addData(data);
		session.commit();
		System.out.print("³É¹¦Ìí¼Ó");
		response.getWriter().print("success");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

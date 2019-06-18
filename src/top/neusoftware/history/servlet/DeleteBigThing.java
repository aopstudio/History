package top.neusoftware.history.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import top.neusoftware.history.mapper.DataMapper;
import top.neusoftware.history.model.Data;
import top.neusoftware.history.model.DeleteRecord;

/**
 * Servlet implementation class DeleteBigThing
 */
@WebServlet("/DeleteBigThing")
public class DeleteBigThing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBigThing() {
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
		String ip=request.getHeader("X-Forwarded-For");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time=df.format(new Date());
        String table=request.getParameter("table");
		int id=Integer.parseInt(request.getParameter("id"));
		String resource = "conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		DataMapper mapper = session.getMapper(DataMapper.class);
		Data data=mapper.getData(table,id);
		session.commit();
		DeleteRecord dr=new DeleteRecord(id,data.getDate(),data.getHeading(),data.getBody(),ip,time);
		mapper.deleteRecord(dr);
		mapper.deleteData(table,id);
		session.commit();
		System.out.println("删除成功");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

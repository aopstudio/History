package top.neusoftware.history.tool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HeWeather {
	public static String getLocationByIp(String ip) {
		String location=null;
		try {
            URL url = new URL("https://search.heweather.net/find?key=89d49e32a26d4067822c9ed361231e2d&location="+ip);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("GET"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();
            JSONObject loc=JSON.parseObject(result.toString());
            
            JSONObject basic=loc.getJSONArray("HeWeather6").getJSONObject(0).getJSONArray("basic").getJSONObject(0);
            location=basic.getString("cnty")+basic.getString("admin_area")+basic.getString("location");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return location;
	}
}

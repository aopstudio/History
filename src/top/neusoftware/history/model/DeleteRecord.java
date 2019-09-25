package top.neusoftware.history.model;

public class DeleteRecord {
	private String table;
	private int id;
	private int date;
	private String heading;
	private String body;
	private String ip_address;
	private String location;
	private String time;
	
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public DeleteRecord(String table, int id, int date, String heading, String body, String ip_address, String location, String time) {
		super();
		this.table=table;
		this.id = id;
		this.date = date;
		this.heading = heading;
		this.body = body;
		this.ip_address = ip_address;
		this.location=location;
		this.time = time;
	}
	public DeleteRecord() {
		
	}
}

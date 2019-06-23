package top.neusoftware.history.model;

public class AddRecord {
	private String table;
	private int id;
	private String ip_address;
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
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public AddRecord(String table, int id, String ip_address, String time) {
		super();
		this.table=table;
		this.id = id;
		this.ip_address = ip_address;
		this.time = time;
	}
	
}

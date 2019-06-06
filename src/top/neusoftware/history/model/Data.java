package top.neusoftware.history.model;

public class Data {
	private int date;
	private String heading;
	private String body;
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
	public Data(int date, String heading, String body) {
		super();
		this.date = date;
		this.heading = heading;
		this.body = body;
	}
	
}

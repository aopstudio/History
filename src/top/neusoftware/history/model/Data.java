package top.neusoftware.history.model;

public class Data {
	private int id;
	private int date;
	private String heading;
	private String body;
	private String author;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Data(int date, String heading, String body) {
		super();
		this.date = date;
		this.heading = heading;
		this.body = body;
	}
	public Data(int id, int date, String heading, String body, String author) {
		super();
		this.id = id;
		this.date = date;
		this.heading = heading;
		this.body = body;
		this.author = author;
	}
	
	
}

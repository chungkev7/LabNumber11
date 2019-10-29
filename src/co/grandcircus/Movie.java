package co.grandcircus;

public class Movie {
	
	String title;
	String category;
	
	public Movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return title;
	}	
	
}

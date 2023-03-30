package exam1;

public class Book {
	private int id;
	private String name, publisher;
	
	public Book(int id, String name, String publisher) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publisher=" + publisher + "]";
	}
	
	
}

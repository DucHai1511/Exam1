package exam2;

public class Book implements Comparable<Book> {
	private int stt;
	private String name, publisher;
	
	public Book(int stt, String name, String publisher) {
		this.stt = stt;
		this.name = name;
		this.publisher = publisher;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
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
		return "Book [stt=" + stt + ", name=" + name + ", publisher=" + publisher + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.getName().compareTo(o.getName());
	}
	
	
}

package exam1;

public class Book {
	private String id, name;
	private double cost;
	
	public Book() {
		
	}
	
	public Book(String id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}

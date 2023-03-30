package exam1;

import java.util.ArrayList;
import java.util.List;

public class BookController extends Input implements Activity, Search {

	private List<Book> listBook = new ArrayList<>();
	
	public void menu() {
		System.out.println("--------MENU--------");
		System.out.println("1. Add");
		System.out.println("2. Edit");
		System.out.println("3. Remove");
		System.out.println("4. Search");
		System.out.println("5. Exit");
		System.out.print("--> Enter your choice: ");
		int choice = inputScannerInt();
		while(true) {
			if(choice == 1) {
				add();
				menu();
			} else if(choice == 2) {
				edit();
				menu();
			} else if(choice == 3) {
				remove();
				menu();
			} else if(choice == 4) {
				System.out.print("Name you want to search: ");
				String name = inputScannerString();
				searchByName(name);
				menu();
			} else if(choice == 5) {
				System.out.println("GOOD BYE !!!");
				break;
			}
		}
	}
	
	@Override
	public void searchByName(String name) {
		int cnt = 0;
		for(Book book : listBook) {
			if(book.getName().toLowerCase().contains(name.toLowerCase())) {
				System.out.println(book);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("Can not find");
		}
	}

	@Override
	public void add() {
		System.out.print("ID: ");
		int id = inputScannerInt();
		System.out.print("Name: ");
		String name = inputScannerString();
		System.out.print("Publisher: ");
		String publisher = inputScannerString();
		listBook.add(new Book(id, name, publisher));
	}
	
	public boolean checkID(int id) {
		boolean chk = false;
		for(Book book : listBook) {
			if(book.getId() == id) {
				chk = true;
			}
		}
		return chk;
	}
	
	public int getIndexByID(int id) {
		for(int i = 0; i < listBook.size(); i++) {
			if(listBook.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void edit() {
		System.out.print("ID you want to edit: ");
		int id = inputScannerInt();
		if(checkID(id)) {
			System.out.print("Name: ");
			String name = inputScannerString();
			System.out.print("Publisher: ");
			String publisher = inputScannerString();
			listBook.set(getIndexByID(id), new Book(id, name, publisher));
		} else {
			System.out.println("ID does not exist");
		}
	}

	@Override
	public void remove() {
		System.out.print("ID you want to remove: ");
		int id = inputScannerInt();
		if(checkID(id)) {
			listBook.remove(getIndexByID(id));
		} else {
			System.out.println("ID does not exist");
		}
		
	}

	public List<Book> getListBook() {
		return listBook;
	}

	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}

}

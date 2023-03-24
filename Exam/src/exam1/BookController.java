package exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController extends Input implements Activity, Search {

	private List<Book> listBook = new ArrayList<>();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {			
			System.out.println("--------MENU--------");
			System.out.println("1. Them");
			System.out.println("2. Sua");
			System.out.println("3. Xoa");
			System.out.println("4. Tim kiem");
			System.out.println("5. Thoat");
			System.out.print("--> Nhap lua chon cua ban: ");
			String check = sc.nextLine();
			int choice = 0;
			try {
				choice = Integer.parseInt(check);
				if(choice < 1 || choice > 5) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("Ban nhap khong dung. Vui long nhap lai !");
			}
			if(choice == 1) {
				add();
				menu();
			} else if (choice == 2) {
				edit();
				menu();
			}
			else if (choice == 3) {
				remove();
				menu();
			}
			else if (choice == 4) {
				System.out.println("Name: ");
				String name = sc.nextLine();
				searchByName(name);
				menu();
			}
			else if (choice == 5) {
				break;
			}
		}
	}
	
	
	@Override
	public void searchByName(String name) {
		int count = 0;
		for(Book book : listBook) {
			if(book.getName().toLowerCase().contains(name.toLowerCase())) {
				count++;
				System.out.println(book);
			}
		}
		if(count == 0) {
			System.out.println("Khong tim thay");
		}
	}
	
	public boolean checkID(String id) {
		boolean check = false;
		for(Book book : listBook) {
			if(book.getId().equals(id)) {
				check = true;
			}
		}
		return check;
	}
	
	public int getIndex(String id) {
		for(int i = 0; i < listBook.size(); i++) {
			if(listBook.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		String id = sc.nextLine();
		if(!checkID(id)) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Cost: ");
			double cost = sc.nextDouble();
			sc.nextLine();
			Book book = new Book(id, name, cost);
			listBook.add(book);
			System.out.println("Ban da them thong tin sach thanh cong !");
		} else {
			System.out.println("ID nay da bi trung !");
		}
		
		
	}

	@Override
	public void edit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID can sua: ");
		String id = sc.nextLine();
		if(checkID(id)) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Cost: ");
			double cost = sc.nextDouble();
			sc.nextLine();
			Book book = new Book(id, name, cost);
			listBook.set(getIndex(book.getId()), book);
			System.out.println("Ban da sua thong tin sach thanh cong !");
		} else {
			System.out.println("ID nay khong ton tai !");
		}
	}

	@Override
	public void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID can xoa: ");
		String id = sc.nextLine();
		if(checkID(id)) {
			listBook.remove(getIndex(id));
			System.out.println("Ban da xoa thong tin sach thanh cong !");
		} else {
			System.out.println("ID nay khong ton tai !");
		}
	}
	
}

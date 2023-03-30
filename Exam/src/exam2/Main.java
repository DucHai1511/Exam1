package exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static List<Book> getListBook(File file) {
		List<Book> listBook = new ArrayList<>();
		try(
				FileReader fileReader = new FileReader(file);
				Scanner sc = new Scanner(fileReader);
		) {
			while(sc.hasNext()) { 
				StringTokenizer str = new StringTokenizer(sc.nextLine(), ";");
				Book book = new Book(Integer.parseInt(str.nextToken()), str.nextToken(), str.nextToken());
				listBook.add(book);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listBook;
	}
	public static void main(String[] args) {
		List<Book> listBook = getListBook(new File("C:\\Users\\DucHai\\git\\repository3\\Exam\\src\\txt\\Book.txt"));
		System.out.println("Tong so sach : " + listBook.size());
		System.out.println(listBook);
		Collections.sort(listBook);
		System.out.println(listBook);
	}
}


package exam1;

import java.util.Scanner;

public class Input {
	public int inputScannerInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String check;
			System.out.print("Input: ");
			check = sc.nextLine();
			int x;
			try {
				x = Integer.parseInt(check);
				return x;
			} catch (NumberFormatException e) {
				System.out.println("Ban nhap sai. Vui long nhap lai !");
			}
		}
	}
	
	public String inputScannerString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		return sc.nextLine();
	}
}

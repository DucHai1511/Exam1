package exam1;

import java.util.Scanner;

public class Input {
	public int inputScannerInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int x = sc.nextInt();
				return x;
			}catch (Exception e) {
				System.out.println("Invalid !");
			}finally {
				sc.nextLine();
			}
		}
		
	}
	
	public String inputScannerString() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				String str = sc.nextLine();
				if(str.equals("")) {
					throw new Exception();
				} else {
					return str;
				}
			}catch (Exception e) {
				System.out.println("Invalid !");
			}
		}
		
	}
}

package test_code;

import java.util.Scanner;

public class test_code {
	public boolean same() {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.print("Press enter to conitnue");
			String str = in.nextLine();
			if (str.contentEquals("")) {
				return true;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_code gogo = new test_code();
		boolean test = true;
		Scanner in = new Scanner(System.in);
		int display = in.nextInt();
		while (test) {
			System.out.println("�̰� ����ϸ� ����");

			switch (display) {
			case 1:
				System.out.println("1���Դϴ�.");
				test = gogo.same();
				break;
			case 2:
				System.out.println("2���Դϴ�.");
				break;
			case 3:
				System.out.println("3���Դϴ�.");
				break;
			}
		}
	}
}
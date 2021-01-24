import java.util.Scanner;

public class Java_test {

	public int right(int floor) { // input number
		Scanner sc = new Scanner(System.in);
		while (true) {
			while (!sc.hasNextInt()) {
				sc.next(); 
				System.out.print("wirte correct number: ");
			}
			int floor_c = sc.nextInt();
			if (floor == 1 && floor_c != 1) {
				System.out.print("wirte correct number: ");
			}
			else if(floor_c < 1 || floor < floor_c) {
				System.out.print("wirte correct number: ");
			} 
			else {
				return floor_c;

			}
		}
	}
	
	public int zero_to(int floor) { // 0 or 1 input
		Scanner sc = new Scanner(System.in);
		while (true) {
			while (!sc.hasNextInt()) {
				sc.next(); 
				System.out.print("wirte correct number: ");
			}
			int floor_c = sc.nextInt();
			if (floor_c == 0) {
				return 0;
			}
			else if(floor_c == 1) {
				return 1;
			} 
			else {
				System.out.print("wirte correct number: ");

			}
		}
	}

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
		Java_test calc = new Java_test();
		boolean enterkey = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("----------Setting up hotel-----------");

		System.out.print("-> enter the floor: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("wirte correct floor: ");
		}
		int floor = sc.nextInt();

		System.out.print("-> enter the room: ");
		while (!sc.hasNextInt()) {
			sc.next(); 
			System.out.print("wirte correct room: ");
		}
		int room = sc.nextInt();

		System.out.println(floor + " floor " + room + " room successfully");

		String hotel[][] = new String[floor][room];

		while (enterkey) {
			System.out.println("----------Hotel Management System----------");
			System.out.println("1 - Check In");
			System.out.println("2 - Checkout");
			System.out.println("3 - Display");
			System.out.println("4 - Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Choose option(1-4) : ");

			int display = calc.right(5);

			switch (display) {
			case 1: 
				System.out.println("----------Checkin to hotel-----------");
				System.out.print("-> Enter floor number(1-" + floor + ") : ");
				int floor_ch = calc.right(floor);
				System.out.print("-> Enter room number(1-" + room + ") : ");
				int room_ch = calc.right(room);
				if (hotel[floor_ch - 1][room_ch - 1] != null) {
					System.out.println("this room is already check in, Please find another room!");
				} 
				else {
					System.out.print("-> Enter guest's name : ");
					String name = sc.next();
					hotel[floor_ch - 1][room_ch - 1] = name;
					System.out.println(name + " Checkin successfully!");
				}
					enterkey = calc.same();
					break;
			case 2:
				System.out.println("----------Checkout from hotel-----------");
				System.out.print("-> Enter floor number(1-" + floor + ") : ");
				int floor_out = calc.right(floor);
				System.out.print("-> Enter room number(1-" + room + ") : ");
				int room_out = calc.right(room);
				if (hotel[floor_out - 1][room_out - 1] == null) {
					System.out.println("No one checkin in this room, you can't checkout");
				} else {
					System.out.print(
							"Guest's Name :" + hotel[floor_out - 1][room_out - 1] + ", Press 1 to Checkout 0 to cancel : ");
						int out_number = calc.zero_to(1);
							if (out_number == 1) {
								hotel[floor_out - 1][room_out - 1] = null;
								System.out.println("Checkout successfully");
							} else
								System.out.println("No one checkout this room");
					}
				enterkey = calc.same();
				break;
			case 3:
				System.out.println("----------Display hotel information----------");
				for (int i = 0; i < hotel.length; i++) {
					System.out.print("Floor " + (i + 1) + " : ");
					for (int j = 0; j < hotel[i].length; j++) 
							System.out.print(hotel[i][j]+" ");
					System.out.println();
				}
				enterkey = calc.same();
				break;
			case 4:
				System.out.println("Good bye");
				enterkey = false;
				break;
			}

		}

	}
}

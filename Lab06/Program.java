import java.util.Scanner;



public class Program {
	private Order order1;
	private Scanner scanner;

	public Program() {
		scanner = new Scanner(System.in);
	}

	public Order createNewOrder() {
		order1 = new Order();
		return order1;
	}

	public void addItemToOrder() {
		System.out.println("Ban muon them Media hay Disc? "
						 	+ "\n1. Book"
							+ "\n2. Disc");
		System.out.print("Moi ban lua chon: ");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			Book book = new Book();
			order1.addMedia(book);
			break;
		case 2:
			DigitalVideoDisc disc = new DigitalVideoDisc();
			order1.addMedia(disc);
			break;
		default:
			break;
		}
	}
	
	public void deleteItemByID() {
		System.out.print("Moi ban nhap ID: ");
		int id = scanner.nextInt();
		order1.removeMedia(id);
		scanner.nextLine();
	}
	
	public void displayItems() {
		order1.printOrdered();
	}
}
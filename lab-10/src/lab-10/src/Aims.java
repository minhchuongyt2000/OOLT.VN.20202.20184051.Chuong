import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Collections;
import javax.swing.*;

import jdk.jfr.StackTrace;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;


public class Aims {
    // public static void showMenu() {
    //     System.out.println("Order Management Application");
    //     System.out.println("------------------------");
    //     System.out.println("1. Create new order");
    //     System.out.println("2. Add item to the order");
    //     System.out.println("3. Delete item by id");
    //     System.out.println("4. Display the items list of order");
    //     System.out.println("0. Exit");
    //     System.out.println("-------------------------");
    //     System.out.println("Please choose a number: 0-1-2-3-4");
    // }
    // public static void main(String[] args) {
    //     DigitalVideoDisc disc1 = new DigitalVideoDisc("harry potter", "phieu luu", "minh quy", 120, 4.5f);
    //     DigitalVideoDisc disc2 = new DigitalVideoDisc("harry potter2", "phieu luu2", "minh quy2", 120, 10.1f);
    //     Order order = new Order();
    //     order.addMedia(disc1);
    //     order.addMedia(disc2);
    //     order.getItemsOrdered();
    //     while(true) {
    //         showMenu();
    //         Scanner obj = new Scanner(System.in);
    //         String option = obj.nextLine();
    //         switch(option) {
    //             case "0":
    //                 return;
    //             case "1":
    //                 Order order1 = new Order();
    //                 if(Order.getOrders().size() == Order.MAX_LIMITTED_ORDERS) {
    //                     return;
    //                 }
    //                 order1.getOrders().add(order1);
    //                 continue;
    //             case "2":
    //                 System.out.println("1: DigitalVideoDisc");
    //                 System.out.println("2: Book");
    //                 System.out.println("3: CompactDisc");
    //                 String option2 = obj.nextLine();
    //                 switch(option2) {
    //                     case "1": 
    //                         System.out.println("Title: ");
    //                         String title = obj.nextLine();
    //                         System.out.println("Category: ");
    //                         String category = obj.nextLine();
    //                         System.out.println("Director: ");
    //                         String director = obj.nextLine();
    //                         System.out.println("Length: ");
    //                         int length = obj.nextInt();
    //                         System.out.println("Cost: ");
    //                         float cost = obj.nextFloat();
    //                         DigitalVideoDisc disc = new DigitalVideoDisc(title, category, director, length, cost);
    //                         Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().add(disc);
    //                         continue;
    //                     case "2":
    //                         System.out.println("Title: ");
    //                         String title1 = obj.nextLine();
    //                         System.out.println("Category: ");
    //                         String category1 = obj.nextLine();
    //                         System.out.println("Cost: ");
    //                         float cost1 = obj.nextFloat();
    //                         obj.nextLine();
    //                         System.out.println("Authors: ");
    //                         String authorsString = obj.nextLine();
    //                         ArrayList<String> authors = new ArrayList<String>();
    //                         for(String author : authorsString.split(",")) {
    //                             authors.add(author);
    //                         }
    //                         Book book = new Book(title1, category1, cost1, authors);
    //                         Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().add(book);
    //                         continue;
    //                     case "3":
    //                         System.out.println("Title: ");
    //                         String title2 = obj.nextLine();
    //                         System.out.println("Category: ");
    //                         String category2 = obj.nextLine();
    //                         System.out.println("Cost: ");
    //                         float cost2 = obj.nextFloat();
    //                         obj.nextLine();
    //                         System.out.println("Artist: ");
    //                         String artist2 = obj.nextLine();
    //                         ArrayList<Track>tracks2 = new ArrayList<Track>();
    //                         tracks2.add(new Track("a",1));
    //                         tracks2.add(new Track("b",2));
    //                         CompactDisc compactDisc = new CompactDisc(title2, category2, cost2, artist2, tracks2);
    //                         Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().add(compactDisc);
    //                         System.out.println("Play: ");
    //                         System.out.println("1: Yes");
    //                         System.out.println("2: No");
    //                         int temp = obj.nextInt();
    //                         if(temp == 1) {
    //                             compactDisc.play();
    //                         }
    //                         continue;
    //                     default: 
    //                         System.out.println("Wrong format");
    //                         continue;
    //                 }
    //             case "3":
    //                 System.out.println("Id: ");
    //                 int id = obj.nextInt();
    //                 if(id < 0 || id > Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().size() - 1) {
    //                     System.out.println("Wrong format");
    //                     continue;
    //                 }
    //                 Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().remove(Order.getOrders()
    //                 .get(Order.getOrders().size() - 1).getItemsOrdered().get(id));
    //                 System.out.println("Item was deleted");
    //                 continue;
    //             case "4":
    //                 Order.getOrders().get(Order.getOrders().size() - 1).printItemsOrdered();
    //                 continue;
    //             default:
    //                 System.out.println("Wrong format");
    //                 continue;
    //         }
    //     }   
    // }
    public static void main(String[] args) {
        Track t1 = new Track("quy1", 1);
        Track t2 = new Track("quy2", 2);
        ArrayList<Track> track1 = new ArrayList<Track>();
        track1.add(t1);
        ArrayList<Track> track2 = new ArrayList<Track>();
        track2.add(t2);
        CompactDisc cd1 = new CompactDisc("quy1", "quy1", 1.0f, "quy1", new ArrayList<Track>());
        CompactDisc cd2 = new CompactDisc("quy2", "quy2", 2.0f, "quy2", track2);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("quy", "quy", "quy", 0, 1.0f);
        try {
            cd1.play(); 
        }
        catch(PlayerException err) {
            JFrame mainFrame = new JFrame(err.getMessage().split("\\s+")[1] + " ERROR");
            mainFrame.setSize(500, 500);
            JLabel messageLabel = new JLabel(err.getMessage());
            messageLabel.setBounds(50, 0, 200, 100);
            mainFrame.add(messageLabel);
            StackTraceElement[] stackTrace = err.getStackTrace();
            String stackTraceString = "<html>";
            for(int i = 0; i < stackTrace.length; i++) {
                stackTraceString += stackTrace[i].toString() + "<br>";
            }
            stackTraceString += "</html>";
            JLabel stackTraceLabel = new JLabel(stackTraceString);
            stackTraceLabel.setBounds(60, 30, 500, 100);
            mainFrame.add(stackTraceLabel);
            mainFrame.setLayout(null);
            mainFrame.setVisible(true);
        }
    } 
}

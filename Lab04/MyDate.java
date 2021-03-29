import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private String extensionDay = null;
    String[] validMonths = {"January", "February", "March", "April", "May","July", "June",
                         "August", "September", "October", "November", "December"};
    public int convertWord(String inputWord) {
        switch(inputWord) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
            case "eleven":
                return 11;
            case "twelve":
                return 12;
            case "thirteen":
                return 13;
            case "fourteen":
                return 14;
            case "fifteen":
                return 15;
            case "sixteen":
                return 16;
            case "seventeen":
                return 17;
            case "eighteen":
                return 18;
            case "nineteen":
                return 19;
            case "twenty":
                return 20;
            case "thirty":
                return 30;
            case "forty":
                return 40;
            case "fifty":
                return 50;
            case "sixty":
                return 60;
            case "seventy":
                return 70;
            case "eighty":
                return 80;
            case "ninety":
                return 90;
            case "hundred":
                return 100;
            case "thousand":
                return 1000;
            case "and":
                return 0;
            default:
                return -1;
        }
    }
    public int convertMonth(String inputMonth) {
        for(int i = 0; i < validMonths.length; i++) {
            if(inputMonth == validMonths[i]) {
                return i + 1;
            }
        }
        return 0;
    }
    public int convertDay(String inputDay) {
        switch(inputDay) {
            case "first":
                return 1;
            case "second":
                return 2;
            case "third":
                return 3;
            case "fourth":
                return 4;
            case "fifth":
                return 5;
            case "sixth":
                return 6;
            case "seventh":
                return 7;
            case "eighth":
                return 8;
            case "nineth":
                return 9;
            case "tenth":
                return 10;
            case "eleventh":
                return 11;
            case "twelfth":
                return 12;
            case "thirdteenth":
                return 13;
            case "fourteenth":
                return 14;
            case "fifteenth":
                return 15;
            case "sixteenth":
                return 16;
            case "seventeenth":
                return 17;
            case "eightteenth":
                return 18;
            case "nineteenth":
                return 19;
            case "twentieth":
                return 20;
            case "twenty first":
                return 21;
            case "twenty second":
                return 22;
            case "twenty third":
                return 23;
            case "twenty fourth":
                return 24;
            case "twenty fifth":
                return 25;
            case "twenty sixth":
                return 26;
            case "twenty seventh":
                return 27;
            case "twenty eighth":
                return 28;
            case "twenty nineth":
                return 29;
            case "thirtieth":
                return 30;
            case "thirty first":    
                return 31;
            default:
                return 0;
        }
    } 
    public int convertYear(String inputYear) {
        String[] wordsSplit = inputYear.split(" ");
        int year = 0;
        for(int i = 0; i < wordsSplit.length; i++) {
            if(convertWord(wordsSplit[i]) == -1) {
                return 0;
            }
            else if(wordsSplit[i].equals("thousand")) { 
                year = year + convertWord(wordsSplit[i-1]) * 999;
                continue;
            }
            else if(wordsSplit[i].equals("hundred")) { 
                year += convertWord(wordsSplit[i-1]) * 99;
                continue;
            }
            year = year + convertWord(wordsSplit[i]);
        }
        return year;
    }
    public MyDate() {
        super();
        String currentDate = LocalDate.now().toString();
        this.year = Integer.parseInt(currentDate.substring(0, 4));
        this.month = Integer.parseInt(currentDate.toString().substring(5, 7));
        this.day = Integer.parseInt(currentDate.toString().substring(8));
    }
    public MyDate(int day, int month, int year) {
        super();
        if(day > 31 || day < 1 || month > 12 || month < 1 || year < 0) {
            return;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String day, String month, String year) {
        super();
        if(convertDay(day) == 0 || convertMonth(month) == 0 || convertYear(year) == 0) {
            return;
        }
        this.day = convertDay(day);
        this.month = convertMonth(month);
        this.year = convertYear(year);
        this.extensionDay = day.substring(day.length() - 2);
    }
    public MyDate(String date) {
        super();
        String[] inputDate = date.split(" ");
        String inputYear = inputDate[2];
        String inputMonth = inputDate[0];
        String inputDay = inputDate[1].substring(0, 2);
        int y;
        int d;
        try {
            y = Integer.parseInt(inputYear);
            d = Integer.parseInt(inputDay);
        }   
        catch(Exception err) {
            System.out.println("Wrong Input");
            return;
        }
        if(checkMonth(inputMonth) == 0 || d <= 0 || d >= 32 || y < 0) {
            System.out.println("Wrong Input");
            return;
        }
        this.day = d;
        this.month = checkMonth(inputMonth);
        this.year = y;
    }
    public void print() {
        System.out.println(validMonths[this.getMonth() - 1] + " " + this.getDay() + this.getExtensionDay() + " " + this.getYear());
    }
    public int checkMonth(String month) {
        for(int i = 0; i < validMonths.length; i++) {
            if(month.equals(validMonths[i])) {
                return i + 1;
            }
        }
        return 0;
    }
    public String getExtensionDay() {
        return this.extensionDay;
    }
    public MyDate accept() {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input: ");
            String inputDate = scan.nextLine();
            MyDate temp = new MyDate();
            try {
                temp = new MyDate(inputDate);
            }
            catch(Exception err) {
                System.out.println("Wrong Input");
                continue;
            }
            return temp;
        }
    }
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void printDate() {
        String date = Integer.toString(this.day) + "-" + Integer.toString(this.month) + "-" + Integer.toString(this.year);
        System.out.println(date);
    }
    public static String prependZero(int inputNumber) {
        return (inputNumber < 10 ? "0" + inputNumber : Integer.toString(inputNumber));
    }
    public static void main(String[] args) {
        MyDate test = new MyDate("first", "February", "two thousand and two");
        System.out.println("Choose format: ");
        Scanner obj = new Scanner(System.in);
        String format = obj.nextLine();
        switch(format) {
            case "yyyy-MM-dd":
                System.out.println(test.getYear() + "-" + prependZero(test.getMonth()) + "-" + prependZero(test.getDay()));
                break;
            case "d/M/yyyy":
                System.out.println(prependZero(test.getDay()) + "/" + prependZero(test.getMonth()) + "/" + test.getYear());
                break;
            case "dd-MMM-yyyy":
                System.out.println(prependZero(test.getDay()) + "-" + test.validMonths[test.getMonth() - 1].substring(0, 3) + "-" + test.getYear());
                break;
            case "MMM d yyyy":
                System.out.println(test.validMonths[test.getMonth() - 1].substring(0, 3) + " " + prependZero(test.getDay()) + " " + test.getYear());
                break;
            case "mm-dd-yyyy":
                System.out.println(prependZero(test.getDay()) + "-" + prependZero(test.getMonth()) + "-" + test.getYear());
                break;
            default: 
                System.out.println("Wrong format");
            
        }
        obj.close();
    }     
}
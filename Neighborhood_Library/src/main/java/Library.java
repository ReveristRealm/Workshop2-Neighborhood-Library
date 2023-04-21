import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<Book> Library = new ArrayList<Book>();
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        boolean done = false;

        Book book1 = new Book(1, "34249304", "Jujutsu Kaisen by Gege Akutami ");
        Book book2 = new Book(2, "83275843", "Demon Slayer: Kimetsu no Yaiba by Koyoharu Gotouge");
        Book book3 = new Book(3, "93454345", "My Hero Academia by Kohei Horikoshi");
        Book book4 = new Book(4, "23567437", "Attack on Titan by Hajime Isayama");
        Book book5 = new Book(5, "54335654", "Bleach by Tite Kubo");
        Book book6 = new Book(6, "64338654", "Akame ga Kill by Tetsuya Tashiro ");
        Book book7 = new Book(7, "23454435", "07-Ghost by Yuki Amemiya");

        Library.add(book1);
        Library.add(book2);
        Library.add(book3);
        Library.add(book4);
        Library.add(book5);
        Library.add(book6);
        Library.add(book7);

        while (!done) {
            System.out.println("---------------------------");
            System.out.println("The Store Home Screen: ");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");
            int answer = userInput.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("---------------------------");
                    showBooks();
                    System.out.println("---------------------------");
                    AvailableBooksProcess();
                    break;
                case 2:
                    System.out.println("---------------------------");
                    showOutBooks();
                    checkedOutBooksProcess();
                    break;
                case 3:
                    done = true;
                    return;
                default:
                    System.out.println("Wrong input, please try again");
                    break;
            }
        }
    }
        public static void showBooks(){
            for(int i = 0; i < Library.size(); i++){
                if(!Library.get(i).isCheckedOut())
                    System.out.println(Library.get(i));
            }
        }
        public static void showOutBooks(){
            for(int i = 0; i < Library.size(); i++){
                if(Library.get(i).isCheckedOut())
                    System.out.println(Library.get(i) +", has been check out by: " + Library.get(i).getCheckedOutTo());
            }

        }
        public static void AvailableBooksProcess(){
            System.out.println("Select one option:");
            System.out.println("1 - Select a book");
            System.out.println("2 - Exit to home screen");
            String response = userInput.next();
            if(response.equals("1")){
                System.out.print("Enter you name: ");
                String name = userInput.next();
                System.out.println("What book do you want(Enter the ID)?: ");
                int bookID = userInput.nextInt();
                for(int i = 0; i < Library.size(); i++){
                    if(Library.get(i).getId() == bookID){
                        Library.get(i).checkOut(name);
                        System.out.println("Book: " + Library.get(i).getTitle() + " has been checkout out by " + name );
                        break;
                    }
                }
            }
            if(response.equals("2")){
            }
        }
        public static void checkedOutBooksProcess(){
            System.out.println("---------------------------");
            System.out.println("Enter:");
            System.out.println("C - to Check in a book");
            System.out.println("X - to go back to the home screen");
            String response2 = userInput.next();
            if(response2.equalsIgnoreCase("C")){
                System.out.println("What is the ID of the book you want to return?");
                int response3 = userInput.nextInt();
                for(int i = 0; i < Library.size();i++){
                    if(Library.get(i).getId() == response3){
                        Library.get(i).checkbackIn();
                        System.out.println("Book: " + Library.get(i) + " has been checked back in");
                        break;
                    }
                }
            }
            if (response2.equalsIgnoreCase("x")){
            }
        }

}

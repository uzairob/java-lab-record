import java.util.Scanner; 
class Book { 
 String name; 
 String author; 
 double price; 
 int numPages; 
 public Book(String name, String author, double price, int numPages) { 
 this.name = name; 
 this.author = author; 
 this.price = price; 
 this.numPages = numPages; 
 } 
 public String toString() { 
 return "Book Details:\nName: " + name + "\nAuthor: " + author + 
 "\nPrice: Rs." + price + "\nNumber of Pages: " + numPages; 
 } 
} 
public class BookTest { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter the number of books: "); 
 int n = scanner.nextInt(); 
 Book[] books = new Book[n]; 
 for (int i = 0; i < n; i++) { 
 System.out.println("\nEnter details for Book " + (i + 1) + ":"); 
 System.out.print("Name: "); 
 String name = scanner.next(); 
 System.out.print("Author: "); 
 String author = scanner.next(); 
 System.out.print("Price: Rs."); 
 double price = scanner.nextDouble(); 
 System.out.print("Number of Pages: "); 
 int numPages = scanner.nextInt(); 
 books[i] = new Book(name, author, price, numPages); 
 } 
 System.out.println("\nDetails of the Books:"); 
 for (int i = 0; i < n; i++) { 
 System.out.println("\nBook " + (i + 1) + ":\n" + books[i]); 
 } 
 } 
}

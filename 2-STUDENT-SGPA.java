import java.util.Scanner; 
class Student { 
 void display(String usn, String name, int cr[], int mrks[]) { 
 System.out.println("USN: " + usn + "\n" + "NAME:" + name); 
 for (int i = 0; i < 5; i++) { 
 System.out.println("Credits: " + cr[i] + " Marks: " + mrks[i]); 
 } 
 } 
 void sgpa(int cr[], int mrks[]) { 
 int maxCreMarks = 0, creMarks = 0; 
 for (int i = 0; i < 5; i++) { 
 maxCreMarks += cr[i] * 10; 
 creMarks += ((mrks[i] / 10) + 1) * cr[i]; 
 } 
 double sgpa = (double) (creMarks * 10) / (double) maxCreMarks; 
 System.out.println("SGPA: " + sgpa); 
 } 
} 
public class Main { 
 public static void main(String[] args) { 
 String usn, name; 
 int credits[] = new int[5]; 
 int marks[] = new int[5]; 
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter usn:"); 
 usn = scanner.next(); 
 System.out.println("Enter Name:"); 
 name = scanner.next(); 
 System.out.println("Enter Credits for the five subjects:"); 
 for (int i = 0; i < 5; i++) { 
 credits[i] = scanner.nextInt(); 
 } 
 System.out.println("Enter the marks for all subjects:"); 
 for (int i = 0; i < 5; i++) { 
 marks[i] = scanner.nextInt(); 
 }
 Student student = new Student(); 
 student.display(usn, name, credits, marks); 
 student.sgpa(credits, marks); 
 } 
} 

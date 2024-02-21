// CIE/Student.java 
package CIE; 
public class Student { 
 protected String usn; 
 protected String name; 
 protected int sem; 
 public Student(String usn, String name, int sem) { 
 this.usn = usn; 
 this.name = name; 
 this.sem = sem; 
 } 
} 
// CIE/Internals.java 
package CIE; 
public class Internals extends Student { 
 protected int[] internalMarks; 
 public Internals(String usn, String name, int sem, int[] internalMarks) { 
 super(usn, name, sem); 
 this.internalMarks = internalMarks; 
 } 
}
// SEE/External.java 
package SEE; 
import CIE.Student; 
public class External extends Student { 
 protected int[] seeMarks; 
 public External(String usn, String name, int sem, int[] seeMarks) { 
 super(usn, name, sem); 
 this.seeMarks = seeMarks; 
 } 
} 
// MainFile.java 
import CIE.Internals; 
import SEE.External; 
public class MainFile { 
 public static void main(String[] args) { 
 // Example data 
 Internals studentCIE = new Internals("123", "John", 5, new int[]{80, 75, 90, 85, 88}); 
 External studentSEE = new External("123", "John", 5, new int[]{85, 78, 92, 88, 90}); 
 // Displaying final marks 
 displayFinalMarks(studentCIE, studentSEE); 
 } 
 public static void displayFinalMarks(Internals internals, External external) { 
 System.out.println("Student Details:"); 
 System.out.println("USN: " + internals.usn); 
 System.out.println("Name: " + internals.name); 
 System.out.println("Semester: " + internals.sem); 
 System.out.println("\nFinal Marks:"); 
 for (int i = 0; i < internals.internalMarks.length; i++) { 
 int finalMarks = internals.internalMarks[i] + external.seeMarks[i]; 
 System.out.println("Course " + (i + 1) + ": " + finalMarks); 
 } 
 } 
} 

import java.util.Scanner; 
public class Quadratic { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter the coefficients a, b, and c:"); 
 double a = scanner.nextDouble(); 
 double b = scanner.nextDouble(); 
 double c = scanner.nextDouble(); 
 double d = b * b - 4 * a * c; 
 if (d > 0) { 
 System.out.println("Roots are real and distinct."); 
 double r1 = (-b + Math.sqrt(d)) / (2 * a); 
 double r2 = (-b - Math.sqrt(d)) / (2 * a); 
 System.out.println("First Root: " + r1 + "\nSecond Root: " + r2); 
 } else if (d == 0) { 
 System.out.println("Roots are real and equal."); 
 double r1 = -b / (2 * a); 
 System.out.println("First and Second Root: " + r1); 
 } else { 
 System.out.println("Roots are imaginary."); 
 double realPart = -b / (2 * a); 
 double imaginaryPart = Math.sqrt(Math.abs(d)) / (2 * a); 
 System.out.println("First Root: " + realPart + " + i" + imaginaryPart); 
 System.out.println("Second Root: " + realPart + " - i" + imaginaryPart); 
 } 
 } 
}

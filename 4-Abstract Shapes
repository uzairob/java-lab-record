abstract class Shape { 
 int dim1, dim2; 
 abstract void printArea(); 
} 
class Rectangle extends Shape { 
 Rectangle(int l, int b) { 
 dim1 = l; 
 dim2 = b; 
 } 
 void printArea() { 
 System.out.println("Area of Rectangle = " + (dim1 * dim2)); 
 } 
} 
class Triangle extends Shape { 
 Triangle(int base, int height) { 
 dim1 = base; 
 dim2 = height; 
 } 
 void printArea() { 
 System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2)); 
 } 
} 
class Circle extends Shape { 
 Circle(int r) { 
 dim1 = r; 
 } 
 void printArea() { 
 System.out.println("Area of Circle = " + (3.142 * dim1 * dim1)); 
 } 
} 
public class ShapeDemo { 
 public static void main(String[] args) { 
 Rectangle r = new Rectangle(10, 20); 
 Triangle t = new Triangle(10, 20); 
 Circle c = new Circle(20); 
 r.printArea(); 
 t.printArea(); 
 c.printArea(); 
 } 
} 

class NewThread implements Runnable{ 
 Thread t; 
 NewThread(){ 
 t = new Thread(this , "NThread"); 
 System.out.println("Child thread: "+t); 
 t.start(); 
 } 
 public void run() { 
 try { 
 for(int n=5 ;n>0 ; n--) { 
 System.out.println("CSE:"+n); 
 Thread.sleep(2000); 
 } 
 } 
 catch (InterruptedException ie) { 
 System.out.println("main thread interrupted"); 
 } 
 } 
} 
public class Thread2 { 
 public static void main(String[] args) { 
 new NewThread(); 
 System.out.println("Back in Main"); 
 try { 
 for(int n=5 ; n>0 ; n--) { 
 System.out.println("BMSCE:"+n); 
 Thread.sleep(10000); 
 } 
 } 
 catch (InterruptedException ie) { 
 System.out.println("main thread interrupted"); 
 } 
 } 
 
}

 import java.util.Scanner; 
class Account { 
 String customerName; 
 int accountNumber; 
 String accountType; 
 double balance; 
 public Account(String customerName, int accountNumber, String accountType) { 
 this.customerName = customerName; 
 this.accountNumber = accountNumber; 
 this.accountType = accountType; 
 this.balance = 0; 
 } 
 public void deposit(double amount) { 
 balance += amount; 
 System.out.println("Deposit of " + amount + " successful."); 
 } 
 public void displayBalance() { 
 System.out.println("Current balance: " + balance); 
 } 
} 
class SavingsAccount extends Account { 
 double interestRate; 
 public SavingsAccount(String customerName, int accountNumber) {
 super(customerName, accountNumber, "Savings"); 
 this.interestRate = 0.05; // 5% interest rate 
 } 
 public void depositInterest() { 
 double interest = balance * interestRate; 
 deposit(interest); 
 System.out.println("Interest deposited: " + interest); 
 } 
 public void withdraw(double amount) { 
 if (balance >= amount) { 
 balance -= amount; 
 System.out.println("Withdrawal of " + amount + " successful."); 
 } else { 
 System.out.println("Insufficient balance for withdrawal."); 
 } 
 } 
} 
class CurrentAccount extends Account { 
 double minimumBalance; 
 double serviceCharge; 
 public CurrentAccount(String customerName, int accountNumber) { 
 super(customerName, accountNumber, "Current"); 
 this.minimumBalance = 1000; // Minimum balance required 
 this.serviceCharge = 50; // Service charge if balance falls below minimum 
 } 
 public void withdraw(double amount) { 
 if (balance - amount >= minimumBalance) { 
 balance -= amount; 
 System.out.println("Withdrawal of " + amount + " successful."); 
 } else { 
 System.out.println("Insufficient balance for withdrawal, Service charge of " + serviceCharge + " 
will be applied."); 
 balance -= serviceCharge; 
 } 
 } 
} 
public class Bank { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter name for savings account: "); 
 String savingsName = scanner.nextLine(); 
 System.out.println("Enter account number for savings account: "); 
 int savingsNumber = scanner.nextInt(); 
 SavingsAccount savingsAccount = new SavingsAccount(savingsName, savingsNumber); 
 System.out.println("Enter name for current account: "); 
 scanner.nextLine(); // Consume newline 
 String currentName = scanner.nextLine(); 
 System.out.println("Enter account number for current account: "); 
 int currentNumber = scanner.nextInt(); 
 CurrentAccount currentAccount = new CurrentAccount(currentName, currentNumber); 
 System.out.println("Enter amount to deposit into savings account: "); 
 double savingsDeposit = scanner.nextDouble(); 
 savingsAccount.deposit(savingsDeposit); 
 savingsAccount.displayBalance(); 
 System.out.println("Enter amount to deposit into current account: "); 
 double currentDeposit = scanner.nextDouble(); 
 currentAccount.deposit(currentDeposit); 
 currentAccount.displayBalance(); 
 System.out.println("Enter amount to withdraw from savings account: "); 
 double savingsWithdraw = scanner.nextDouble(); 
 savingsAccount.withdraw(savingsWithdraw); 
 savingsAccount.displayBalance(); 
 System.out.println("Enter amount to withdraw from current account: "); 
 double currentWithdraw = scanner.nextDouble(); 
 currentAccount.withdraw(currentWithdraw); 
 currentAccount.displayBalance(); 
 } 
}

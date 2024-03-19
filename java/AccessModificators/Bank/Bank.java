
package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Sonicko", 100, "1");
    accountTwo = new CheckingAccount("Loki", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    
    System.out.println("El saldo inicial de la cuenta es: " + bankOfGods.accountOne.getBalance());
  
    bankOfGods.accountOne.consignar(20000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(35000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println("El saldo final de la cuenta es: " + bankOfGods.accountOne.getBalance());
    System.out.println(" El interes con este total es de: " + bankOfGods.accountOne.getMonthlyInterest());
    
    bankOfGods.accountOne.retirar(20000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(35000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
  }
}
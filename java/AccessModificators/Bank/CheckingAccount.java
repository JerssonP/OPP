/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;	
    id = inputId;
    interestRate = 0.02;
    // this.
  }

  public int getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
  public void consignar(int montoTotal){
    if (montoTotal > 0){
        this.balance += montoTotal;
        System.out.println ("Tu saldo es: " + this.balance);
    }
  }
  public void retirar(int montoTotal){
        this.balance -= montoTotal;
        System.out.println ("Tu saldo restante es: " + this.balance);
    }
  
  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}
public class Account {
//atributos
private double bankAccount1;
private double bankAccount2;
private double bankAccount3;
private double bankAccount4;
private double cash;
public Account(double bankAccount1, double bankAccount2, double bankAccount3, double bankAccount4, double cash) {
    this.bankAccount1 = bankAccount1;
    this.bankAccount2 = bankAccount2;
    this.bankAccount3 = bankAccount3;
    this.bankAccount4 = bankAccount4;
    this.cash = cash;
}
public double getBankAccount1() {
    return bankAccount1;
}
public void setBankAccount1(double monto) {
    if(monto>=0){
this.bankAccount1 = monto;
    }
    }
public double getBankAccount2() {
    return bankAccount2;
}
public void setBankAccount2(double monto) {
    if(monto>=0){
this.bankAccount2 = monto;
    }
    
}
public double getBankAccount3() {
    return bankAccount3;
}
public void setBankAccount3(double monto) {
    if(monto>=0){
this.bankAccount3 = monto;
    }
   
}
public double getBankAccount4() {
    return bankAccount4;
}
public void setBankAccount4(double monto) {
    if(monto>=0){
this.bankAccount4 = monto;
    }
    
}
public double getCash() {
    return cash;
}
public void setCash(double monto) {
    if(monto>=0){
this.cash = monto;
    }
    
}


    
}
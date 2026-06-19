public class DebtPayment {
//atributos
private double creditCard1;
private double creditCard2;
private double creditCard3;
private double creditCard4;
private double creditCard5;  
private double loan1;
private double loan2;
private double loan3;
private double loan4;
private double loan5;
public DebtPayment (double creditCard1, double creditCard2, double creditCard3, double creditCard4, double creditCard5, double loan1, double loan2, double loan3, double loan4, double loan5) {
    this.creditCard1 = creditCard1;
    this.creditCard2 = creditCard2;
    this.creditCard3 = creditCard3;
    this.creditCard4 = creditCard4;
    this.creditCard5 = creditCard5;
    this.loan1 = loan1;
    this.loan2 = loan2;
    this.loan3 = loan3;
    this.loan4 = loan4;
    this.loan5 = loan5;
}
public double getCreditCard1() {
    return creditCard1;
}

public void setCreditCard1(double monto) {
    if(monto>=0){
this.creditCard1 = monto;
    }
}

public double getCreditCard2() {
    return creditCard2;
}
public void setCreditCard2(double monto) {
    if(monto>=0){
    this.creditCard2 = monto;
    }
}
public double getCreditCard3() {
    return creditCard3;
}
public void setCreditCard3(double monto) {
    if(monto>=0){
    this.creditCard3 = monto;
    }
}
public double getCreditCard4() {
    return creditCard4;
}
public void setCreditCard4(double monto) {
    if(monto>=0){
    this.creditCard4 = monto;
    }
}
public double getCreditCard5() {
    return creditCard5;
}
public void setCreditCard5(double monto) {
    if(monto>=0){
    this.creditCard5 = monto;
    }
}
public double getLoan1() {
    return loan1;
}
public void setLoan1(double monto) {
    if(monto>=0){
    this.loan1 = monto;
    }
}

public double getLoan2() {
    return loan2;
}
public void setLoan2(double monto) {
    if(monto>=0){
    this.loan2 = monto;
    }
}

public double getLoan3() {
    return loan3;
}
public void setLoan3(double monto) {
    if(monto>=0){
    this.loan3 = monto;
    }
}
public double getLoan4() {
    return loan4;
}
public void setLoan4(double monto) {
    if(monto>=0){
    this.loan4 = monto;
    }
}
public double getLoan5() {
    return loan5;
}
public void setLoan5(double monto) {
    if(monto>=0){
    this.loan5 = monto;
    }
}


}
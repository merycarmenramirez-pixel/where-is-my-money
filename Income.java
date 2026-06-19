public class Income{
//atributos
private double primaryJob;
private double secundaryJob;
private double income3;
private double income4;
private double income5;
//constructor
public Income (double primaryJob, double secundaryJob, double income3, double income4, double income5 ){
    this.primaryJob = primaryJob;
    this.secundaryJob = secundaryJob;
    this.income3 = income3;
}

// el monto seria el valor a ingresar)
double getPrimaryJob(){
    return primaryJob;
}

void setPrimaryJob(double monto){
    if (monto>=0){
        this.primaryJob = monto;
    }                                            
       
}

double getSecundaryJob(){
    return secundaryJob;
}

void setSecundaryJob (double monto){                        
    if (monto>=0){
        this.secundaryJob = monto;        
    }
}

double getIncome3 (){
    return income3;
}
void setIncome3 (double monto){
    if (monto>=0){  
        this.income3 = monto;      
    }
}


double getIncome4 (){
    return income4;
}
void setIncome4 (double monto){
    if (monto>=0){  
        this.income4 = monto;      
    }
}

double getIncome5 (){
    return income5;
}

void setIncome5 (double monto){
    if (monto>=0){  
        this.income5 = monto;      
    }
}






}

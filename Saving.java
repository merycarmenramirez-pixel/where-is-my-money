public class Saving {
    //atributos
    private double saving1;
    private double saving2;
    private double saving3;
//consturctor
Saving (double saving1, double saving2, double saving3) {
    this.saving1 = saving1;
    this.saving2 = saving2;
    this.saving3 = saving3;
}
double getSaving1(){
    return saving1;
}
double getSaving2(){
    return saving2;
}
double getSaving3(){
    return saving3;
}
// el monto seria el valor a ingresar
void setSaving1 (double monto){
    if (monto>=0){
        this.saving1 = monto;
    }
}
void setSaving2 (double monto){
    if (monto>=0){
        this.saving2 = monto;
            }
}
void setSaving3 (double monto){
    if (monto>=0){
        this.saving3 = monto;
    }
}
}
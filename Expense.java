public class Expense {
    private String categoria;
    private double monto;

    //constructor
    public Expense (String categoria, double monto){
        this.categoria = categoria;
        this.monto = monto;
    }
    String getCategoria (){
        return categoria;
    }

    void setCategoria(String categoria){
    this.categoria = categoria;
    }

    double getMonto(){
        return monto;
    }
    void setMonto (double monto){
        if(monto>=0){
            this.monto = monto;
        }
    }


}
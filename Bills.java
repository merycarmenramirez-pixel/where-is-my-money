public class Bills{
    //atributos
    private double rent;
    private double utilities;
    private double mobilePhone;
    private double socialSecurity;
    
    //constructor
    Bills (double rent, double utilities, double mobilePhone, double socialSecurity){
         this.rent = rent;
         this.utilities = utilities;
         this.mobilePhone = mobilePhone;
         this.socialSecurity = socialSecurity;
    }
    
    double getRent(){
        return rent;
    }

    void setRent (double monto){
        if (monto>=0){
            this.rent = monto;
        }
    }


    double getUtilities (){
        return utilities;
    }
     void setUtilities (double monto){
        if (monto>=0){
            this.utilities = monto;
        }
    }

    double getMobilePhone (){
        return mobilePhone;
    }
    void setMobilePhone (double monto){
        if (monto>=0){
            this.mobilePhone = monto;
        }
    }
    

    double getSocialSecurity (){
        return socialSecurity;
    }
    
    void setSocialSecurity (double monto){
        if (monto>=0){
            this.socialSecurity = monto; 
        }
    }                                                                                




}


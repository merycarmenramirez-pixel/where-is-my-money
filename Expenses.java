public class Expenses{
    //atributos
    private double aiTools;
    private double beauty;
    private double books;
    private double clothes;
    private double coffee;
    private double education;
    private double entertaiment;
    private double gift;
    private double groceries;
    private double healtCare;
    private double homeSupplies;
    private double other;
    private double personalCare;
    private double petAndPetFood;
    private double transportation;
    private double restaurant;
    private double suscription;
    private double technology;
    private double travel;
    public Expenses(double aiTools, double beauty, double books, double clothes, double coffee, double education,
            double entertaiment, double gift, double groceries, double healtCare, double homeSupplies, double other,
            double personalCare, double petAndPetFood, double transportation, double restaurant, double suscription,
            double technology, double travel) {
        this.aiTools = aiTools;
        this.beauty = beauty;
        this.books = books;
        this.clothes = clothes;
        this.coffee = coffee;
        this.education = education;
        this.entertaiment = entertaiment;
        this.gift = gift;
        this.groceries = groceries;
        this.healtCare = healtCare;
        this.homeSupplies = homeSupplies;
        this.other = other;
        this.personalCare = personalCare;
        this.petAndPetFood = petAndPetFood;
        this.transportation = transportation;
        this.restaurant = restaurant;
        this.suscription = suscription;
        this.technology = technology;
        this.travel = travel;
    }
    public double getAiTools() {
        return aiTools;
    }
    public void setAiTools(double monto) {
        if(monto>=0){
        this.aiTools = monto;
        }
    }

    public double getBeauty() {
        return beauty;
    }
    public void setBeauty(double monto) {
        if(monto>=0){
        this.beauty = monto;
        }
    }

    public double getBooks() {
        return books;
    }
    public void setBooks(double monto) {
        if(monto>=0){
        this.books = monto;
        }
    }
    public double getClothes() {
        return clothes;
    }
    public void setClothes(double monto) {
        if(monto>=0){
        this.clothes = monto;
        }
    }


    public double getCoffee() {
        return coffee;
    }
    public void setCoffee(double monto) {
        if(monto>=0){
        this.coffee = monto;
        }
    }

    public double getEducation() {
        return education;
    }
    public void setEducation(double monto) {
        if(monto>=0){
        this.education = monto;
        }
    }
    public double getEntertaiment() {
        return entertaiment;
    }
    public void setEntertaiment(double monto) {
        if(monto>=0){
        this.entertaiment = monto;
        }
    }
    public double getGift() {
        return gift;
    }
    public void setGift(double monto) {
        if(monto>=0){
        this.gift = monto;
        }
    }
    public double getGroceries() {
        return groceries;
    }
    public void setGroceries(double monto) {
        if(monto>=0){
        this.groceries = monto;
        }
    }
    public double getHealtCare() {
        return healtCare;
    }
    public void setHealtCare(double monto) {
        if(monto>=0){
        this.healtCare = monto;
        }
    }
    public double getHomeSupplies() {
        return homeSupplies;
    }
    public void setHomeSupplies(double monto) {
        if(monto>=0){
        this.homeSupplies = monto;
        }
    }
    public double getOther() {
        return other;
    }
    public void setOther(double monto) {
        if(monto>=0){
        this.other = monto;
        }
    }
    public double getPersonalCare() {
        return personalCare;
    }
    public void setPersonalCare(double monto) {
        if(monto>=0){
        this.personalCare = monto;
        }
    }
    public double getPetAndPetFood() {
        return petAndPetFood;
    }
    public void setPetAndPetFood(double monto) {
        if(monto>=0){
        this.petAndPetFood = monto;
        }
    }
    public double getTransportation() {
        return transportation;
    }
    public void setTransportation(double monto) {
        if(monto>=0){
        this.transportation = monto;
        }
    }
    public double getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(double monto) {
        if(monto>=0){
        this.restaurant = monto;
        }
    }
    public double getSuscription() {
        return suscription;
    }
    public void setSuscription(double monto) {
        if(monto>=0){
        this.suscription = monto;
        }
    }
    public double getTechnology() {
        return technology;
    }
    public void setTechnology(double monto) {
        if(monto>=0){
        this.technology = monto;
        }
    }
    public double getTravel() {
        return travel;
    }
    public void setTravel(double monto) {
        if(monto>=0){
        this.travel = monto;
        }
    }




}
public class Car{
    private String model;
    private int year;
    public Car(String md,int yr){
        this.model = md;
        this.year=yr;    
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String Tostring(){
        return "model:  "+ model +" year: "+ year;
    }
    public boolean equals (Car other){
        if(this.model == other.model&& this.year == other.year){
            return true;
        }
        else {
            return false;
        }
    }
}
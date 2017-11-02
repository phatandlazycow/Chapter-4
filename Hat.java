public class Hat{
    private String type;
    private Boolean worn;
    private int age;
    public Hat(String typ, Boolean wrn,int old){
        this.type = typ;
        this.worn = wrn;
        this.age = old;
    }
    public Hat makeHat(){
         Hat top = new Hat ("top",false,5);
         return top;
    }
    public String getType(){
        return this.type;
    }
    public Boolean getWorn(){
        return this.worn;
    }
    public String ageString(){
        return "the age is "+ this.age;
    }
}
public class Pet{
    private String type;
    private String name;
    private int age;
    private static int numPets;
    public Pet(String typ, String nm, int ag){
        this.type = typ;
        this.name = nm;
        this.age = ag;
        numPets++;
    }
    public String changeAge(){
        return "the age is " + this.age;
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(Pet other){
        if(this.name.equals (other.name)){
            return true;
        }
        else {return false;
        }
    }
    public static void example(){
        System.out.print("this is a static method!");
    }
}
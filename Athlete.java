
public class Athlete
{
   private String name;
   private int age;
   public Athlete(String nm, int yr){
       name = nm;
       age = yr;
    }
   public String toString(){
       return this.name + " is " + age +" years old";
    }
    public boolean equals(Athlete other){
        if (this.name.equals(other.name) && (this.age == (other.age))){
            return true;
        }
        else {
            return false;
        }
    }
}

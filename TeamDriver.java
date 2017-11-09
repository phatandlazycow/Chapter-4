
public class TeamDriver
{
  public static void main(String[] args){
      Athlete john = new Athlete("John",15);
      Athlete jacob = new Athlete("Jacob",16);
      Team soccer = new Team(5,"Soccer");
      soccer.addAthlete(1,john);
      soccer.addAthlete(0,jacob);
      System.out.println(soccer);
      System.out.println(john.equals(jacob));
      System.out.println(jacob.equals(jacob));
  }
}

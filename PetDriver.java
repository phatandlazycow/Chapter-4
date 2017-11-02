public class PetDriver{
    public static void main(String[] arg){
        Pet buster = new Pet("doggo","buster",6);
        System.out.println(buster.getName()+buster.getType());
        Pet mike = new Pet("fish","mike",5);
        System.out.println(buster.equals(mike));
        Pet.example();
    }
}
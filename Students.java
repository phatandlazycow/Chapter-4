public class Students
{
    private int idNumber;
    private String name;
    private Students bestFriend;
    private Pet pete;
    private Hat top;
    public Students(){
        
    }
    
    public Students(int num, String nm){
        this.idNumber = num;
        this.name = nm;
    }
    public String getName(){
        return this.name;
    }
    public int combineIDs(){
        return this.idNumber + bestFriend.idNumber;
    }
    public Students makeStudents(){
        Students joe = new Students(this.idNumber, bestFriend.name);
        return joe;
    }
    public String toString(){
        return "The student name is: " +this.name;
    }
}

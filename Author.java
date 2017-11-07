public class Author{
    private String name;
    private int age;
    public Author(String nm, int ag){
        this.name = nm;
        this.age = ag;
    } 
    public String tostring(){
        return "name: "+ this.name + " age: "+ this.age;
    }    
}
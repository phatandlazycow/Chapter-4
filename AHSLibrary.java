public class AHSLibrary{
    public static void main(String[] args){
        Library ahs = new Library(10,"Acalanes");
        Author joe = new Author("Joe", 23);
        Book b = new Book(joe, "Java Book");
        ahs.addBook(0,b);
        System.out.println(ahs);
    }


}
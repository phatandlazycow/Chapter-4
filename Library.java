public class Library{
    private String name;
    private Book[] books;
    public Library(int size, String nm){
        this.books = new Book[size];
        this.name = nm;
    }
    public void addBook(int location, Book b){
        books[location] = b;
    }
    public String toString(){
        String output = "The library "+ name +" has the following: \n" ;
        for(Book b : books){
            output += b.toString() +"\n";
        }
        return output;
    }
}
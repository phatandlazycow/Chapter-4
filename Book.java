public class Book{
    private Author bookAuthor;
    private String title;
    public Book(Author athr,String ttl){
        this.title = ttl;
        this.bookAuthor = athr;
    }
    public String tostring(){
        return  " title: " +this.title + bookAuthor;
    }
}
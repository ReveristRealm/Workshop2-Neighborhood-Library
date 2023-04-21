public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(){

    }
    public Book(int id, String isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false ;
        this.checkedOutTo = "";
    }
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    //GETTERS
    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public String getTitle() {
        return title;
    }
    public String getCheckedOutTo() {
        return  checkedOutTo;
    }
    ///Methods
    public void checkOut(String name){
        checkedOutTo = name;
        isCheckedOut = true;
    }
    public void checkbackIn(){
        checkedOutTo = "";
        isCheckedOut = false;
    }
    public String toString(){
        return "BookId:" + id + "| ISBN:" + isbn + "| Title:" + title;
    }
}

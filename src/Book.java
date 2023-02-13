public class Book {
    private int inventoryNumber;
    private String author;
    private String title;
    private String price;

    public Book(){
        this.inventoryNumber = 1;
        this.author = "Tsanov";
        this.title = "Pri Tsanov";
        this.price = "12.99";
    }

    public Book(int inventoryNumber, String author, String title, String price) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "inventoryNumber=" + inventoryNumber +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class LendingRegistry {
    private Book book;
    private Reader reader;

    public LendingRegistry(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }


    Scanner scanner = new Scanner(System.in);
    int option;
    ArrayList<LendingRegistry> lendingRegistries = new ArrayList<>();
        while (true) {
        System.out.println("Menu");
        System.out.println("1. Insert data");
        System.out.println("2. Print data");
        System.out.print("Choose: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                insertInfo(lendingRegistries);
                break;
            case 2:
                printInfo(lendingRegistries);
                break;

            default:
                System.out.println(":(");
        }
    }
    public void printInfo(ArrayList<LendingRegistry> lendingRegistries) {
        for (LendingRegistry lr : lendingRegistries) {
            System.out.println(lr.toString());
        }
    }
    public void insertInfo(ArrayList<LendingRegistry> lendingRegistries){

    }
}


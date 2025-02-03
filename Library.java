abstract class Item {
    protected String title, author;
    protected int publicationYear;
    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public abstract void displayDetails();
}
public class Library {
    public static void main(String[] args) {
        Item book = new Item("The Alchemist", "Paulo Coelho", 1988) {
            private String genre = "Fiction";
            public void displayDetails() {
                System.out.println("Book Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Publication Year: " + publicationYear);
                System.out.println("Genre: " + genre);
            }
        };
        Item magazine = new Item("National Geographic", "Various", 2023) {
            private int issueNumber = 12;
            public void displayDetails() {
                System.out.println("Magazine Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Publication Year: " + publicationYear);
                System.out.println("Issue Number: " + issueNumber);
            }
        };
        book.displayDetails();
        magazine.displayDetails();
    }
}

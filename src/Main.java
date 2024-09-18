public class Main {
    public static void main(String[] args) {
        App.main();
    }
}

class App {
    public static void main() {
        Author firstAuthor = new Author("Kim", "Robinson");
        Author secondAuthor = new Author("Kim", "Robinson");

        Book firstBook = new Book("Red Mars", firstAuthor, 1992);
        Book secondBook = new Book("Green Mars", secondAuthor, 1993);

        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());

        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());

        System.out.println(firstBook.equals(secondBook));
        System.out.println(secondBook.equals(firstBook));

    }
}


class Author {

    String firstName;
    String secondName;

    public Author() {
        firstName = "Undefined";
        secondName = "Undefined";
    }

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return firstName + " " + secondName;
    }

    public boolean equals(Object obj){
        return obj instanceof Author;
    }

    public int hashCode() {
        return 10*(this.toString()).hashCode();
    }

}

class Book {

    String name;
    Author author;
    int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author.getFirstName() + " " + author.getSecondName();
    }

    public String toString() {
        return author.toString() + " " + year + " \"" + name + "\"";
    }

    public boolean equals(Object obj){
        return obj instanceof Book;
    }

    public int hashCode() {
        return 10 * author.hashCode() + 1;
    }


}
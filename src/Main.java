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

        System.out.println(firstAuthor.equals(secondAuthor));
        System.out.println(secondAuthor.equals(firstAuthor));
    }
}



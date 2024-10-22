import java.util.Objects;

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
    @Override
    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()){
            return false;
        }
        Book book2 = (Book) other;
        return (name.equals(book2.name) && this.year == book2.year && author.equals(book2.author));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,author,year);
    }


}

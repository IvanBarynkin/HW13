import java.util.Objects;

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

    @Override
    public boolean equals(Object other) {
        if(this.getClass()!=other.getClass()){
            return false;
        }
        Author author2 = (Author) other;
        return (firstName.equals(author2.firstName) && secondName.equals(author2.secondName));

    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName,secondName);
    }

}

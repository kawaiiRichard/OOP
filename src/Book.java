public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title: " + title +
                ", author: " + author +
                ", year: " + year +
                '}';
    }
}
class Author {
    private String name;
    private String gender;
    private String email;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author {" +
                "name: " + name +
                ", gender: " + gender +
                ", email: " + email +
                '}';
    }
}

class Main1 {
    public static void main(String[] args) {
        Author author = new Author("Таджик", "Мужик", "serega2009pro@mail.ru");
        Book book = new Book("На даче)", author, 1918);

        System.out.println("Автор книги:");
        System.out.println(author);

        System.out.println("Информация о книге:");
        System.out.println(book);
    }
}

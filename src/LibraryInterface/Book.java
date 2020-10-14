package LibraryInterface;

public class Book {

    private String Title;
    private String Author;
    boolean isavailable;
    boolean borrowed = false;

    Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }

    String getTitle() {
        return Title;
    }

    String getAuthor() {
        return Author;
    }

}

class Patron {

    int booksb = 0;
    boolean borrow;
    boolean canBorrow = true;
    int hasbooks = 0;

    private String Name;

    Patron(String Name) {
        this.Name = Name;
    }

    String getName() {
        return Name;
    }


    boolean borrow(Book b) {
        if (hasbooks <= 3) {
            canBorrow = true;
            hasbooks++;
            return true;
        } else if (hasbooks >= 4) {
            canBorrow = false;
            return false;
        } 
        else if (hasbooks >= 3 || booksb <= 3) {
            canBorrow = false;
        }
        return canBorrow;
    }

    boolean returnBook(Book b1) {
        return false;
    }

    boolean hasBook(Book b1) {
        if (borrow == true) {
            booksb++;
        }
        if (booksb == 3) {
            canBorrow = false;
        } else {
            canBorrow = true;
        }
        return canBorrow;

    }

}

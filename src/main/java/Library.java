public class Library<T extends Info> {
   private T book;

    public Library(T book) {
        this.book = book;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T genre) {
        this.book = book;
    }
}

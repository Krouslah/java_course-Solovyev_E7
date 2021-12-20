public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Методичка", "Донгак Б.М.", true);
        Magazine book3 = new Magazine("Машинки", "ДА");
        Library<Book> info = new Library<>(book1);
        Library<Magazine> info3 = new Library<>(book3);
        System.out.println(book1);
        System.out.println(info.getBook().isBurning());
        System.out.println(book3);
        System.out.println(info3.getBook().isBurning());
    }
}

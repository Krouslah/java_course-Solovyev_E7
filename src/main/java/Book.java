public class Book implements Info {
    private String name;
    private String author;
    private boolean flag;

    public Book(String name, String author, boolean flag) {
        this.name = name;
        this.author = author;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String isBurning() {
        if (flag) return "Книга сгорит и очень успешно";
        return "Не горит, падла";
    }
    @Override
    public String toString(){
        return "["+this.name+", "+this.author+"]";
    }
}

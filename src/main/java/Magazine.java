public class Magazine implements Info {
    private String name;
    private String author;
    private boolean flag;

    public Magazine(String name, String author) {
        this.name = name;
        this.author = author;
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
        if (flag) return "Журнал сгорит и очень успешно";
        return "Не горит, падла";
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.author + "]";
    }
}

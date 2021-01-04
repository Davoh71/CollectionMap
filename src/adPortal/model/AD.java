package adPortal.model;

import java.util.Date;

public class AD {
    private String title;
    private String text;
    private String price;
    private Date date;
    private String categoty;
    private String author;

    public AD(String title, String text, String price, Date date, String categoty, String author) {
        this.title = title;
        this.text = text;
        this.price = price;
        this.date = date;
        this.categoty = categoty;
        this.author = author;
    }
    public AD(){

    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getCategoty() {
        return categoty;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AD ad = (AD) o;

        if (title != null ? !title.equals(ad.title) : ad.title != null) return false;
        if (text != null ? !text.equals(ad.text) : ad.text != null) return false;
        if (price != null ? !price.equals(ad.price) : ad.price != null) return false;
        if (date != null ? !date.equals(ad.date) : ad.date != null) return false;
        if (categoty != null ? !categoty.equals(ad.categoty) : ad.categoty != null) return false;
        return author != null ? author.equals(ad.author) : ad.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (categoty != null ? categoty.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AD{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", price='" + price + '\'' +
                ", date=" + date +
                ", categoty='" + categoty + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

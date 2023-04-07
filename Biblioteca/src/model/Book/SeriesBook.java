package model.Book;

import model.autor.Author;

public class SeriesBook extends Book{
    protected String seriesName;

    protected int bookNumber;

    public SeriesBook() {
    }

    public SeriesBook(int pageNumber, String title, Author author, String genre, float assurance, int exemplare, double rating, String seriesName, int bookNumber) {
        super(pageNumber, title, author, genre, assurance, exemplare, rating);
        this.seriesName = seriesName;
        this.bookNumber = bookNumber;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "SeriesBook{" +
                "seriesName='" + seriesName + '\'' +
                ", bookNumber=" + bookNumber +
                ", pageNumber=" + pageNumber +
                ", title='" + title + '\'' +
                ", bookId=" + bookId +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", assurance=" + assurance +
                ", exemplare=" + exemplare +
                ", rating=" + rating +
                '}';
    }
}

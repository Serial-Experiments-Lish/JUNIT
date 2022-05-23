package org.junit.jupiter;

public class Book {
    private static String bookTitle;
    private int pageCount;
    private int yearPublished;

    public Book (String title, int pages, int year) {
        this.bookTitle = title;
        this.pageCount = pages;
        this.yearPublished = year;
    }

    public static String getBookTitle() {
        return bookTitle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return getBookTitle() + ", " + getPageCount() + " pages, " + getYearPublished();
    }
}
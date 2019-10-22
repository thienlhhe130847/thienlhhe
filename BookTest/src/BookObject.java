/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class BookObject {
    private String BookCode;
    private String BookName;
    private String Author;
    private String Publisher;
    private int year;
    private boolean Rent;

    public BookObject(String BookCode, String BookName, String Author, String Publisher, int year, boolean Rent) {
        this.BookCode = BookCode;
        this.BookName = BookName;
        this.Author = Author;
        this.Publisher = Publisher;
        this.year = year;
        this.Rent = Rent;
    }

    public BookObject() {
    }

    public String getBookCode() {
        return BookCode;
    }

    public void setBookCode(String BookCode) {
        this.BookCode = BookCode;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRent() {
        return Rent;
    }

    public void setRent(boolean Rent) {
        this.Rent = Rent;
    }
    
    
}

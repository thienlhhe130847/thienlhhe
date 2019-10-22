
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Controller {
    Book_GUI bg;
    ArrayList<BookObject> list = new ArrayList<>();
    public ArrayList<BookObject> getListBook(){
        return list; 
    }
    public int checkExist(String code) {
        for (int i = 0; i < list.size(); i++) {
            if(code.equalsIgnoreCase(list.get(i).getBookCode())) {
                return i;
            }
        }
        return -1;
    }
    public int checkName(String code) {
        for (int i = 0; i < list.size(); i++) {
            if(code.equalsIgnoreCase(list.get(i).getBookName())) {
                return i;
            }
        }
        return -1;
    }
    public void addBook(BookObject b) {
        list.add(b);
    }
    public void removeBook(int Selected) {
        list.remove(Selected);
    }
    public boolean checkBookChange(BookObject b) {
        for (BookObject x : list) {
            
                if(!b.getAuthor().equals(x.getAuthor()) || !b.getBookName().equals(x.getBookName())
                        || !b.getPublisher().equals(x.getPublisher())
                        || b.getYear() != x.getYear()
                        || b.isRent() != x.isRent()) {
                    return true;
                }
            
        }
        return false;
    }
    public void updateBook(BookObject b) {
        for (BookObject x : list) {
            if(b.getBookCode().equals(x.getBookCode())) {
                x.setBookName(b.getBookName());
                x.setAuthor(b.getAuthor());
                x.setPublisher(b.getPublisher());
                x.setYear(b.getYear());
                x.setRent(b.isRent());
            }
        }
    }
    public boolean checkEmpty(String input) {
        if(input.matches("\\s+") || input.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}

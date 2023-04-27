package sana.hibernate;
import jakarta.persistence.*;
@Entity
@Table(name="book_inform")
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="book_id")
private int bookid;
private String bookName;
private String authName;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthName() {
	return authName;
}
public void setAuthName(String authName) {
	this.authName = authName;
}
public Book(int bookid, String bookName, String authName) {
super();
this.bookid = bookid;
this.bookName = bookName;
this.authName = authName;
}
@Override
public String toString() {
return "Book [bookid=" + bookid + ", bookName=" + bookName + ", authName=" + authName + "]";
}
}


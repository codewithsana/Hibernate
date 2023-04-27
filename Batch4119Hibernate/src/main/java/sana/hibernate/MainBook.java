package sana.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainBook {
public static void main(String[] args) {
Book clang = new Book(1234,"C Programming","Dennis Ritchie");
Book jlang = new Book(3456,"Java Programming","James Gosling");
Book cpplang = new Book(2545,"C++ Programming","Bjarne Stroustop");
Transaction txn;
try(Session session = HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(clang);
session.save(jlang);
session.save(cpplang);
txn.commit();
}
}
}

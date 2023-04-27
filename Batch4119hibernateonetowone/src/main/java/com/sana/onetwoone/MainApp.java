package com.sana.onetwoone;


import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Person deepak = new Person("deepak kumar","Delhi");
Adhaar ada = new Adhaar(71122345);
deepak.setAdhar(ada);
Transaction txn;
try(Session session=Hibernateutil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(deepak);
txn.commit();
}
}
}
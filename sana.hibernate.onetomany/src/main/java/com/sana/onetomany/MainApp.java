package com.sana.onetomany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Cart car = new Cart();
Item item1 = new Item("BIS24",4,car);
Item item2 = new Item("SOP45",3,car);
Set<Item> itemSet = new HashSet<Item>();
itemSet.add(item1);itemSet.add(item2);
car.setItems(itemSet);
car.setName("Arun");
car.setTotal(4*24+3*45);
Transaction txn;
try(Session session = Hibernateutil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(car);
session.save(item1);
session.save(item2);
txn.commit();
session.close();
}
}
}
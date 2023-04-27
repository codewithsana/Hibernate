package com.sana.onetomany;

import jakarta.persistence.*;
@Entity
@Table(name="item_infor")
public class Item {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="item_id")
private int id;
private String itemId;
private int quantity;
@ManyToOne
@JoinColumn(name="cart_id",nullable=false)
private Cart cart;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getItemId() {
return itemId;
}
public void setItemId(String itemId) {
this.itemId = itemId;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public Cart getCart() {
return cart;
}
public void setCart(Cart cart) {
this.cart = cart;
}
public Item(String itemId, int quantity, Cart cart) {
super();
this.itemId = itemId;
this.quantity = quantity;
this.cart = cart;
}
}
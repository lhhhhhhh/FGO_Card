package com.luhao.util;

public class Item {
	int id;
	int atk;
	int hp;
	String name;
	String imageURL;
	
	public Item(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

package Day4Hw3.Entities;

import Day4Hw2.Abstract.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private String type;
	private String producer;
	private double price;
	
	public Game(int id, String name, String type, String producer, double price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.producer = producer;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

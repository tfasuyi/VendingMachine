package vendingMachine;

// List of Items
public enum Item{ 
	COKE("COKE", 0.25), PEPSI("PEPSI", 0.35), SODA("SODA", 0.45);
	private String name; 
	private double price;
	private Item(String name, double price){
		this.name = name; this.price = price; 
	} 
	public String getName(){ 
		return name; 
	} 
	public double getPrice(){
		return price; 
	} 	
}
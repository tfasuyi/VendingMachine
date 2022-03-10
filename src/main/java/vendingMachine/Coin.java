package vendingMachine;

//Coin accepted
public enum Coin { 
	PENNY("PENNY",0.01), NICKEL("NICKEL",0.05), DIME("DIME",0.10), QUARTER("QUARTER",0.25);
	private Double denom;
	private String name;
	private Coin(String name, double denom){
		this.name = name; this.denom = (Double) denom;
	} 
	public Double getDenom(){
		return denom; 
		} 
	public String getName(){ 
		return name; 
	} 
}
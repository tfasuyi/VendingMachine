package vendingMachine;


import java.util.Scanner;

class Vending

{
	public String cancel;
	private String returnProduct;
	// add coins
	public double drop(String coins, double total)
	{
	
		if(coins.equals("NICKEL")){
			total = total + Coin.NICKEL.getDenom();
		}else if(coins.equals("DIME")){
			total = total + Coin.DIME.getDenom();
		}else if(coins.equals("QUARTER")){
			total = total + Coin.QUARTER.getDenom();
		}else if(coins.equals("PENNY")){
			total = total + Coin.PENNY.getDenom();
		}else{
			System.out.println("Wrong Input Coin");
		}
	
		return total;
	}

	
	//select items
	public double choose(String sample, double total)
	{

		double coke =0.25;
		double pepsi =0.35;
		double soda =0.45;
		switch (sample){
			case "COKE":
				System.out.println("You have selected "+Item.COKE.getName());
				Scanner myObj = new Scanner(System.in);

				System.out.println("Type YES if you want to cancel else press enter key");
				cancel = myObj.nextLine();
				if (cancel.equals("YES")){
					System.out.println("Transaction cancelled successfully your balance is "+total+" and is returned.");
					break;
				}else if (total>=Item.COKE.getPrice()){
					total = total - Item.COKE.getPrice();
					System.out.println("Thank you for your purchase!! ");
					System.out.println("Your balance is "+total);
				}else{
					System.out.println("Insufficient amount please Insert "+coke+"cents to buy Coke");

				}
				break;
			case "PEPSI":
				System.out.println("You have selected "+Item.PEPSI.getName());
				myObj = new Scanner(System.in);

				System.out.println("Type YES if you want to cancel else press enter key");
				cancel = myObj.nextLine();
				if (cancel.equals("YES")){
					System.out.println("Transaction cancelled successfully your balance is "+total+" and is returned.");
					break;
				}else if(total>=Item.PEPSI.getPrice()){
					total = total - Item.PEPSI.getPrice();
					System.out.println("Thank you for your purchase!! ");
					System.out.println("Your balance is "+total);
				}else{
					System.out.println("Insufficient amount please Insert "+pepsi+"cents to buy Pepsi");
				}
				break;
			case "SODA":
				System.out.println("You have selected "+Item.SODA.getName());
				myObj = new Scanner(System.in);

				System.out.println("Type YES if you want to cancel else press enter key");
				cancel = myObj.nextLine();
				if (cancel.equals("YES")){
					System.out.println("Transaction cancelled successfully your balance is "+total+" and is returned.");
					break;
				}else if(total>=Item.SODA.getPrice()){
					total = total - Item.SODA.getPrice();
					System.out.println("Thank you for your purchase!! ");
					System.out.println("Your balance is "+total);
				}else{
					System.out.println("Insufficient amount please Insert "+soda+"cents to buy Soda");
				}
				break;
			case "RETURN":
				System.out.println("Your balance is "+total+" and is returned.");
				break;
			case "CANCEL":
				return -1;
			default:
				System.out.println("Wrong choice: Your balance is "+total);

		}
	
		return total;
	}
}
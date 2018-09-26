package pkgCar;

public class CarPayment {
	
	//class attributes (or fields) 
	private double carCost;
	private double downPayment;
	private int loanLength;
	private double interestRate;
	
	public CarPayment (double carCost, double downPayment, int loanLength, double interestRate) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate/12;
	}
	
	public double monthlyPayment () {
		double costAfterDown = carCost - downPayment;
		return costAfterDown * (interestRate) *(Math.pow((1+interestRate), loanLength))/ 
				(Math.pow((1+interestRate), loanLength)-1);
	}
	
	public double totalInterest () {
		double total = 0;
		for (int i=0; i <loanLength; i++) {
			total+= monthlyPayment();
		}		
		double totalInt = total - (carCost-downPayment);
		return totalInt;
	}
	
}
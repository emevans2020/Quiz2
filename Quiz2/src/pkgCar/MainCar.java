package pkgCar;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarPayment carOne = new CarPayment(35000, 0, 60, .1);
		System.out.println(carOne.monthlyPayment());
		
		System.out.println(carOne.totalInterest());
		

	}
}
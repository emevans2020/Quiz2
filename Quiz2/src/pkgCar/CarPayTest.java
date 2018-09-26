package pkgCar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPayTest {

	@Test
	void CarPaymentTestTrue() {
		CarPayment car = new CarPayment (35000, 0, 60, .1);
		double payment = car.monthlyPayment();
		assertEquals(payment,743.6465648943918);
	}

	@Test
	void CarPaymentTestTotInt () {
		CarPayment car = new CarPayment (35000, 0, 60, .1);
		double interest = car.totalInterest();
		assertEquals (interest,9618.793893663526);
	}
}
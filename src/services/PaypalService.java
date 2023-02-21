package services;

public class PaypalService implements OnlinePaymentService {

	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	public Double Interest(Double amount, Integer months) {
		return amount * 0.01 * months;
	}

}

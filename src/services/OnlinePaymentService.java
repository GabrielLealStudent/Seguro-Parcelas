package services;

public interface OnlinePaymentService {
	
	 Double paymentFee(Double amount);
	 
	 Double Interest(Double amount, Integer months);
	
}

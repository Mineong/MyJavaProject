package workshop.account.exception;

public class InsufficientBalanceException extends Exception {
	//private String errMessage;
	public InsufficientBalanceException(String errMessage) {
		// �θ��� ������ ȣ��
		//this.errMessage = errMessage;
		super(errMessage);
	}
}
package entities.exceptions;

public class LoanLimitException extends RuntimeException {

	private static final long serialVersionUID = 1L;
    
	public LoanLimitException(String MSG) {
		super(MSG);
	}
}

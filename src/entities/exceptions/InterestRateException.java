package entities.exceptions;

public class InterestRateException extends RuntimeException {


	private static final long serialVersionUID = 1L;
    public InterestRateException(String MSG) {
    	super(MSG);
    }
}

package ExercicioTres.entities.exceptions;

public class AccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AccountException(String MSG) {
		super(MSG);
	}

}

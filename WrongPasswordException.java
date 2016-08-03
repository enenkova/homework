package notepad;

class WrongPasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8845921406698147138L;

	public WrongPasswordException() {
		
	}

	public WrongPasswordException(String message) {
		super(message);
		
	}

	public WrongPasswordException(Throwable cause) {
		super(cause);
		
	}

	public WrongPasswordException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public WrongPasswordException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}

/*
	CSE3OAD
	18344533
	18344533@students.latrobe.edu.au
	Liam MAGUIRE 
*/

public class MissingArgumentException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MissingArgumentException() {
		super();
	}

	public MissingArgumentException(String message) {
		super(message);
	}
}
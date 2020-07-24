
/*
	CSE3OAD
	18344533
	18344533@students.latrobe.edu.au
	Liam MAGUIRE 
*/

public class UpdateNotAllowedException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public UpdateNotAllowedException() {
		super();
	}

	public UpdateNotAllowedException(String message) {
		super(message);
	}
}
import java.util.List;

/*
	CSE3OAD
	18344533
	18344533@students.latrobe.edu.au
	Liam MAGUIRE 
*/

public class GroceryController {

	private FridgeDSC fridgeDSC;

	public GroceryController(String dbHost, String dbUserName, String dbPassword) throws Exception {
		fridgeDSC = new FridgeDSC(dbHost, dbUserName, dbPassword);

		try {
			fridgeDSC.connect();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Grocery> get() throws Exception {
		//TODO 06: what should this method return? HINT: a relevant call to a fridgeDSC method

		return fridgeDSC.getAllGroceries();
		//return null;
	}

	public Grocery get(int id) throws Exception {
		//TODO 07: what should this method return? HINT: a relevant call to a fridgeDSC method
		return fridgeDSC.searchGrocery(id);
		//return null;
	}

	public int add(Grocery g) throws Exception {
		// TODO 08: validate argument g, using Validation Framework
		Validator.validate(g);


		// TODO 09: make a relevant call to a fridgeDSC method
		int newId = fridgeDSC.addGrocery(g.getItemName(), g.getQuantity(), g.getSection());
		// TODO 10: this method should return the id of the newly created grocery

		return newId;
		//return 0;
	}

	public Grocery update(int id) throws Exception {
		// TODO 11: make a relevant call to a fridgeDSC method

		// TODO 12: this method should return the updated grocery object
		return fridgeDSC.useGrocery(id);
		//return null;
	}

	public int delete(int id) throws Exception {
		// TODO 13: make a relevant call to a fridgeDSC method

		// TODO 14: this method should return what ever the fridgeDSC method call (TODO 13) returns
		return fridgeDSC.removeGrocery(id);
		//return 0;
	}

	// To perform some quick tests
	public static void main(String [] args) throws Exception {
		// CONSIDER testing each of the above methods here
		// NOTE: this is not a required task, but will help you test your Task 2 requirements
		try {
			// CHANGE the username and password to match yours
			// CHANGE the first param to your database host if you are not using latcs7
			GroceryController gc = new GroceryController("latcs7.cs.latrobe.edu.au:3306/18344533", "18344533", "7qhUpqDMtQ3TFuCf5CR3");
			 //UNCOMMENT the following and add the relevant parameters/arguments to do your testing
			System.out.println(gc.get());
			/*System.out.println(gc.get(47
				// some id that exists in your grocery table
				)
			);
			System.out.println(gc.add(new Grocery(...)));
			System.out.println(gc.update(...
				// some id that exists in your grocery table
				)
			);
			System.out.println(gc.delete(...
				// some id that exists in your grocery table
				)
			);*/
			

		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}
}

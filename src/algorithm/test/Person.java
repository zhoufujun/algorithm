package algorithm.test;
/** 
 * @author ant 
 * @date 创建时间：2017年11月1日 上午9:44:00  
 */
public class Person {
	
	private int age;	
	  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
		}else {
			age = initialAge;
		}		
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		String statement = "";
		if (age < 13) {
			statement = "You are young.";
		}else if (age>=13 && age<18) {
			statement = "You are a teenager.";
		}else {
			statement = "You are old.";
		}
        System.out.println(statement);
	}

	public void yearPasses() {
  		age++;
	}

}

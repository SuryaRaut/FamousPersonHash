
public class FamousePerson implements Comparable<FamousePerson> {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private String fact;
	
	//Constructor
	public FamousePerson(String firstName, String lastName, int birthYear, String fact) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.fact = fact;
		}
	

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFact() {
		return fact;
	}
	public int getbirthYear() {
		return birthYear;
	}
	@Override
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}else if(object == null || object.getClass() != this.getClass()) {
			return false;
		}else {
			FamousePerson famousePerson = (FamousePerson)object;
			return (this.firstName.equals(famousePerson.firstName) && this.lastName.equals(famousePerson.lastName));
		}
			
		
	}
	
	//returns a hashcode for this FamousePerson Obj
	public int hashCode() {
		return Math.abs((lastName.hashCode()* 3) + firstName.hashCode());
	}
	

	@Override
	public int compareTo(FamousePerson obj) {
		// precondition obj can't be null
		//this isn't required but just to make habit for future
		if(obj == null) {
			return 0;
		}
		if(!this.lastName.equals(obj.lastName)) {
			return this.lastName.compareTo(obj.lastName);
		}else {
			return this.firstName.compareTo(obj.firstName);
		}
		
	}
	
	@Override
	  public String toString()
	  {
	    return (firstName + " " + lastName + "(Born " + birthYear +
	            "): " + fact);
	
	  }

}

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FamousePesonArray {
	
	public static void main(String[] args) throws IOException{
		
		//creating an array
		ArrayList<Integer> famousPersonHash = new ArrayList<Integer>();
		
		FileReader fin = new FileReader("./src/FamousCS.txt");
		Scanner scan = new Scanner(fin);
		scan.useDelimiter("[,\\n]");// delimeter are comma and line feed
		//Scanner sc = new Scanner(System.in);
		FamousePerson fPerson;
		String lastName, firstName, fact;
		int year;
		
		while(scan.hasNext()) {
			firstName = scan.next();
			lastName = scan.next();
			year = scan.nextInt();
			fact = scan.next();
			
			
			fPerson = new FamousePerson(firstName, lastName, year, fact);
			famousPersonHash.add(fPerson.hashCode());
			
			}
		
		
		System.out.println("System printing hashCode:");
		printArray(famousPersonHash);
		
		for(int i = 0; i<famousPersonHash.size(); i++) {
			famousPersonHash.set(i, famousPersonHash.get(i)%1000);
		}
		System.out.println("\nSystem printing hashCode divided by 1000:");
		printArray(famousPersonHash);
		
		//while A % 100
		System.out.println("\nSystem printing hashCode divided by 100:");
		
		for(int i = 0; i<famousPersonHash.size(); i++) {
			famousPersonHash.set(i, famousPersonHash.get(i)%100);
			
		}
		printArray(famousPersonHash);
		
		//while A % 10
		System.out.println("\nSystem printing hashCode divided by 10:");
		
		for(int i = 0; i<famousPersonHash.size(); i++) {
			famousPersonHash.set(i, famousPersonHash.get(i)%10);
		}
		printArray(famousPersonHash);

		
		scan.close();
		
		
	}
	//printing array
	public static void printArray(ArrayList<Integer> famousPersonHash) {
		Collections.sort(famousPersonHash);
		for(int i = 0; i<famousPersonHash.size(); i++) {
			System.out.println(famousPersonHash.get(i) + " ");
		}
	}

}

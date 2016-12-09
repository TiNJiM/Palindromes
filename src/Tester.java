import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
		String input = "";
		boolean test;
		while(!(input.equalsIgnoreCase("EXIT"))){
			System.out.print("Please input the word or phrase you wish to test\n(Type \"EXIT\" to quit): ");
			input = n1.nextLine();
			if(input.equalsIgnoreCase("EXIT")){
					break;
			}
			else{
				test = Palindromes.checkPal(input);
				if(test){
					System.out.println("Yes, this is a palindrome.");
				}
				else{
					System.out.println("No, this is not a palindrome. Try again.");
				}
			}
		}
	}

}

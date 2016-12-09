import java.util.*;
import java.io.*;
public class Palindromes {

	public static boolean checkPal(String input){
		String ans = "";
		String check = input;
		String first = check.substring(0, 1);
		String last = check.substring(check.length()-1); //this method works for both odd and even strings because the two can refer to the same substring
		if(first.equals(last)){ //if the letters are equal
			if(check.length()==1||check.length()==2){ //for the final recursion
				return true;
			}
			else{ //for every other time
				String next = check.substring(1,check.length()-1); //drop off the first and last letters and do it again
				return checkPal(next); //recursion!
			}
		}
		else{ //if the letters aren't equal
			return false;
		}
	}
}

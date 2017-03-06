package problem2;

import java.util.Scanner;

public class FindMinChar {

	public static char findMinCharRec(String s) {
		if (s.equals("") || s.equals(null)) {
			return '\0';
		}		
		char min = s.charAt(0);
		if (s.length() == 1)
			return min;
		char temp = findMinCharRec(s.substring(1));
		if (min > temp) {
			min = temp;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		System.out.println(findMinCharRec(scan.next()));
		System.out.println("END");
		scan.close();
	}

}

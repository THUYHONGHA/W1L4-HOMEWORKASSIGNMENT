package problem4;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindromeRec(String s) {
	//	System.out.println(s);
		int length = s.length();
		if (length < 2) {
			return false;
		}
		boolean flag = false;
		char c1 = s.charAt(0);
		char c2 = s.charAt(s.length() - 1);
		if (length <= 3) {
			if (c1 == c2) {
				flag = true;
			}
			return flag;
		}
		flag = isPalindromeRec(s.substring(1, s.length() - 1));
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		System.out.println(isPalindromeRec(scan.next()));
		scan.close();

	}

}

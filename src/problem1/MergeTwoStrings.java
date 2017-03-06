package problem1;

public class MergeTwoStrings {


	public static String stringMergeSort(String s1, String s2) {
		StringBuilder str = new StringBuilder();
		if (s1.length() == 0 || s2.length() == 0) {
			return str.append(s1).append(s2).toString();
		}

		if (s1.length() == 1 && s1.charAt(0) < s2.charAt(0)) {
			return str.append(s1).append(s2).toString();
		}
		if (s2.length() == 1 && s2.charAt(0) < s1.charAt(0)) {
			return str.append(s2).append(s1).toString();
		}
		
		if (s1.charAt(0) > s2.charAt(0)) {
			return str.append(s2.charAt(0)).append(stringMergeSort(s1, s2.substring(1))).toString();
		} else {
			return str.append(s1.charAt(0)).append(stringMergeSort(s1.substring(1), s2)).toString();
		}
	}


	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		// System.out.println("Please enter a String 1");
		String s1 = "akz";
		// System.out.println("Please enter a String 2");
		String s2 = "b";
		System.out.println("Merge String: " + stringMergeSort(s1, s2));
//		scan.close();

	}
	


}

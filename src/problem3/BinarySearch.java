package problem3;

public class BinarySearch {

	public static int binarySearch(int[] arr, int searchValue) {
		return binarySearch(arr, 0, arr.length - 1, searchValue);
	}

	public static int binarySearch(int[] arr, int start, int end, int searchValue) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (searchValue == arr[middle]) {
			return middle;
		} else if (searchValue < arr[middle]) {
			return binarySearch(arr, start, middle - 1, searchValue);
		} else {
			return binarySearch(arr, middle + 1, end, searchValue);
		}
	}

	
	public static int binarySearch(String[] arr, String searchValue) {
		return binarySearch(arr, 0, arr.length - 1, searchValue);
	}

	public static int binarySearch(String[] arr, int start, int end, String searchValue) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (searchValue == arr[middle]) {
			return middle;
		} else if (searchValue.compareTo(arr[middle]) < 0) {
			return binarySearch(arr, start, middle - 1, searchValue);
		} else {
			return binarySearch(arr, middle + 1, end, searchValue);
		}
	}
	
	public static void main(String[] args) {			
		int[] x={2, 5, 8, 9, 10, 13};
		System.out.println(binarySearch(x, 5));
		int[] y={15, 17,18,22,24,28,30,35,39,41};
		System.out.println(binarySearch(y, 35));
		
		String[] a={"hello", "hi", "Hong","how","are","you"};
		System.out.println(binarySearch(a, "Hong"));

	}

}

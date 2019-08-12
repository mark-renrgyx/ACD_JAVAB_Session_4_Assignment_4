package week1.day4.recursion;

/**
 * Let's sort some integers!
 * @author Mark
 *
 */
public class NumberSorter {
	
	/**
	 * Helper method so it isn't necessary to pass length from main()
	 * @see NumberSorter.sortIntegers(int[], int)
	 * @param integers
	 * @return sorted array of integers
	 */
	public static int[] sortIntegers (int[] integers) {
		if (integers == null)
			throw new IllegalArgumentException("can't sort null");
		
		return sortIntegers(integers, 0);
	}
	
	/**
	 * The meat and potatoes
	 * @param integers array to sort
	 * @param finished positions already sorted
	 * @return sorted array
	 */
	private static int[] sortIntegers (int[] integers, int finished) {
		if (finished >= integers.length)
			return integers;
		
		int pos = findMin(integers, finished);
		int value = integers[pos];
		integers[pos] = integers[finished];
		integers[finished] = value;
		
		return sortIntegers(integers, finished + 1);
	}
	
	/**
	 * Helper to find the position of the minimum integer
	 * @param list
	 * @param start
	 * @return
	 */
	private static int findMin(int[] list, int start) {
		int minPos = start;
		int smallest = list[start];
		
		for (int i = start; i < list.length; i++) {
			if (list[i] < smallest) {
				minPos = i;
				smallest = list[i];
			}
		}
		return minPos;
	}
}

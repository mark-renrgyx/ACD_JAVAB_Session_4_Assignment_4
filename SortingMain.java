package week1.day4.recursion;

public class SortingMain {

	public static void main(String[] args) {
		int[] testList = {12, -450, 14, 7, 0, -90, -9, 19, 54, -60};
		int[] resultList;
		
		try {
			resultList = NumberSorter.sortIntegers(testList);
			
			for (int i = 0; i < resultList.length; i++) {
				System.out.println(resultList[i]);
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

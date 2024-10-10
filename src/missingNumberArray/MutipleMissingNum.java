package missingNumberArray;
import java.util.ArrayList;
import java.util.List;


public class MutipleMissingNum {
//	public static List<Integer> findMissingNumber(int[] nums, int n) {
//		
//		boolean[] isPresent = new boolean [n+2];
//		
//		for(int num:nums) {
//			isPresent[num]=true;
//		}
//		
//		//List to interate value for matching the number from actual input
//		List<Integer> missingNumbers = new ArrayList<>();
//		for (int i=1 ; i<n; i++) {
//			if(!isPresent[i]) {
//				missingNumbers.add(i);
//			}
//		}
//		return missingNumbers;
//	} }
	
	public static void main(String[] args) {
		int [] nums= {1, 2, 3, 5, 6, 7};
		int n = 10;
		List<Integer> missingNumbers = findMissingNumber(nums, n);
		System.out.println("The Missing Numbers are: "+ missingNumbers);
		
	}
	
	private static List<Integer> findMissingNumber(int[] nums, int n) {
       boolean[] isPresent = new boolean [n+2];
		
		for(int num:nums) {
			isPresent[num]=true;
		}
		
		//List to interate value for matching the number from actual input
		List<Integer> missingNumbers = new ArrayList<>();
		for (int i=1 ; i<n; i++) {
			if(!isPresent[i]) {
				missingNumbers.add(i);
			}
		}
		return missingNumbers;
	}
}
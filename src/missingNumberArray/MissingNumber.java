package missingNumberArray;

public class MissingNumber {
	public static int findMissingNumber(int[] nums, int n) {
		//expected sum
		int expectedSum = n*(n+2)/2;
		
		//calculate the Actual sum
		int actualSum =0;
		for (int num: nums) {
			actualSum +=num;
		}
		
		//The missing number
		return expectedSum-actualSum;
	}
	public static void main (String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6};
		int n=6;
		int missingNumber = findMissingNumber(nums, n);
		System.out.println("The Missing NUmber is: " +missingNumber);
		
	}
}

//public class MissingNumber {
//    public static int findMissingNumber(int[] nums, int n) {
//        // Calculate the expected sum
//        int expectedSum = n * (n + 1) / 2;
//
//        // Calculate the actual sum of the array
//        int actualSum = 0;
//        for (int num : nums) {
//            actualSum += num;
//        }
//
//        // The missing number
//        return expectedSum - actualSum;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 6}; // Example array
//        int n = 6; // The range is from 1 to 6
//        int missingNumber = findMissingNumber(nums, n);
//        System.out.println("The missing number is: " + missingNumber);
//    }
//}

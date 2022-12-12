//Java Challenge (4/20)

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,1]
//Output: 1

//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

//Example 3:
//Input: nums = [1]
//Output: 1


package week1.day2;
import java.util.Arrays;
public class JavaChallenge4SingleElementinArray {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		Arrays.sort(nums);

		int i = 0;
		while (i <= nums.length - 1) {
			// to handle scenarios of array length of 1
			if (nums.length == 1) {
				System.out.println(nums[i]);
				break;
			}
			if (i == nums.length - 1) {
				if (nums[i] != nums[i - 1]) {
					System.out.println(nums[i]);
					break;
				}

			} else if (nums[i] != nums[i + 1]) {
				System.out.println(nums[i]);
				break;
			}
			i = i + 2;
		}
	}

}

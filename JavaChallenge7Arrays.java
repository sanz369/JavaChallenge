package week1.day2;

import java.util.Arrays;

public class JavaChallenge7Arrays {

		/*** Given an integer array nums, return true if any value 
		 appears at least twice in the array, and return false if every element is distinct.

		Example 1:
		Input: nums = [1,2,3,1]
		Output: true
		
		Example 2:
		Input: nums = [1,2,3,4]
		Output: false
		
		Example 3:
		Input: nums = [1,1,1,3,3,4,3,2,4,2]
		Output: true
		*/
		

			public static void main(String[] args) {
				int[] nums= {1,1,1,3,3,4,3,2,4,2};
				Arrays.sort(nums);
				boolean flag=false;
				
				for (int i = 0; i < nums.length; i++) {
					if(i==nums.length-1) {
						if(nums[i]==nums[i-1]) {
							flag=true;
							
						}
						break;
					}
					if(nums[i]==nums[i+1]) {
						flag=true;
						break;
					}
				}
				if(flag)
					System.out.println("true");
				else
					System.out.println("false");
			}

	
}

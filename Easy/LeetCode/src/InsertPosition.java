
/*
 * Given a sorted array and a target value, return the index if the target is found. If not, 
 * return the index where it would be if it were inserted in order.You may assume no duplicates in the array.
*/
public class InsertPosition {

	public int searchInsert(int[] nums, int target) {
		for(int i=0;i<nums.length ; i++) {
			if(nums[i]==target) {
				return i;
			}
			else if(nums[i]>target) {
				return i;
			}
		}
		return nums.length;
	}

	public static void main(String args[]) {
		int [] input = {1};
		InsertPosition obj = new InsertPosition();
		System.out.println(obj.searchInsert(input , 0));

	}
}

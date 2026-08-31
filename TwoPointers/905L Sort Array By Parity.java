class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = nums.length - 1;
        int i = 0;

        while(i < j){
            if(nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }else j--;
        }
        return nums;
    }
}

/*
Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*/

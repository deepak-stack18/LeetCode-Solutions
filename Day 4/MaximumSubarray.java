class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum = curSum + nums[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
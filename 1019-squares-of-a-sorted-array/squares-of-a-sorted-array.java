class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = n-1;
        int left  = 0;
        int right = n - 1;
        while(left <= right){
            int left_sq = nums[left] * nums[left];
            int right_sq = nums[right] * nums[right];
            if(left_sq > right_sq){
                ans[index] = left_sq;
                left++;
            }else{
                ans[index] = right_sq;
                right--;
            }
            index--;
        }
        return ans;
    }
}
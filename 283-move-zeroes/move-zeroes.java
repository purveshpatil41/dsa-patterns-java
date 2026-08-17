class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count =0;
        int x = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                count++;
            }else{
                arr[x] = nums[i];
                x++;
            }
        }
        for(int i = 0 ; i < count; i++){
            ++x;
            arr[x - 1] = 0;
        }
        x=0;
        for(int ele : arr) nums[x++]=ele;
    }
}
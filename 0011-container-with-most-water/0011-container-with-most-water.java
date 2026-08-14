class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int maxWater  = 0;
        while(left < right){
            int water = 0;
            if(height[left] < height[right]){
                water = (right - left) * height[left];
                left++;
            }else{
                water = (right - left) * height[right];
                right--;
            }
            maxWater = Math.max(maxWater, water);
        }
        return maxWater;
    }
}
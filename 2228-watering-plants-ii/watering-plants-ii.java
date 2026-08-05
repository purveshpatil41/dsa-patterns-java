class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int l = 0;
        int r = n - 1;
        int refills = 0;
        int currA = capacityA;
        int currB = capacityB;

        while(l < r){
            if(currA < plants[l]){
                refills++;
                currA = capacityA;
            }
            currA -= plants[l];

            if(currB < plants[r]){
                refills++;
                currB = capacityB;    
            }
            currB -= plants[r];

            l++;
            r--;
        }
        if(l == r){
            int remaining = Math.max(currA, currB);
            if(remaining < plants[l]){
                refills++;
            }
        }
        return refills;
    }
}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);


        }

        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key)== 2){
                list.add(key);
            }
        }
        return list;
    }
}
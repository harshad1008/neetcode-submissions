class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int num : nums) {
            if(result.containsKey(num)){
                return true;
            } else {
                result.put(num, 1);
            }
        }
        return false;
    }
}
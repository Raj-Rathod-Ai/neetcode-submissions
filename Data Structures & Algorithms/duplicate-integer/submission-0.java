class Solution {
    public boolean hasDuplicate(int[] nums) {
        long uniqueCount = Arrays.stream(nums).distinct().count();
        return nums.length != uniqueCount;
    }
}
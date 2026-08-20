class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount=0;
    int Count=0;

    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            Count++;
            maxCount=Math.max(maxCount,Count);
        }else{
            Count=0;
        }
    }
        return maxCount;
    }
}
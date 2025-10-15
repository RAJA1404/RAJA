class Solution {
    public void rotate(int[] nums, int k) {
        int re = nums.length;
        k=k%re;
        int[] temp = new int[re];
        for (int i=0;i<re;i++){
            temp[(i+k)%re]=nums[i];
            }
        for(int i=0;i<re;i++){
            nums[i]=temp[i];
        }
    }
}
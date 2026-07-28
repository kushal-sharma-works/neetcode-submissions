class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force - O(n)
        //use an array with products
        int[] products = new int[nums.length];
        int[] prefixcache = new int[nums.length];

        prefixcache[0]=1;

        for(int i=1; i<nums.length;i++)
        {
            prefixcache[i] = prefixcache[i-1]*nums[i-1];
        }

        int[] suffixcache = new int[nums.length];
        suffixcache[nums.length-1] = 1;

        for(int i=nums.length-2;i>=0;i--)
        {
            suffixcache[i] = suffixcache[i+1] * nums[i+1];
        }

        int[] finalProduct = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            finalProduct[i] = prefixcache[i]*suffixcache[i];
        }
    return finalProduct;
    }
}  

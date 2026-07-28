class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force - O(n2)
        int[] products = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            int product =1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                continue;

                product*=nums[j];
            }
            products[i]=product;
        }
        return products;
    }
}  

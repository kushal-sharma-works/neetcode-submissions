class Solution {
    public int[] productExceptSelf(int[] nums) {

        //alternative div approach
        int product =1;
        int zerocount = 0;
        for(int num:nums)
        {
            if(num!=0)
            {
                product*=num;
            }
            else{
                zerocount++;
            }
        }

        if(zerocount>1)
        {
            return new int[nums.length];
        }

        int[] productArray = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
         if (zerocount > 0) {
                productArray[i] = (nums[i] == 0) ? product : 0;
            } 
            else{ 
            productArray[i] = product / nums[i];
            }   
        }
        return productArray;
    }
}  

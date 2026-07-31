class Solution {
    public int trap(int[] height) {
        int totalWaterTrapped = 0;
        int maxLeft = 0;
        int maxRight = 0;

        //brute force approach
        for(int i=1;i<height.length-1;i++)
        {   
            maxLeft = 0;
            maxRight = 0;

            for(int l=0;l<=i;l++)
            {
                if(height[l]>maxLeft) maxLeft = height[l];
            }

            for(int r = i;r<height.length;r++)
            {
                if(height[r]>maxRight) maxRight = height[r];
            }

        totalWaterTrapped += Math.min(maxLeft,maxRight) - height[i];
        }
        return totalWaterTrapped;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int minHeight = 0;
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;
        int area = 0;

        while(l<r)
        {   
            minHeight = Math.min(heights[l],heights[r]);
            
            area = (r - l) * minHeight;

            if(maxArea<area) maxArea = area;

            if(heights[l]< heights[r]) l++;
            else r--;
        }
        return maxArea;
    }
    }


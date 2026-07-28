class Solution {
    public int longestConsecutive(int[] nums) {

    if(nums.length==0)
    {
        return 0;
    }

    int[] sortedNums = Arrays.stream(nums)
                               .distinct()
                               .sorted()
                               .toArray();
    
    int counter = 0;
    int max = 0;

        for(int i=1;i<sortedNums.length;i++)
        {
            if(sortedNums[i]-sortedNums[i-1]<=1)
            {
                counter++;
            }
            else if(sortedNums[i]-sortedNums[i-1]>1)
            {
                counter = 0;
            }
            if(max<=counter)
            {
                max = counter;
            }
            
        }

        return max+1;
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //optimized approach using 2 pointer

        Arrays.sort(nums);
        int l = 0;
        int r = nums.length -1;
        Set<List<Integer>> triplet = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {   l = i+1;
            r = nums.length - 1;

            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                {
                    triplet.add(Arrays.asList(nums[i],nums[l],nums[r]));
                }
                if(nums[i]+nums[l]+nums[r]>0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return new ArrayList<>(triplet);
    }
}

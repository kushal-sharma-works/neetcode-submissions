class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //brute force O(n3)
        int indexCount = 0;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j) continue;

                for(int k=0;k<nums.length;k++)
                {
                    if(j==k || i==k) continue;

                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }
        
        List<List<Integer>> finalTriplets = new ArrayList<>(uniqueTriplets);
        return finalTriplets;
    }
}

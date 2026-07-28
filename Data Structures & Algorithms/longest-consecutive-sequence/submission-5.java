class Solution {
    public int longestConsecutive(int[] nums) {

    Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    int max=0;
    int counter = 0;
    int currentNum = 0;

    for(int num:numSet)
    {   counter = 0;
        if(!numSet.contains(num-1)){
            counter = 1;
            while(numSet.contains(num+counter))
            {
                counter++;
            }
        }
        max=Math.max(max,counter);
    }
    return max;
    }
}

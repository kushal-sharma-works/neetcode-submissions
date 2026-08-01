class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] nArray = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++)
        {   int numberOfDays = 0;
            for(int j=i+1;j<temperatures.length;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    numberOfDays = j-i;
                    break;
                }
            }
            nArray[i] = numberOfDays;
        }
    return nArray;
    }
}

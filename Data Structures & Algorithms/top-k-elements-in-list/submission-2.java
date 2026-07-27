class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Fix 1: Corrected counting logic
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        // Fix 2: Array size must match nums.length + 1
        ArrayList<Integer>[] frequncySorter = new ArrayList[nums.length + 1];

        for (int index : frequencyMap.keySet()) {   
            int frequency = frequencyMap.get(index);

            if (frequncySorter[frequency] == null) {
                frequncySorter[frequency] = new ArrayList<>();
            }
             
            // Fix 3: Used matching variable names (index and frequency)
            frequncySorter[frequency].add(index); 
        }

        int[] finalArray = new int[k];
        int increment = 0;
        
        // Fix 4 & 5: Used .length instead of .size() and changed loop to >= 0
        for (int i = frequncySorter.length - 1; i >= 0; i--) {   
            if (frequncySorter[i] != null) {
                for (int items : frequncySorter[i]) {
                    finalArray[increment] = items;
                    increment++;

                    if (increment == k) {
                        return finalArray;
                    }
                }
            }
        }
        return finalArray;
    }   
}

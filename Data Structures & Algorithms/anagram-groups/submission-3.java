class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> res = new HashMap<>();

        for(String str:strs)
        {
            int[] count = new int[200];
            for(char c: str.toCharArray())
            {
                count[c-'A']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}

//we take the strings, split into array charaacter array and then we calculate frequency of each word and append if its similar for other words

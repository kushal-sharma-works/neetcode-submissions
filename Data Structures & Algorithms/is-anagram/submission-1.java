class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        int[] count_match = new int[100];

        for(int i=0;i<s.length();i++)
        {
            count_match[s.charAt(i) - 'A']++;
            count_match[t.charAt(i) - 'A']--;
        }

        for(int i : count_match) {
            if(i!=0)
                return false;
        }
    return true;
    }
}

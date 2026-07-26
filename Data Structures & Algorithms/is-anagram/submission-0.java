class Solution {
    public boolean isAnagram(String s, String t) {

        //first we match length of string and then character count of each
        if(s.length()!=t.length())
        return false;

        int[] count_s = new int[1000];
        int[] count_t = new int[1000];

        for(int i=0;i<s.length();i++)
        {
         count_s[(int)s.charAt(i)]++; 
         count_t[(int)t.charAt(i)]++; 
        }

        for(int i=0; i<s.length(); i++)
        {
            if(count_s[s.charAt(i)]!=count_t[s.charAt(i)])
            {
            return false;
            }
        }
        return true;
    }
}

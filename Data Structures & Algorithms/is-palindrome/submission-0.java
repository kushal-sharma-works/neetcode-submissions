class Solution {
    public boolean isPalindrome(String s) {
        String sTrimmed = s.replaceAll("\\s", "");
        sTrimmed = sTrimmed.toLowerCase();
        sTrimmed = sTrimmed.replaceAll("[^a-zA-Z0-9]", "");


        for(int i=0;i<sTrimmed.length()/2;i++)
        {
            if(sTrimmed.charAt(i)!=sTrimmed.charAt(sTrimmed.length()-1-i))
            {  
                return false;
            }
        }
    return true;
    }
}

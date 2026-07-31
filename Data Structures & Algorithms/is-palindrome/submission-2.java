class Solution {
    public boolean isPalindrome(String s) {
        //clean the string 
        s = s.replaceAll("\\s", "");
        //convert to lowercase
        s = s.toLowerCase();
        //remove non alphanumeric
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {  
                return false;
            }
        }
    return true;
    }
}

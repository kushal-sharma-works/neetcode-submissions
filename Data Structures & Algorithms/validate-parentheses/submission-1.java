class Solution {
    public boolean isValid(String s) {
    
    //brute force approach
    while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
        s = s.replace("()", "");
        s = s.replace("[]", "");
        s = s.replace("{}", "");
    }
    
    if(s.isBlank())
    return true;

    return false;
    }
}

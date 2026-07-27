class Solution {

public String encode(List<String> strs) {
    if(strs.isEmpty()) {
        return null;
    }
    StringBuilder finalString = new StringBuilder();
    for(String str: strs){
        finalString.append(str.length()).append("#").append(str);
    } 
    
    return finalString.toString();
    }


    public List<String> decode(String str) {
        if(str == null)
        {
            return new ArrayList<>();
        }
        
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int separator = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, separator));
            i = separator + 1;
            list.add(str.substring(i, i + length));
            i += length;
        }
        return list;
    }
}
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            
            char c = strs[0].charAt(i);
            for(String s:strs){
                if(i>=s.length()){
                    return sb.toString();
                }
                
                if(s.charAt(i) != c){
                    return sb.toString();
                }
                
            }
            sb.append(c);
            
        }
        return sb.toString();
        
    }
}


public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        return result.toString();
    }
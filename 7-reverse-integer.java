public class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        long t = x;
        if(x<0){
            t = 0l - x;
        }
        List<Integer> a = new ArrayList<Integer>();
        long y = 0;
        while(t != 0){
            y = y*10 + (t%10);
            t = t/10;
        }
        if(x<0){
            y = 0 - y;
        }
        
        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) y;
    }
}

public class Solution {
    public int reverse(int x) {
        long y = 0;
        while(x != 0){
            y = y*10 + (x%10);
            x = x/10;
        }
        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) y;
    }
}

public class Solution {
    public int reverse(int x) {
        int r = 0;
        while(x != 0){
            int nr = r*10 + (x%10);
            if(nr/10 != r){
                return 0;
            }
            r = nr;
            x = x/10;
        }
        
        return r;
    }
}
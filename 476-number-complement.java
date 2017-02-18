public class Solution {
    public int findComplement(int num) {
        long ret = 0;
        int n = 0;
        while(num>0){
            n++;
            ret = (((1L-(num%2))<<32)+ret) >> 1; 
            num = num>>1;
        }
        
        ret = ret >> (32-n);
        return (int) ret;
    }
}


public class Solution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
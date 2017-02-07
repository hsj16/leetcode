public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y;
        int d = 0;
        while(z>0){
            if((z&0x1) == 1){
                d++;
            }
            z = z>>1;
        }
        return d;
    }
	
	public int hammingDistance(int x, int y) {
        int dist = 0, n = x ^ y;
        while (n) {
            ++dist;
            n &= n - 1;
        }
        return dist;
    }
}
package solution.hamming_distance_461;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int d = 0;
        while (z > 0) {
            if ((z & 0x1) == 1) {
                d++;
            }
            z = z >> 1;
        }
        return d;
    }

    public int hammingDistance2(int x, int y) {
        int dist = 0, n = x ^ y;
        while (n > 0) {
            ++dist;
            n &= n - 1;
        }
        return dist;
    }
}

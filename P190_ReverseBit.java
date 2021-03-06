
public class ReverseBit {
	public static int reverseBits(int n) {
		 // In java, int type is always signed, right shift is 
        	// signed shift by default, however, we need a unsigned right
        	// shift in this problem.
		if(n == 0) return n;
		n = ((n & 0xFFFF0000) >>> 16) | ((n & 0xFFFF) << 16);
		n = ((n & 0xFF00FF00) >>> 8) | ((n & 0x00FF00FF) << 8);
        	n = ((n & 0xF0F0F0F0) >>> 4) | ((n & 0x0F0F0F0F) << 4);
        	n = ((n & 0xCCCCCCCC) >>> 2) | ((n & 0x33333333) << 2);
        	n = ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
        	return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(reverseBits(43261596)));

	}

}

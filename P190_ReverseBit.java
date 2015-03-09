
public class ReverseBit {
	public static int reverseBits(int n) {
		if(n == 0) return n;
		n = (n & 0xffff0000) >> 16 | (n & 0x0000ffff) << 16;
		n = (n & 0xff00ff00) >> 8 | (n & 0x00ff00ff) << 8;
		n = (n & 0xf0f0f0f0) >> 4 | (n & 0x0f0f0f0f) << 4;
		n = (n & 0xc3c3c3c3) >> 2 | (n & 0x3c3c3c3c) << 2;
		n = (n & 0xa5a5a5a5) >> 1 | (n & 0x5a5a5a5a) << 1;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(reverseBits(43261596)));

	}

}

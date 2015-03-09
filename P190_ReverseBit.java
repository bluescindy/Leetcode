class Solution {                                                                                
     // you need treat n as an unsigned value                                                    
     public int reverseBits(int n) {                                                             
         if(n == 0) return n;                                                                    
         n = (n & 0xffff0000) | (n & 0x0000ffff);                                                
         n = (n & 0xff00ff00) | (n & 0x00ff00ff);                                                
         n = (n & 0xf0f0f0f0) | (n & 0x0f0f0f0f);                                                
         n = (n & 0xc3c3c3c3) | (n & 0x3c3c3c3c);                                                
         n = (n & 0xa5a5a5a5) | (n & 0x5a5a5a5a);                                                
         return n;                                                                               
     }                                                                                           
     public static void main(args[]) {                                                           
         System.out.println(reverseBits(43261596));                                              
     }                                                                                           
 }                    

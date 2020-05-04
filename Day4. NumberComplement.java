/*
Number Complement
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 
Note:
1. The given integer is guaranteed to fit within the range of a 32-bit signed integer.
2. You could assume no leading zero bit in the integer’s binary representation.
3. This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
*/

class Solution {
    public int findComplement(int N) {
        if(N==0){
return 1;}
    String  num=detob(N);
        
        
        System.out.println(num);
          int ans=bitod(num);
          System.out.println(ans);
          return ans;
        
    }
//     public static int btod(String s){
        
// long temp=Integer.parseInt(s);
//         int ans=0;
//         int power=1;
//         while(temp>0){
//    long rem=temp%10;
//             ans=ans+(int)(power*rem);
//             power=power*2;
//             temp=temp/10;
//         }
//         return ans;
//     }
    public static int bitod(String s){
int size=s.length();
        int ans=0;
        int power=1;
        
        for(int i=size-1;i>=0;i--){
     char ch=s.charAt(i);
            if(ch=='1'){
ans=ans+(power);
            }
             power=power*2;
        }
        return ans;
    }
    public static String detob(int n){
        int temp=n;
        //given number binary turns out to be huge so we are using string
        String s="";
         while(temp>0){
        int rem=temp%2;
             if(rem==1){
                s="0"+s;
             }
             else{
                 s="1"+s;
             }
           // rem=rem^1;
           //  ans=ans+(rem*power);
           //  power=power*10;
            temp=temp/2;
        }
        return s;
        
}
    // public static long dtob(int n){
    //  int temp=n;
    //     long ans=0;
    //     long power=1;
    //     while(temp>0){
    //     long rem=temp%2;
    //        rem=rem^1;
    //         ans=ans+(rem*power);
    //         power=power*10;
    //         temp=temp/2;
    //     }
    //     return ans;
    // }
}

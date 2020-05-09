/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
Note: Do not use any built-in library function such as sqrt.
Example 1:
Input: 16
Output: true
Example 2:
Input: 14
Output: false
the sum of first n odd numbers is always a perfect square
Example: 
1 + 3 = 4
1 + 3 + 5 = 9
1 + 3 + 5 + 7 = 16 ...... so on!
use binary search for O(logn) time complexity otherwise tle.
normal for loop won't work.
take of long and int mid*mid is long and not int
*/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){

        return true;
        }
      
        long left=2;
        long right=num;
        while(left<=right){
            
            long mid=left+((right-left)/2);
            long s=mid*mid;
            if((mid*mid)>num){
               right=mid-1;
            }
            else if((mid*mid)<num){
             left=mid+1;
                
            }
            else if((mid*mid)==num){
                return true;
            }
            
        }
        return false;
    
}
}

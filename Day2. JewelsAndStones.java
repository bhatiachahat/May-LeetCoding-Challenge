/*
Jewels And Stones 
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
so "a" is considered a different type of stone from "A".
Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:
Input: J = "z", S = "ZZ"
Output: 0
Note:
S and J will consist of letters and have length at most 50.
The characters in J are distinct.
   
   Hide Hint #1  
For each stone, check if it is a jewel.
Time Complexity:O(n*m);
PS:Can be solved in O(n+m) by using hasmap(space-time-trade-off).
*/
class Solution {
    public int numJewelsInStones(String J, String S) {
        char arr1[]=J.toCharArray();
        char arr2[]=S.toCharArray();
        int count=0;
        for(int i=0;i<arr1.length;i++){
         for(int j=0;j<arr2.length;j++){
          if(arr1[i]==arr2[j]){
            count++;
          }
         }
        }
        return count;
        
    }
}

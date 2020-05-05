/*
First Unique Character in a String
Solution
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
Examples:
s = "leetcode"
return 0.
s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/
class Solution {
    public int firstUniqChar(String s) {
       char arr[]=s.toCharArray();
         Map<Character, Integer> mp = new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) 
        { 
            if (mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else
            { 
                mp.put(arr[i], 1); 
            } 
        } 
        int ans=-1;
        for(int i=0;i<s.length();i++){
         int value=mp.get(arr[i]);
            if(value==1){
              ans= i;
                break;
            }
        }
        return ans;
    }
}

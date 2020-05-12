/*
Single Element In A Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
 
Example 1:
Input: [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:
Input: [3,3,7,7,10,11,11]
Output: 10
 
Note: Your solution should run in O(log n) time and O(1) space.
*/
//My solution is linear traversing once xoring all elements  TIME: O(N) , SPACE: O(1)
class Solution {
    public int singleNonDuplicate(int[] nums) {
 int ans=nums[0];
        for(int i=1;i<nums.length;i++){
       ans=ans^nums[i];
        }
        return ans;
        
    }
}

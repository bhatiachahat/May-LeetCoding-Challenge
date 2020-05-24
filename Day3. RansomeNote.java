/*
Ransom Note
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
Each letter in the magazine string can only be used once in your ransom note.
Note:
You may assume that both strings contain only lowercase letters.
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char arr[]=magazine.toCharArray();
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
         for (Map.Entry<Character, Integer> entry : mp.entrySet()) 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        System.out.println("---");
        char arr2[]=ransomNote.toCharArray();
        Map<Character, Integer> mp2 = new HashMap<>(); 
         for (int i = 0; i < arr2.length; i++) 
        { 
            if (mp2.containsKey(arr2[i]))  
            { 
                mp2.put(arr2[i], mp2.get(arr2[i]) + 1); 
            }  
            else
            { 
                mp2.put(arr2[i], 1); 
            } 
        }
          for (Map.Entry<Character, Integer> entry : mp2.entrySet()) 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        for(int i=0;i<arr2.length;i++){
            if(!mp.containsKey(arr2[i])){
              return false;
            }
         if(mp.containsKey(arr2[i]) && mp2.get(arr2[i])>mp.get(arr2[i])){
           
            return false;
         }
        }
        return true;
        
    }
}

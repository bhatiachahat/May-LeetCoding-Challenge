/*

 Find the Town Judge
In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
If the town judge exists, then:
The town judge trusts nobody.
1. Everybody (except for the town judge) trusts the town judge.
2. There is exactly one person that satisfies properties 1 and 2.
3. You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 
Example 1:
Input: N = 2, trust = [[1,2]]
Output: 2
Example 2:
Input: N = 3, trust = [[1,3],[2,3]]
Output: 3
Example 3:
Input: N = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
Example 4:
Input: N = 3, trust = [[1,2],[2,3]]
Output: -1
Example 5:
Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3
 
Note:
1. 1 <= N <= 1000
2. trust.length <= 10000
3. trust[i] are all different
4. trust[i][0] != trust[i][1]
5. 1 <= trust[i][0], trust[i][1] <= N
*/
class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==1){
           return trust[0][1];
            
        }
        else if(trust.length==0){
return 1;}
        else{
            int ans=-1;
              Map<Integer, Integer> mp1 = new HashMap<>(); 
        for (int i = 0; i < trust.length; i++) 
        { 
            if (mp1.containsKey(trust[i][0]))  
            { 
                mp1.put(trust[i][0], mp1.get(trust[i][0]) + 1); 
            }  
            else
            { 
                mp1.put(trust[i][0], 1); 
            } 
        } 
              for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
              Map<Integer, Integer> mp2 = new HashMap<>(); 
        for (int i = 0; i < trust.length; i++) 
        {    
               if (mp2.containsKey(trust[i][1]))  
            { 
                mp2.put(trust[i][1], mp2.get(trust[i][1]) + 1); 
            }  
            else
            { 
                mp2.put(trust[i][1], 1); 
            } 
       
           
        } 
            System.out.println("---");
                    for (Map.Entry<Integer, Integer> entry : mp2.entrySet()) 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
            for(int i=0;i<trust.length;i++){
                int ele=trust[i][1];
                System.out.println("i"+i);
                System.out.println("ele"+ele);
                if(mp1.containsKey(ele)==false){//check if the person trusts no one
                
                    int r=mp2.get(ele);
                    if(r==N-1){//check if every other person trust the judge
                   ans=ele;
                    return ans;
                    }
                    
                  
                }
               
            }
        return ans;

        }
        
    }
}

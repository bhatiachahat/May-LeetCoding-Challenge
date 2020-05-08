/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
*/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       if(coordinates.length==2){
        return true;
       }
        else {
         for(int row=0;row<=coordinates.length-3;row++){
            int x1=coordinates[row][0];
            int x2=coordinates[row+1][0];
            int x3=coordinates[row+2][0];
            int y1=coordinates[row][1];
            int y2=coordinates[row+1][1];
            int y3=coordinates[row+2][1];
            int a=(x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2));
             System.out.println(a);
            if(a!=0){
                  return false;
            }
         }
          
            return true;
            
            
        }
        
    }
}

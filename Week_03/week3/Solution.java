package week3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> result;

    public List<String> generateParenthesis(int n) {
         result = new ArrayList<String>();
        _generate(0,0,n,"");
        return result;
    }
   private void _generate(int left,int right,int n,String s){
           if (left == n  && right == n) {
               result.add(s);
                 return;
           }
           if (left < n) {
              _generate(left+1,right,n,s+"(");
           }
           if (left > right)
           {
               _generate(left,right + 1,n,s+")");
           }
   }
   public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.generateParenthesis(3));
    }
}
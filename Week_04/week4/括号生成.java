package week4;

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
        //递归终止的条件
        if (left == n && right == n) {
            result.add(s);
            return;
        }
        //每层进行的程序、
        if (left < n) {
            _generate(left+1,right,n,s+"(");
        }
        if (left > right) {
            _generate(left,right+1,n,s+")");
        }
    }
}
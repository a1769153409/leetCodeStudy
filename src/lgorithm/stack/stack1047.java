package lgorithm.stack;

import java.util.Stack;

/**
 * 无压力
 *
 * 删除字符串中的所有相邻重复项
 *
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class stack1047 {
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<S.length();i++){
          /*  if(stack.isEmpty()){
                stack.push(S.charAt(i));
            }else{
                if(stack.peek().equals(S.charAt(i))){
                    stack.pop();
                }else{
                    stack.push(S.charAt(i));
                }
            }*/
          if(stack.isEmpty()||!stack.peek().equals(S.charAt(i))){
              stack.push(S.charAt(i));
          }else{
              stack.pop();
          }

        }
        String returnStr = "";
        while (!stack.isEmpty()){
            returnStr=String.valueOf(stack.pop())+returnStr;
        }
        return returnStr;
    }
    public static void main(String[] args){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}

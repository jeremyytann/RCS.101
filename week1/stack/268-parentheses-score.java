package week1.stack;

import java.util.Stack;

class Solution {
  /**
   * @param s: a string with "(" and ")"
   * @return: return the score of the string
   */
  public int parenthesesScore(String s) {
      Stack<Integer> stack = new Stack<Integer>();

      stack.push(-1);

      for (int i = 1; i < s.length(); i++) {
          if (s.charAt(i) == '(') {
              stack.push(-1);
          } else if (s.charAt(i) == ')' && stack.peek() == -1) {
              stack.pop();
              stack.push(1);
          } else {
              int current = stack.pop();

              while (stack.peek() != -1) {
                  if (stack.peek() == -1) {
                      break;
                  }

                  current += stack.pop();
              }

              stack.pop();
              stack.push(current * 2);
          }
      }

      int answer = 0;

      while (!stack.isEmpty()) {
          answer += stack.pop();
      }

      return answer;
  }
}
package week1.stack;

import java.util.Stack;

class Solution {
  /**
   * @param asteroids: a list of integers
   * @return: return a list of integers
   */
  public int[] asteroidCollision(int[] asteroids) {
      // write your code here
      Stack<Integer> stack = new Stack();

      for (int ast: asteroids) {
          if (ast > 0) {
              stack.push(ast);
          } else {
              collision: {
                  while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                      if (-ast == stack.peek()) {
                          // if both are the same size, both will explode 
                          stack.pop();
                          break collision;
                      } else if (-ast > stack.peek()) {
                          stack.pop();
                          continue;
                      } else {
                          break collision;
                      }
                  }

                  stack.push(ast);
              }
          }
      }

      Object[] arr = stack.toArray(); 

      int[] answer = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {
          answer[i] = (int)arr[i];
      }

      return answer;
  }
}
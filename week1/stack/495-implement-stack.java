package week1.stack;

import java.util.ArrayList;
import java.util.List;

class Stack {
  private List<Integer> array = new ArrayList<Integer>();

  /*
   * @param x: An integer
   * @return: nothing
   */
  public void push(int x) {
      // write your code here
      array.add(x);
  }

  /*
   * @return: nothing
   */
  public void pop() {
      // write your code here
      array.remove(array.size() - 1);
  }

  /*
   * @return: An integer
   */
  public int top() {
      // write your code here
      return array.get(array.size() - 1);
  }

  /*
   * @return: True if the stack is empty
   */
  public boolean isEmpty() {
      // write your code here
      if (array.size() > 0) {
          return false;
      }

      return true;
  }
}
package week1.stack;

import java.util.ArrayList;
import java.util.List;

class Solution {
  private List<Character> array = new ArrayList<Character>();

  public boolean isValid(String s) {
      for (int i = 0; i < s.length(); i++) {
          char current = s.charAt(i);
          
          if (current == '(' || current == '{' || current == '[') {
              array.add(current);
          } else {
              if (array.size() > 0) {
                  if (current == ')' && array.get(array.size() - 1) == '(') {
                      array.remove(array.size() - 1);
                  } else if (current == '}' && array.get(array.size() - 1) == '{') {
                      array.remove(array.size() - 1);
                  } else if (current == ']' && array.get(array.size() - 1) == '[') {
                      array.remove(array.size() - 1);
                  } else {
                      return false;
                  }
              } else {
                  return false;
              }
          }
      }

      if (array.size() > 0) {
          return false;
      }
      
      return true;
  }
}
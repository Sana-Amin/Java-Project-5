import java.util.HashMap;
import java.util.Stack;

public class Balanced{
    public static boolean balancedParentheses(String s) {
        int numUnclosedOpenParens = 0;
        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == '(') {
                numUnclosedOpenParens += 1;
            }
            else if (s.charAt(i) == ')') {
                numUnclosedOpenParens -= 1;
            }

            if (numUnclosedOpenParens < 0) {
                return false;
            }
        }

        return numUnclosedOpenParens == 0;
    }

    public static boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {


            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }

            else if (bracketPairs.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }

                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args)
    {
       String string = "{Hello";
        System.out.println(balancedParentheses(string));
        System.out.println(balancedBrackets(string));
    }

}



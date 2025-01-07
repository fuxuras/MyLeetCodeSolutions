import java.util.HashMap;
import java.util.Stack;

public class Question0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> chars = new HashMap<>(){{
            put('}','{');
            put(')','(');
            put(']','[');
        }};

        for (int i = 0; i <s.length(); i++) {
            if ("{[(".indexOf(s.charAt(i)) >= 0){
                stack.push(s.charAt(i));
            }else {
                if (!stack.isEmpty() && stack.peek() == chars.get(s.charAt(i))){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

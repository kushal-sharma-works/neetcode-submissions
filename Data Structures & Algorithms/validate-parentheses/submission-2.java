class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char current:s.toCharArray())
        {
            if(current=='('||current=='{'||current=='[')
            {
                stack.push(current);
            }
            else
            {
                if(stack.isEmpty())
                return false;

                char top = stack.peek();

                if (current == ')' && top != '(') return false;
                if (current == ']' && top != '[') return false;
                if (current == '}' && top != '{') return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

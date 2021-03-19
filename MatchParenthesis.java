class MatchParenthesis {
    public boolean isValid(String s) {

        Stacks stack = new Stacks(s.length());

        for (int i = 0; i < s.length(); i++) {

            if (stack.top == -1) {
                stack.push(s.charAt(i));
            } else {
                if (matches(stack.getTop(), s.charAt(i))) 
                    {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
            }

        return stack.top == -1;
        }
    
     private boolean matches(char c1, char c2)
    {
       if(c1 == '(' && c2 == ')')
       {
           return true;
       }
       if(c1 == '{' && c2 == '}')
       {
           return true;
       }
        if(c1 == '[' && c2 == ']')
       {
           return true;
       }
        return false;
     }
    
    }
                    
                    
class Stacks {
    
    int length;
    char stack[] ;
    
    Stacks (int length)
    {
       this.length = length; 
       stack = new char[length];
    }
    
  
    int top = -1;

    public int push(char element) {
        stack[++top] = element;
        return top;
    }

    public char getTop() {
        return stack[top];
    }

    public char pop() {
        return stack[top--];
    }
}

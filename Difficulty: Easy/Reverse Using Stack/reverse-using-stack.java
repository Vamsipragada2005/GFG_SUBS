class Solution {
    public String reverse(String S) {
        // code here
        Stack <Character> stack = new Stack<>();
        
        for(char c : S.toCharArray()){
            stack.push(c);
        
        }
        StringBuilder string = new StringBuilder();
        
        while(!stack.isEmpty()){
            string.append(stack.pop());
        }
        
        return string.toString();
    }
}
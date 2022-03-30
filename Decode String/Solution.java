class Solution {
    // This Method will decode the string.
    // @s - string needs to be decoded.
    public String decodeString(String s) {
        int num = 0;
        StringBuilder str = new StringBuilder("");
        LinkedList stk = new LinkedList();
        char [] cArray =  s.toCharArray();
        // Iterate over string s.
        for (char c : cArray){
            // When i is [ add add nums and result to stk and reset num and result.
            if (Character.isDigit(c)) {
                num = (num*10) + Character.getNumericValue(c);
            //When i is [ add add nums and result to stk and reset num and result.
            } else if (c =='[') {
                stk.push(str);
                stk.push(num);
                str = new StringBuilder();
                num = 0;
            // When i is ] pop last number and string from stk and form new result.
            } else if (c==']') {
                int popInt = (int)stk.pop();
                StringBuilder popStr = new StringBuilder();
                popStr.append(stk.pop());
                str = popStr.append(str.toString().repeat(popInt));
            // When i is alphabet concatenate it with result.
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}

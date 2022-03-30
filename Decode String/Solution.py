class Solution:
    # This Method will decode the string.
    # @s - string needs to be decoded.
    def decodeString(self, s: str) -> str:
        num, result = 0, ""
        stk = []
        # Iterate over string s.
        for i in s:
            # When i is numeric add it to number.
            if i.isnumeric():
                num = (num*10) + int(i)
            # When i is [ add add nums and result to stk and reset num and result.
            elif i == "[":
                stk.append(result)
                stk.append(num)
                result = ""
                num = 0
            # When i is ] pop last number and string from stk and form new result.
            elif i == "]":
                n = stk.pop()
                st = stk.pop()
                result = st + (n*result)
            # When i is alphabet concatenate it with result.
            else:
                result+=i
        return result
                
            

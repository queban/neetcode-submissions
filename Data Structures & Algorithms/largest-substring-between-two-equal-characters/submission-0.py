class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        x = {}
        max_length = -1
        for i in range (len(s)):
            if s[i] not in x:
                x[s[i]] = i
            else:
                current_length = i - x[s[i]] - 1
                max_length = max(current_length, max_length)
        return max_length
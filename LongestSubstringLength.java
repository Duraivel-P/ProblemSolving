class LongestSubstringLength {
    public int lengthOfLongestSubstring(String s) {
        char[] ch  = s.toCharArray();
        
        HashSet<Character> charset = new HashSet<Character>();
        
        int i=0;
        int j=0;
        int maxLength=0;
        
        while(i<ch.length && j<ch.length)
          {
            if(!charset.contains(ch[j]))
            {
              charset.add(ch[j]);
              j++;
              maxLength = Math.max(maxLength,j-i+1);
            }
            else
            {
                charset.remove(ch[i]);
                i++;
            }
            
          }
          return maxLength;
        }
        
}

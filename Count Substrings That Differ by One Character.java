class Solution {
    public int countSubstrings(String s, String t) 
    {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        
        int n = s.length();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                l1.add(s.substring(i,j+1));
            }
        }
        
        n = t.length();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                l2.add(t.substring(i,j+1));
            }
        }
        
        int ans = 0;
        
        for(String ss:l1)
        {
            for(String tt:l2)
            {
                if(hasOneCharDiff(ss,tt))
                {
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
    boolean hasOneCharDiff(String s,String t)
    {
        if(s.length()!=t.length())  return false;
        
        int n = s.length();
        
        int diff = 0;
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=t.charAt(i))
                diff++;
            if(diff>1)
                break;
        }
        
        return diff==1;
    }
}

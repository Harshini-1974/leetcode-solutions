class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int c=1;
    int sum=0;
 
        for(int i=0;i<s.length();i++)
        {
            int w=widths[s.charAt(i)-97];
            if(sum+w>100)
            {sum=0;
                c++;
            }
            sum=sum+w;
            
        }
        
       return new int []{c,sum}; 
    }
}
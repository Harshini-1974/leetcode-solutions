class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li=new ArrayList<>();
        int c=0,r=0;
       while(left<=right)
       { int n=left;
       c=0;
       r=0;
        while(n!=0)
        {   if(n%10==0)
        {
            c=1;break;
        }
            r=(n%10);
            if(r!=0 && left%r!=0)
            { c=1;
            
             break;
            }
            n=n/10;
        }
        if(c!=1) li.add(left);
        left++;
       } 
       return li;
    }
}
bool isPalindrome(int x) {
    int y=x, r=0;
    if(x<0) return false;
    else
    {
        while(y!=0)
        {r=r*10+(y%10);
        y=y/10;

        }
        
    }
    return r==x?true:false;
}
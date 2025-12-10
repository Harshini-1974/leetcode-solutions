class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] l = new int[nums.length];
        int[] r=new int[nums.length];
        r[nums.length-1]=1;
        l[0]=1;
        int i=1,j=nums.length-2;

        while(i<nums.length)
        {
            l[i]=nums[i-1]*l[i-1];
            i++;
        }
        while(j>=0)
        {
            r[j]=nums[j+1]*r[j+1];
            j--;
        }
        for(int k=0;k<nums.length;k++)
        {
            nums[k]=l[k]*r[k];
        }
        
        return nums;
    }
}
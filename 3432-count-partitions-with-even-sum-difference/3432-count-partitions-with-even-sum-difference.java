class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,c=0,s2=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=sum+nums[i];
            s2=0;
            for(int j=i+1;j<nums.length;j++)
            {
                s2= s2+nums[j];
            }
            if((sum-s2)%2==0) {
                System.out.println(sum-s2);
            c++;
            }
        }
        return c;
    }
}
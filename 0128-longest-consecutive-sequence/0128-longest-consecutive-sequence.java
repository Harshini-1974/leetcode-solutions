class Solution {
    public int longestConsecutive(int[] nums) {
Set<Integer> set=new HashSet<>();
if(nums.length==0) return 0;
        int n=nums[0];
         
        for(int i=0;i<nums.length;i++)
        {
            
            set.add(nums[i]);
        }
int m=0;
int c=0,k=0;
for(int s:set)
{ 
if(!set.contains(s-1)){
c=s;
k=1;
while(set.contains(c+1)){
c++;
k++;
}
m=Math.max(m,k);
}
}
return m;
    }
}
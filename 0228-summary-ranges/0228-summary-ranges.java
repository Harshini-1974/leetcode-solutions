class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String> li= new ArrayList<>();
      if(nums.length==0) return li;
      int n=nums[0],l=0;
      for(int i=0;i<nums.length;i++)
      {
        
        if(i<nums.length-1 && (nums[i]+1)==nums[i+1])
        {l++;
            continue;

        }
        else
        {if(l>=1)
            li.add(n+"->"+nums[i]);
            
            else
            li.add(String.valueOf(n));
            if(i<nums.length-1)
            n=nums[i+1];
            l=0;
            
        }
      }
      return li;
    }
}
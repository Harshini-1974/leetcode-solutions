class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

      List<Integer> li= new ArrayList<>();
      int c=0;
     

      for(int i=0;i<nums1.length;i++)
      {c=0;
       for(int j=0;j< nums2.length;j++){
        if(nums1[i]==nums2[j])
        {
            c++;
        }
       }
        if(c!=0)
        {   if(!li.contains(nums1[i]))
             li.add(nums1[i]);
        }
       
       
      }
      for(int i=0;i<nums2.length;i++)
      {c=0;
       for(int j=0;j< nums3.length;j++){
        if(nums2[i]==nums3[j])
        {
            c++;
        }
       }
        if(c!=0)
        {   if(!li.contains(nums2[i]))
             li.add(nums2[i]);
        }
       
      }
      for(int i=0;i<nums1.length;i++)
      {c=0;
       for(int j=0;j< nums3.length;j++){
        if(nums1[i]==nums3[j])
        {
            c++;
        }

      }
      if(c!=0)
        {   if(!li.contains(nums1[i]))
             li.add(nums1[i]);
        }
      }
return li;
    }
}
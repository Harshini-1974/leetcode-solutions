class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i=0,c=0;
        for( i=0;i<nums1.length;i++)
        
        {c=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                { 
                    for(int k=j+1;k<nums2.length;k++){

                    if( nums2[k]>nums1[i]){
                    nums1[i]=nums2[k];
                    c++;
                    break;
                    
                    }
                    
                    }
                    break;

                }
               
            }
            if(c==0) nums1[i]=-1;
        }
        
        return nums1;
    }
}
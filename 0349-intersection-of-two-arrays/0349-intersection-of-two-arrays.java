import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int k = 0;

        Set<Integer> s = new HashSet<>();   // elements of nums2
        Set<Integer> used = new HashSet<>(); // to avoid duplicates in result

        // store unique elements of nums2
        for (int i = 0; i < nums2.length; i++) {
            s.add(nums2[i]);
        }

        // find intersection
        for (int i = 0; i < nums1.length; i++) {
            if (s.contains(nums1[i]) && !used.contains(nums1[i])) {
                arr[k++] = nums1[i];
                used.add(nums1[i]);
            }
        }

        return Arrays.copyOf(arr, k);
    }
}

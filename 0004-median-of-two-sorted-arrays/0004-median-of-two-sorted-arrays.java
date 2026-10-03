class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[]merge = new int[n1+n2];
         int i = 0, j = 0, k = 0;

               while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merge[k++] = nums1[i++];
            } else {
                 merge[k++] = nums2[j++];
            }
        }

                while (i < n1) {
            merge[k++] = nums1[i++];
        }

        while (j < n2) {
            merge[k++] = nums2[j++];
        }

                int total = n1 + n2;

        if (total % 2 == 1) {
            return merge[total / 2];  
        } else {
            return (merge[total / 2 - 1] + merge[total / 2]) / 2.0; 
        }
    }
  
}
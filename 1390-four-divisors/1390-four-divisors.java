class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = 0, k = 0, m = 0;

        for (int i = 0; i < nums.length; i++) {
            n = 0;
            m = 0;

            for (int j = 1; j * j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    n = n + 1;
                    m = m + j;

                    if (j != nums[i] / j) {
                        n = n + 1;
                        m = m + (nums[i] / j);
                    }
                }
            }

            if (n == 4) {
                k = k + m;
            }
        }
        return k;
    }
}

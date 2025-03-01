class issorted{
    public boolean check(int[] nums) {
        int cnt = 0, i = 0;
        int n = nums.length;
        for (i = 0; i < n-1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
            }
        }

        if (nums[n - 1] > nums[0]) {
            cnt++;
        }

        return cnt <= 1;
    }
    

    public static void main(String[] args) {
        issorted isSorted = new issorted();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(isSorted.check(nums));
    }
}
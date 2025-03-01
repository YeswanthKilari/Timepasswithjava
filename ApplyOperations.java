import java.util.Arrays;

class ApplyOperations {
    public int[] applyOperation(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        ApplyOperations op = new ApplyOperations();
        int[] nums = { 2, 2, 3, 0, 4 };
        int[] result = op.applyOperation(nums);
        System.out.println(Arrays.toString(result));
    }
}
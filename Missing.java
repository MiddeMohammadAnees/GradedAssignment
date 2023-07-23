
public class Missing {

    public static int Miss(int nums[]) {

        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        int Actual = (n * (n + 1)) / 2;
        int Miss1 = Actual - sum;
        // System.out.println(Miss1);

        return Miss1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4 }; // Corrected the array to include the missing number (3)
        System.out.println(Miss(nums));
    }

}

import java.util.Arrays;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the front of the array
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}

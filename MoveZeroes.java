/** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
a. 1 <= nums.length <= 10^4
b. -2^31 <= nums[i] <= 2^31 - 1
*/
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

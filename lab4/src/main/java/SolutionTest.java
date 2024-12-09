import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLargestNumber() {
        Solution solution = new Solution();

        // 测试用例1
        int[] nums1 = {10, 2};
        String expected1 = "210";
        String actual1 = solution.largestNumber(nums1);
        Assert.assertEquals(expected1, actual1);

        // 测试用例2
        int[] nums2 = {3, 30, 34, 5, 9};
        String expected2 = "9534330";
        String actual2 = solution.largestNumber(nums2);
        Assert.assertEquals(expected2, actual2);

        // 测试用例3：包含0的情况
        int[] nums3 = {0, 0};
        String expected3 = "0";
        String actual3 = solution.largestNumber(nums3);
        Assert.assertEquals(expected3, actual3);

        // 测试用例4：所有数字相同
        int[] nums4 = {1, 1, 1};
        String expected4 = "111";
        String actual4 = solution.largestNumber(nums4);
        Assert.assertEquals(expected4, actual4);


    }
}


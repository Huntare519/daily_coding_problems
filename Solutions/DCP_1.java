import java.util.Arrays;

class solution1 {

    // solved with two pointers, no references

    public static void main(String args[]) {
        int[] testArr = { 10, 15, 3, 7 };
        boolean test = returnIfMatched(testArr, 17);
        System.out.println(test); // should print true
        assert test : true;

    }

    public static boolean returnIfMatched(int[] nums, int k) {

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            while (start < end) {
                if (nums[start] + nums[end] == k) {
                    return true;
                } else if (nums[start] + nums[end] < k) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return false; // never found
    }

}

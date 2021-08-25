import java.util.Arrays;

class solution2 {

    // solved with two for loops. This does account for zeros

    public static void main(String args[]) {
        int[] testArr = { 1, 2, 3, 4, 5 };
        int[] testArr2 = { 3, 2, 1 };
        int[] testArr3 = { 1, 2, 0, 5 };

        int[] test = findSum(testArr);
        for (int i = 0; i < test.length; i++)
            System.out.println(test[i]);

        System.out.println("\n");
        int[] test2 = findSum(testArr2);
        for (int i = 0; i < test2.length; i++)
            System.out.println(test2[i]);

        System.out.println("\n");
        int[] test3 = findSum(testArr3);
        for (int i = 0; i < test3.length; i++)
            System.out.println(test3[i]);

    }

    public static int[] findSum(int[] nums) {
        // this is a beautiful solution
        int[] productArray = new int[nums.length];

        Arrays.fill(productArray, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < productArray.length; j++) {
                if (j == i)
                    continue;
                productArray[j] = productArray[j] * nums[i];
            }
        }
        return productArray;
    }
}

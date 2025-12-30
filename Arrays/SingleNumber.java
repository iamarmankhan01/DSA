//Find the element that appears only once, when every other appears twice.

public class SingleNumber {
    public static int findSingle(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Element appearing once: " + findSingle(arr));
    }
}

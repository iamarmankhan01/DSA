public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int index = 0;

        // Step 1: Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

import java.util.*;

public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        findDuplicates(arr);
    }
}

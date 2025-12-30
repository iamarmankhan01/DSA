import java.util.*;

public class ArrayIntersection {
    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        System.out.println("Intersection: " + findIntersection(arr1, arr2));
    }
}

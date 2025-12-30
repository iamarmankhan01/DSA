//Count pairs with a given sum.

import java.util.*;

public class CountPairs {
    public static int countPairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = k - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        System.out.println("Count of pairs: " + countPairs(arr, k));
    }
}
 

import java.util.*;

class Question2 {
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}
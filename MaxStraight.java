import java.util.*;

public class MaxStraight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            map.put(curr, map.getOrDefault(curr - 1, 0) + 1);
            int temp = map.get(curr);
            max = Math.max(max, temp);
        }
        System.out.println(max);
        sc.close();
    }
}

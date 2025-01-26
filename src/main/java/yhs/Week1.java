package yhs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Week1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3};
        Map<Integer, Long> poketmonNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(Math.min(nums.length / 2, poketmonNums.size()));
    }
}

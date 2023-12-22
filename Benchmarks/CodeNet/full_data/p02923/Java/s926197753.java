import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        List<Integer> xs = IntStream.range(0, count)
                .map(it -> std.nextInt()).boxed().collect(Collectors.toList());

        List<Integer> state = new ArrayList<>();

        IntStream.range(0, xs.size()).forEach(it -> {
            if (it == xs.size() - 1) {
                return;
            }

            int left = xs.get(it);
            int right = xs.get(it + 1);
            if (left >= right) {
                state.add(1);
            } else {
                state.add(0);
            }
        });

        String value = state.stream().map(String::valueOf).collect(Collectors.joining());
        Optional<Integer> result = Arrays.stream(value.split("0")).map(String::length).max((l, r) -> l - r);
        System.out.println(result.orElse(0));
    }
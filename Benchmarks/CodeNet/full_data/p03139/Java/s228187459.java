package hoge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                    .map(line -> Arrays.stream(line.split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .forEach(inputs -> {
                        int n = Integer.valueOf(inputs[0]);
                        int a = Integer.valueOf(inputs[1]);
                        int b = Integer.valueOf(inputs[2]);

                        output(String.valueOf(Math.min(a,b)));
                        output(String.valueOf(a + b > n ? a + b - n: 0));
                    });
        }

    }

    private static void output(String message){
        System.out.println(message);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final Object[] Compiler = null;

    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int k = Integer.parseInt(input.readLine());
        String[] array = input.readLine().split(" ");
        List<Integer> list =
            Arrays
              .stream(array)
              .map(Integer::valueOf)
              .collect(Collectors.toList());;
        long time = 0;
        if(n<k){
            System.out.println(0);
            return;
        }
        //asList(s);は固定長のlistを返す
        //List<Integer> list = Arrays.asList(hn);
        Collections.sort(list,Collections.reverseOrder());
        list.subList(0,k).forEach(lists -> System.out.println(lists));
        
        for(int m : list){
            time = time + m;
        }
        System.out.println(time);

        }

    }

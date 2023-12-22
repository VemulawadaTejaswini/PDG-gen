import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.useDelimiter("");
        int res = 0;
        while (reader.hasNext()){
            switch (reader.next()){
                case "+":{
                    res++;
                    break;
                }
                case "-":{
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
        reader.close();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] oem = line.split("/");
        oem[0]= "2018";
        System.out.println(oem[0]+"/"+oem[1]+"/"+oem[2]);

    }
}
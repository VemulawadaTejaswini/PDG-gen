import java.io.*;
// import java.math.*;
// import java.util.*;
// import java.util.Map.*;
// import java.util.stream.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader =
            new BufferedReader (new InputStreamReader (System.in));
        int r = Integer.parseInt (reader.readLine());
        System.out.println (3 * (int)Math.pow (r, 2));
        return;
    }
}
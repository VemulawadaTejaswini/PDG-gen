    import java.util.Scanner;
    import java.util.List;
    import java.util.ArrayList;
    import java.util.Collections;
     
    class Main {
      	public static void main(string args[]) {
          
          Scanner std = new Scanner(System.in);
          List<Integer> list = new ArrayList<>();
          
          int N = std.nextInt();
          for(int i = 0; i < N; i++) {
          	int a = std.nextInt();
            list.add(a);
          }
          
          Integer x = Collections.max(list);
          Integer y = Collections.min(list);
            
        }
    }
046A'

import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
HashSet<int> hs = new HashSet<int>();
hs.add(a);
hs.add(b);
hs.add(c);
System.out.println(hs.size());

}
}


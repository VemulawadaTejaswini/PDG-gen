import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
 
    String input1 = scanner.nextLine();
    String A = scanner.nextLine();
    String B = scanner.nextLine();
    String C = scanner.nextLine();
 
int N = Integer.parseInt(input1);

int count = 0;


String AN = "";
String BN = "";
String CN = "";

for(int i=0; i<N;i++){
AN = A.substring(i,i+1);
BN = B.substring(i,i+1);
CN = C.substring(i,i+1);

count++;
count++;

if(!AN.equal(BN)){
if(!BN.equal(CN)){
count++;
count++;
}else{
count++;
}
}else{
if(!AN.equal(CN)){
count++;
}else if(!BN.equal(CN)){
count++;
}
}
}
    System.out.print(count);
    scanner.close();
  }
}
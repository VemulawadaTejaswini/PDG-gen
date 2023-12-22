import java.util.Scanner;
 
public static void main(String[] args) {

int count = 0;
int H;
int A;
 
Scanner scanner = new Scanner(System.in);
H = scanner.next();
A = scanner.next();
 
while (H>0){
  H = H-A;
  count = count + 1;
}
  
}
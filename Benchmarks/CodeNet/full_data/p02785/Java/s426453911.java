import java.util.Scanner;
 
public class Main{
 
public static void main(String[] args) {
 
int count = 0;
//number of enemies
int N;
//special attack
int S;
 
Scanner scanner = new Scanner(System.in);
N = scanner.nextInt();
S = scanner.nextInt();

//list of enemies HP
int u[] = new int[9];
  
for(int i = 0; i<10; i++){
  u[i] = scanner.nextInt();
  
}

int max = u[0];
int min = u[0];
int sum = 0;

for (int i = 0; i < u.length; i++) {
    int v = u[i];
    if (v > max) {
        max = v;
    }
    if (v < min) {
        min = v;
    }
    sum = sum +v;
}

  
System.out.println(sum-max);
  
}
  
}
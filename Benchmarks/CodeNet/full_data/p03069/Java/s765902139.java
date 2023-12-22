import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        int count = 0;
        int countB1 = 0;
        int countW1 = 0;
        int countB2 = 0;
        int countW2 = 0;
        int check = 1;
        int i = 0;
        while(i<num-1){
          if(line[i].equals("#")) {
            if(check == 1) countB1++;
            else countB2++;
          }
          if(line[i].equals("#") && line[i+1].equals(".")) {
            i++;
            while(true){
              if(line[i].equals(".")) {
                if(check == 1) countW1++;
                else countW2++;
              }
              if(line[i].equals("#")  || i == num-1) {
                if(check == 1){
                  check = 2;
                  i--;
                  break;
                }
                if((countB1 > countW1) && (countB2 <= countW2)) count += countB1;
                else{
                  count += (countB1 <= countW1) ? countB1 : countW1;
                }
                if(i == num-1) count += (countB2 <= countW2) ? countB2 : countW2;
                else {
                  countB1 = countB2;
                  countW1 = countW2;
                  countB2 = 0;
                  countW2 = 0;
                  i--;
                }
                break;
              }
              i++;
            }
          }
          if(i == num-2) count += (countB1 <= countW1) ? countB1 : countW1;
          i++;
        }
		System.out.println(count);
	}
}

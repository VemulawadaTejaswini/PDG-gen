import java.util.*;
 
public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int i;
    	long number_of_people, answer;
      	long[] limit = new long[5];
      	number_of_people = Long.parseLong(sc.next());
      	for(i = 0; i < 5; i++) limit[i] = Long.parseLong(sc.next());
      	Arrays.sort(limit);
      	if(number_of_people % limit[0] == 0) answer = number_of_people / limit[0] + 4;
      	else answer = number_of_people / limit[0] + 5;
      	System.out.println(answer);
    }
}
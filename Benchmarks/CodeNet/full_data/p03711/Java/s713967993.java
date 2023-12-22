import java.util.*;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count1 = 1;
        int count2 = 2;
        int count3 = 3;
    switch(a){
        case 1:
            a = count1;
            break;
        case 2:
            a = count3;
            break;
        case 3:
            a = count1;
        break;

        case 4:
            a = count2;
        break;
        case 5:
            a = count1;
        break;
        case 6:
            a = count2;
        break;
        case 7:
            a = count1;
        break;

        case 8:
            a = count1;
        break;

        case 9:
            a = count2;
        break;

        case 10:
            a = count1;
        break;
        case 11:
            a = count2;
        break;

        case 12:
            a = count1;
        break;
        }
    switch(b){
        case 1:
            b = count1;
            break;
        case 2:
            b = count3;
            break;
        case 3:
            b = count1;
        break;

        case 4:
            b = count2;
        break;
        case 5:
            b = count1;
        break;
        case 6:
            b = count2;
        break;
        case 7:
            b = count1;
        break;

        case 8:
            b = count1;
        break;

        case 9:
            b = count2;
        break;

        case 10:
            b = count1;
        break;
        case 11:
            b = count2;
        break;

        case 12:
            b = count1;
        break;
        }
        if(a == b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
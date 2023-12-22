import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int aliceOn = sc.nextInt();
	int aliceOff = sc.nextInt();
	int bobOn = sc.nextInt();
	int bobOff = sc.nextInt();

	int ans;

	if(aliceOff < bobOn){
		ans = 0;
	} else if(bobOff < aliceOn) {
		ans = 0;
	} else if(aliceOn <= bobOn && aliceOff >= bobOff) {
		ans = bobOff - bobOn;
	} else if(aliceOn >= bobOn && aliceOff <= bobOff) {
		ans = aliceOff - aliceOn;
	} else if(aliceOn > bobOn) {
		ans = bobOff - aliceOn;
	} else {
		ans = aliceOff - bobOn;
	}

	System.out.println(ans);

	sc.close();

	}

}
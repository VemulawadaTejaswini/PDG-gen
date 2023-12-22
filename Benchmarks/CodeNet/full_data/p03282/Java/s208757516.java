
import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        String N=sc.next();
        int A = sc.nextInt();
        //int B = sc.nextInt();
        int count=0;
        int last=0;
        StringBuilder K=new StringBuilder();
        for(int i=0;i<N.length();i++) {
        	//System.out.println(N.charAt(i));
        	switch(Character.getNumericValue(N.charAt(i))) {
        	case 1:
        		K.append("1");
        		break;
        	case 2:
        		for(int l=0;l<Math.pow(2,50000000);l++) {K.append("2");}
        		break;
        	case 3:
        		for(int l=0;l<Math.pow(3,50000000);l++) {K.append("3");}
        		break;

        	case 4:
        		for(int l=0;l<Math.pow(4,50000000);l++) {K.append("4");}
        		break;

        	case 5:
        		for(int l=0;l<Math.pow(5,50000000);l++) {K.append("5");}
        		break;

        	case 6:
        		for(int l=0;l<Math.pow(6,50000000);l++) {K.append("6");}
        		break;

        	case 7:
        		for(int l=0;l<Math.pow(7,50000000);l++) {K.append("7");}
        		break;

        	case 8:
        		for(int l=0;l<Math.pow(8,50000000);l++) {K.append("8");}
        		break;

        	case 9:
        		for(int l=0;l<Math.pow(9,50000000);l++) {K.append("9");}
        		break;

        	}
        	if(K.length()>A) {break;}
        }
        //System.out.println(K);
        System.out.println(K.charAt(A-1));

	}

}
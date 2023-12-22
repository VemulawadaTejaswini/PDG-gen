import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String[] Odd=sc.next().split("");
    	String[] Even=sc.next().split("");

    	int length=Odd.length+Even.length;

    	int indexO=0;
    	int indexE=0;

    	StringBuilder result=new StringBuilder();

    	while(true) {

    			if(indexO<=Odd.length-1) {
    				result.append(Odd[indexO]);
    			}

    			if(indexE<=Even.length-1) {
    				result.append(Even[indexE]);
    			}


    			if(indexO>=Odd.length-1 && indexE>=Even.length-1) {
        			break;
        		}else {
        			indexO++;
        			indexE++;
        		}

    	}

    	System.out.println(result.toString());
    }

}


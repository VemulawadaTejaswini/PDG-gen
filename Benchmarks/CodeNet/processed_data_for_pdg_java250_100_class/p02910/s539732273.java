public class Main { 
    public static void main(String[] args) {
      boolean b1 = true;		
      boolean b2 = true;		
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      int mojilen = n.length();
      String[] strArray = n.split("");
      loop: for(int i=0;i<mojilen;i++) {
       		if (Math.abs(i+1) % 2 == 0) {
              switch (strArray[i]) {
        		case "L":
            	b2 = true;
            	break;
        		case "U":
            	b2 = true;
            	break;
       			case "D":
            	b2 = true;
            	break;
        		default:
           		b2 = false;
                break loop;
              }
        }
        else {
                switch (strArray[i]) {
        		case "R":
            	b1 = true;
            	break;
        		case "U":
            	b1 = true;
            	break;
       			case "D":
            	b1 = true;
            	break;
        		default:
           		b1 = false;
                break loop;
        		}
       }
      }
      if (b1 == true && b2 == true){
       System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}

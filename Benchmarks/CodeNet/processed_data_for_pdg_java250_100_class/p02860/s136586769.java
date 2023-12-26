        public class Main { 
            public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int n1 = sc.nextInt();
              String wordw = sc.nextLine();
              int cut1 = n1 / 2;
              String word = sc.nextLine();
              String wordc1 = word.substring(0, cut1);
              String wordc2 = word.substring(cut1, n1);
              if (n1 <= 1) {
            System.out.println("No");
            return;
          } 
              if (wordc1.equals(wordc2)) {
                System.out.println("Yes");
           	}
          	else {
            		System.out.println("No");;
         		}
          }
        }

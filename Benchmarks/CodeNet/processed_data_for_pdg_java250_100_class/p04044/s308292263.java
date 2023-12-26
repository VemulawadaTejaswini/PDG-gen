public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int l =  sc.nextInt();
            String [] str = new String[n];
            int i=0;
            while (i<n)
            {
                str[i] = sc.next();
                i++;
            }
            Arrays.sort(str);
          for(i=0;i<str.length;i++)
          {
          }
          String str2="";
          for(i=0;i<str.length;i++)
          {
              str2 = str2 + str[i];
          }
          System.out.println(str2);
    }
}

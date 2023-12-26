public class Main {
    public static void main(final String[] args){
     final Scanner s = new Scanner(System.in);
     HashSet<String> map = new HashSet<String>();
     final int ugeuge= Integer.parseInt(s.next());
      String tareget ="";
    for(int i=0;i < ugeuge ; i++){
        tareget= s.next();
        if(!map.contains(tareget)){
            map.add(tareget);
        }
    }
            System.out.println(map.size());
    }
}

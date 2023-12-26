public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        String[] arr1 =  s.split("");
        String[] arr2 =  t.split("");
        List list1 = new LinkedList(Arrays.asList(s.split("")));
        List list2 = new LinkedList(Arrays.asList(t.split("")));
        list2.remove(arr2.length - 1);
         if(list1.toString().contentEquals(list2.toString())){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
    }
}

class MyClass {


    public static void main (String [] args){
    Scaner sc = new Scanner(System.in);
    String n = sc.nextString();

    for (char c:n){

        System.out.println (char) ('1' + '9' - c);
    }

    }

}
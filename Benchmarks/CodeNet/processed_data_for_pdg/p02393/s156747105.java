class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int change;
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        if(numA>numB){          
            change = numA;
            numA = numB;
            numB = change;
        }
        if(numB>numC){          
            change = numB;
            numB = numC;
            numC = change;
        }
        if(numA>numB){          
            change = numA;
            numA = numB;
            numB = change;
        }
        System.out.println(numA+" "+numB+" "+numC); 
    }
}

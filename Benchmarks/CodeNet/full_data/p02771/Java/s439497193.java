    int main(int args[]) {
        int sum = 0;
        for (int arg : args) sum += arg;
        switch(sum % args[0]) {
            case 0:
                System.out.println("Yes");
                break;
            default:
                System.out.println("No");
                break;
        }
    }
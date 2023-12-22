class StilTbd{

    public static void main(String[] args){
        String tbd= "TBD";
        String heisei = "Heisei";

        String[] splitDate = args[0].split("/", 0);

        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int day = Integer.parseInt(splitDate[2]);

        if(year <= 2018)  System.out.println(heisei);
        else if(year == 2019 && month <= 4) System.out.println(heisei);
        else System.out.println(tbd);
    }
}
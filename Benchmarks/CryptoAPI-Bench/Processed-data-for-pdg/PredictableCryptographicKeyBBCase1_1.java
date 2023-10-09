public class Dummy {
    public static void main(String [] args){
        byte keyBytes[] = {20,10,30,5,5,6,8,7};
        keyBytes = Arrays.copyOf(keyBytes,16);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
    }
}

//27
public class func{
public void runAppFromCMD(PackageApp packageApp,String[] additionalArgs){
            pb.redirectErrorStream(true);
            final Process process = pb.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((c = input.read()) != -1) {
                System.out.print((char)c);
            }
            input.close();
}
}

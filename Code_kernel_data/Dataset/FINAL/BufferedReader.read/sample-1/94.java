public class func{
public void run(){
            while((read = br.read(buff)) != -1) {

                SessionOutputUtil.addToOutput(sessionOutput.getSessionId(), sessionOutput.getInstanceId(), buff,0,read);
                Thread.sleep(50);
            }
}
}

public class func{
public void runAndWait(Thread interactWithBackendThread){
        interactWithBackendThread.start();
            interactWithBackendThread.join();
}
}

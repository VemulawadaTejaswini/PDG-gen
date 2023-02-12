public class func{
public void getNextJobExecution(UserAccount owner){
        Calendar today = Calendar.getInstance();
        JobExecution jobExecution = new JobExecution(this, owner, today.getTime());
}
}

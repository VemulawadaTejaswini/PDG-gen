//97
public class func{
public void schedule(JobExecution jobExecution){
        LOGGER.log(Level.INFO, "Job Scheduled to {0}", df.format(timer.getNextTimeout()));
        return timer.getNextTimeout();
}
}

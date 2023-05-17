//268
public class func{
public void forceRepairAsync(String keyspace,RepairOption options){
        int cmd = nextRepairCommand.incrementAndGet();
        new Thread(createRepairTask(cmd, keyspace, options)).start();
}
}

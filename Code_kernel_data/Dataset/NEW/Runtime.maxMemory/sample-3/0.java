//0
public class func{
public void run(final CommandSender sender,Player sender_p,Command cmd,String commandLabel,String[] args,boolean senderIsConsole){
        playerMsg("Used Memory: " + new DecimalFormat("#").format((double) usedMem / (double) BYTES_PER_MB) + "mb (" + new DecimalFormat("#").format(((double) usedMem / (double) runtime.totalMemory()) * 100.0) + "%)");
        playerMsg("Max Memory: " + (double) runtime.maxMemory() / (double) BYTES_PER_MB + "mb");
        playerMsg("Calculating ticks per second, please wait...");
}
}

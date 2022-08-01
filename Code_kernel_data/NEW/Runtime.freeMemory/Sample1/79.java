//78
public class func{
	public void serverInfo(CommandContext args,CommandSender sender){
            sender.sendMessage(ChatColor.YELLOW + "Available processors: "
                    + rt.availableProcessors());
            sender.sendMessage(ChatColor.YELLOW + "Available total memory: "
                    + Math.floor(rt.maxMemory() / 1024.0 / 1024.0) + " MB");
            sender.sendMessage(ChatColor.YELLOW + "JVM allocated memory: "
                    + Math.floor(rt.totalMemory() / 1024.0 / 1024.0) + " MB");
            sender.sendMessage(ChatColor.YELLOW + "Free allocated memory: "
                    + Math.floor(rt.freeMemory() / 1024.0 / 1024.0) + " MB");
}
}

//138
public class func{
public void harvestSqlCommands(BufferedReader reader){
        while((line = reader.readLine()) != null) {
            boolean newCommand = SingleLogLineAnalyser.isItStartOfNewCommand(line);
            harvester.processCommandFragment(line, newCommand);
        }
        return harvester.getCommandsInTime();
}
}

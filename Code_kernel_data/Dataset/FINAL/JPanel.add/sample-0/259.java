public class func{
public void createResultsOptionPanel(JPanel optionsPanel,GridBagConstraints gbConstraints){
    myScopePanel = new HideableTitledPanel(FindBundle.message("results.options.group"), resultsOptionPanel,
                                           myPreviousResultsExpandedState);
    optionsPanel.add(myScopePanel, gbConstraints);
}
}

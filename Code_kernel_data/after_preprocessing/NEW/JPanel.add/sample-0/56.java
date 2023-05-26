//56
public class func{
public void layoutCommitListPanel(@NotNull String currentBranch,boolean forward){
    descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    bth.add(descriptionLabel, BorderLayout.NORTH);
    bth.add(forward ? myHeadToBranchListPanel : myBranchToHeadListPanel);
}
}

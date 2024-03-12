Line_2 $$ private void writeReadMe() throws IOException --> Line_3 $$ String text = LocalizedStrings.BackupService_README.toLocalizedString() [CD]
Line_2 $$ private void writeReadMe() throws IOException --> Line_4 $$ Files.write(backupDirectory.resolve(README_FILE), text.getBytes()) [CD]
Line_3 $$ String text = LocalizedStrings.BackupService_README.toLocalizedString() --> Line_4 $$ Files.write(backupDirectory.resolve(README_FILE), text.getBytes()) [FD]

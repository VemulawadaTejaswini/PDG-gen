Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() [CD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_4 $$ html.appendHtmlConstant("<span class='" + "k-digest-unread-count" + "'>") [CD]
Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() --> Line_4 $$ html.appendHtmlConstant("<span class='" + "k-digest-unread-count" + "'>") [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_5 $$ html.appendHtmlConstant(String.valueOf(unread)) [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_5 $$ html.appendHtmlConstant(String.valueOf(unread)) [CD]
Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() --> Line_5 $$ html.appendHtmlConstant(String.valueOf(unread)) [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_6 $$ html.appendHtmlConstant("</span>") [CD]
Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() --> Line_6 $$ html.appendHtmlConstant("</span>") [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_7 $$ html.appendHtmlConstant(" " + messages.of(total)) [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_7 $$ html.appendHtmlConstant(" " + messages.of(total)) [CD]
Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() --> Line_7 $$ html.appendHtmlConstant(" " + messages.of(total)) [FD]
Line_2 $$ private SafeHtml renderUnreadMessages(final int unread, final int total) --> Line_8 $$ return html.toSafeHtml() [CD]
Line_3 $$ final SafeHtmlBuilder html = new SafeHtmlBuilder() --> Line_8 $$ return html.toSafeHtml() [FD]

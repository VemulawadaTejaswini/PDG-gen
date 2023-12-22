  string TapDanceMove;
  char buff;

  cin >> TapDanceMove;
  
  for (int i = 1; i <= TapDanceMove.size(); i++) {
    buff = TapDanceMove[i-1];
    //cout << i << "文字目: " << buff << endl;
    if (i % 2 == 0) {
      if (buff == 'R') {
        cout << "No";
        return;
      }
    } else {
      if (buff == 'L') {
        cout << "No" << endl;
        return;
      }
    }
  }
  cout << "Yes" << endl;
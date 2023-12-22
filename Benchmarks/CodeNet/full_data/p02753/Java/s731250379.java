function main(input) {

  if (input === 'AAA' || input === 'BBB') {
  	console.log('Yes');
    return;
  }
  console.log('No');
}

main(require('fs').readFileSync('/dev/stdin', 'utf8'));

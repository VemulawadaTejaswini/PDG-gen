function main(input) {
   input = input.trim();
  const replaced = 
        input.replace(/1/g, 'a').replace(/9/g, 'b').replace(/a/g, '9').replace(/b/g, '1')
  console.log(replaced);
}
main(require('fs').readFileSync('/dev/stdin', 'utf8'));
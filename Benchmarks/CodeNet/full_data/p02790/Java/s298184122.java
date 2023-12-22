function main(input) {
    var line = input.split(/\r?\n/g);
    var arr = line[0].split(" ");
    const a = arr[0], b = arr[1];
    console.log(a.repeat(parseInt(b)) < b.repeat(parseInt(a)) ?
        a.repeat(parseInt(b)) : b.repeat(parseInt(a)));
}
main(require('fs').readFileSync('/dev/stdin', 'utf8'));
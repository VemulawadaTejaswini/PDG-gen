#!/usr/bin/perl

use strict;
use warnings;

my $n = <STDIN>;
my $s = <STDIN>;

my $ans = 0;
for (my $i=0; $i<10; $i++) {
    my $a = index($s, $i);
    next if $a<0 || $a>=length($s)-2; 
    for (my $j=0; $j<10; $j++) {
        my $b = index(substr($s, $a+1), $j);
        next if $b<0 || $b>=length(substr($s, $a+1))-1; 
        for (my $k=0; $k<10; $k++) {
            my $c = index(substr(substr($s, $a+1), $b+1), $k);
            next if $c<0 || $c>=length(substr(substr($s, $a+1), $b+1)); 
            $ans++;
        }
    }
}

print "$ans\n";
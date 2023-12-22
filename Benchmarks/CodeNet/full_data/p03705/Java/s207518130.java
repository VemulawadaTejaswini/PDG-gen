<?php

class In {

	private $buf = [];
	private $count = 0;
	private $pointer = 0;

	public function nextLine() {
		$ret = '';
		if($this->hasNext()){
			while($this->hasNext()){
				$ret .= $this->next();
			}
		}else{
			$ret = trim(fgets(STDIN));
		}

		return $ret;
	}

	public function next() {
		if(!$this->hasNext()) {
			$str = trim(fgets(STDIN));
			$this->buf = explode(' ',$str);
			$this->count = count($this->buf);
			$this->pointer = 0;
		}

		return $this->buf[$this->pointer++];
	}

	public function hasNext() {
		return $this->pointer < $this->count;
	}

	public function nextInt() {
		return (int)$this->next();
	}

	public function nextDouble() {
		return (double)$this->next();
	}
}

class Out {
	public function println($str = '') {
		echo $str . PHP_EOL;
	}
}

$in = new In();
$out = new Out();

$N = $in->nextInt();
$A = $in->nextInt();
$B = $in->nextInt();

if ($A > $B) {
	$out->println(0);
	return;
}

if ($N <= 1) {
	if ($A == $B) {
		$out->println(1);
	} else {
		$out->println(0);
	}
	return;
}

$ans = ($N - 2) * ($B - $A) + 1;

$out->println($ans);

?>

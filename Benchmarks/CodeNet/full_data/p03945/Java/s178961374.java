let ans s =
  let n = String.length s in
  let rec f i c ret =
    if i = n then ret
    else if s.[i] = c then f (i+1) c ret
    else f (i+1) s.[i] (ret+1)
  in f 1 s.[0] 0;;

Scanf.scanf "%s" (fun s -> print_int (ans s))

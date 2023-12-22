import Control.Monad
import Data.Maybe
import Debug.Trace
import Data.List
import qualified Data.Map.Strict as Map
import qualified Data.IntMap.Strict as IntMap
import qualified Data.Set as Set
import qualified Data.IntSet as IntSet
import Data.Functor
import Data.Array
import Data.Bits

main :: IO ()
main = do
  (n:k:_) <- fmap (map read . words) getLine :: IO [Integer]
  as <- fmap (map read . words) getLine :: IO [Integer]
  print $ solve''' k as

solve''' k as = f . sum . zipWith (*) xs $ map (2^) [0..]
  where
    cs = takeWhile (< k) $ map (2^) [0..]
    base = f 0
    xs =  map (\c -> if f c > base then 1 else 0) cs
    f x = foldr (\a acc -> acc + (a `xor` x)) 0 as

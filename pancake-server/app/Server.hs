module Main(main) where

import qualified MyLib (someFunc)

main :: IO ()
main = do
  putTextLn "Hello, Haskell!"
  MyLib.someFunc

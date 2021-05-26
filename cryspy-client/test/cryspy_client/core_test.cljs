(ns cryspy-client.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [cryspy-client.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= :q 2))))

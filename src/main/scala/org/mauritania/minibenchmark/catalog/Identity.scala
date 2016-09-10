package org.mauritania.minibenchmark.catalog

import org.mauritania.mauritania._
import org.openjdk.jmh.annotations.Benchmark

class Identity {

  @Benchmark
  def identity1(): Int = {
    Range(1, seed).toList.sum
  }

  @Benchmark
  def identity2(): Int = {
    Range(1, seed).toList.sum
  }

}



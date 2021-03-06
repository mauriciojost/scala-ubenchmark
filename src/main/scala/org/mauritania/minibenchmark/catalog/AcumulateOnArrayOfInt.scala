package org.mauritania.minibenchmark.catalog

import org.openjdk.jmh.annotations.Benchmark
import org.mauritania.mauritania._

class AcumulateOnArrayOfInt {

  @Benchmark
  def genericWithBoxing(): Int = {
    LargeArray.sum
  }

  @Benchmark
  def forLoopWithoutBoxing(): Int = {
    var acum: Int = 0
    for (i <- Range(0, LargeArray.length)) {
      acum += LargeArray(i)
    }
    acum
  }

  @Benchmark
  @specialized
  def genericButSpecialized(): Int = {
    LargeArray.sum
  }

}

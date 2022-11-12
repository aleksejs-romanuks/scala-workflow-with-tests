package com.samples.scala

import org.scalatest.funsuite.AnyFunSuite

class TriangleTest extends AnyFunSuite {

  test("1. triangle area calculation"){
    assert(Triangle(3,4,5).area === 6)
  }

}

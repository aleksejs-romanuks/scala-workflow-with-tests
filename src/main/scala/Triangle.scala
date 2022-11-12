package com.samples.scala

class Triangle (a: Double, b: Double, c: Double) {
  def area: Double = {
    val s = (a + b + c) / 2
    java.lang.Math.sqrt(s * (s - a) * (s - b) * (s - c))
  }
}

object Triangle extends App {
  def apply(a: Double, b: Double, c: Double) = new Triangle(a, b, c)
}
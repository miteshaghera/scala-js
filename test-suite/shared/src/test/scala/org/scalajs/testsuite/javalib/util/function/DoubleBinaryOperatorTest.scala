/*
 * Scala.js (https://www.scala-js.org/)
 *
 * Copyright EPFL.
 *
 * Licensed under Apache License 2.0
 * (https://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package org.scalajs.testsuite.javalib.util.function

import org.junit.Assert._
import org.junit.Test

import java.util.function._

class DoubleBinaryOperatorTest {
  @Test def applyAsDouble(): Unit = {
    val sumOp = new DoubleBinaryOperator {
      override def applyAsDouble(left: Double, right: Double): Double = left + right
    }
    assertEquals(30, sumOp.applyAsDouble(10, 20), 0)
  }
}

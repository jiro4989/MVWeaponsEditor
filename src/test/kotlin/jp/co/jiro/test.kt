package jp.co.jiro

import jp.co.jiro.*
import org.junit.Test
import org.junit.Before
import org.junit.After
import org.junit.Assert.*

class JUnitClassTest {
  @Before fun setUp() {
    println("setUp")
  }

  @Test fun testMax() {
    println("testMax")
  }

  @After fun setDown() {
    println("setDown")
  }

}


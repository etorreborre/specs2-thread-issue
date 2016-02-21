package com.kpbochenek


import org.specs2.concurrent.ExecutionEnv
import org.specs2.matcher.FutureMatchers
import org.specs2._
import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

class TestClassSpec extends SpecificationLike with FutureMatchers {

  def computeFuture(): Future[String] = Future {
    Thread.sleep(1000)
    println("COMPLETED!")
    "Completed"
  }

  def is = s2"""

This is a specification testing deadlock on futures.

Future should complete succesfully
  t1 $t1
  t2 $t2
  t3 $t3
  t4 $t4
  t5 $t5
  t6 $t6
  t7 $t7
  t8 $t8
  t9 $t9
  t10 $t10
  t11 $t11
  t12 $t12
  t13 $t13
  t14 $t14
  t15 $t15
  t16 $t16
  t17 $t17
"""

  def t1 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t2 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t3 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t4 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t5 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t6 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t7 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t8 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t9 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t10 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t11 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t12 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t13 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t14 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t15 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t16 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

  def t17 = { implicit ec: ExecutionEnv =>
    val f: Future[String] = computeFuture()
    eventually {
      f must beEqualTo("Completed").await
    }
  }

}

package com.kpbochenek

import org.specs2.mutable._
import org.specs2.matcher.FutureMatchers
import org.specs2.concurrent.ExecutionEnv

import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

class ClassFutureSpec extends Specification with FutureMatchers {

  def computeFuture(): Future[String] = Future {
    println("COMPLETED!")
    "Completed"
  }

  "ClassFuture" should {
    "t1" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t1" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t2" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t3" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t4" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t5" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t6" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }

    "t7" in { implicit ec: ExecutionEnv =>
      val f: Future[String] = computeFuture()
      eventually {
        f must beEqualTo("Completed").await
      }
    }
  }
}

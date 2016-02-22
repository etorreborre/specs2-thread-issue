package com.kpbochenek

import akka.actor.{Actor, ActorSystem, Props}
import akka.pattern.ask
import akka.testkit.{ImplicitSender, TestKit}
import akka.util.Timeout
import org.specs2.concurrent.ExecutionEnv
import org.specs2.matcher.FutureMatchers
import org.specs2.mutable._

import scala.concurrent.duration._

case class ADD(a: Int, b: Int)
case class RESULT(r: Int)

class AddActor extends Actor {
    def receive = {
      case ADD(a, b) =>
        println("RESULT " + (a+b))
        sender() ! RESULT(a+b)
    }
}



class ActorClassSpec(implicit ec: ExecutionEnv) extends TestKit(ActorSystem("test")) with ImplicitSender with FutureMatchers with SpecificationLike {

  implicit val askTimeout: Timeout = 2.seconds

  "t1" in {
    println("GO1")
      val underTest = system.actorOf(Props[AddActor])
      eventually {
        println("eventually1")
        (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
      }
    }

  "t2" in {
    println("GO2")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually2")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t3" in {
    println("GO3")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually3")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t4" in {
    println("GO4")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually4")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t5" in {
    println("GO5")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually5")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t6" in {
    println("GO6")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually6")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t7" in { implicit ec: ExecutionEnv =>
    println("GO7")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually7")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t8" in {
    println("GO8")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually8")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t9" in {
    println("GO")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t10" in {
    println("GO")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      println("eventually")
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t11" in {
    println("GO")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }

  "t12" in {
    println("GO")
    val underTest = system.actorOf(Props[AddActor])
    eventually {
      (underTest ? ADD(1, 1)).mapTo[RESULT] must beEqualTo(RESULT(2)).await
    }
  }
}

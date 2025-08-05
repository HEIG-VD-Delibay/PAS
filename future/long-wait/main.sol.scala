import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global

@main def hello(): Unit =
  val f1 = Future { Thread.sleep(1000); println("good") }
  val f2 = Future { Thread.sleep(2000); println("good") }
  val f3 = Future { Thread.sleep(1500); println("good") }
  Future.sequence(List(f1, f2, f3)).map(_ => println("done"))
  Thread.sleep(3000)

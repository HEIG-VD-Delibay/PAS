import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global

@main def hello(): Unit =
  val f1 = Future { 1 }.map(x => Future { x + 2 }).map(println)
  Thread.sleep(1000)

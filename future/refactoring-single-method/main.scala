import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global

@main def hello(): Unit =
  val f1 = Future { 1 }
    .map(x => println(s"Got $x"))
    .recover(e => println("Got an error sorry: " + e.getMessage()))
  Thread.sleep(1000)

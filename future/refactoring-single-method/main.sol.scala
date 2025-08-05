import scala.concurrent.*
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.*

@main def hello(): Unit =
  val f1 = Future { 1 }
    .transform {
      case Success(x) => println(s"Got $x"); Success(())
      case Failure(e) =>
        println("Got an error sorry: " + e.getMessage()); Success(())
    }
  Thread.sleep(1000)

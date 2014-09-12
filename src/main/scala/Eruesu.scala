package com.github.ackintosh

import java.io._

/** The launched conscript entry point */
class Eruesu extends xsbti.AppMain {
  def run(config: xsbti.AppConfiguration) = {
    Exit(Eruesu.run(config.arguments))
  }
}

object Eruesu {
  /** Shared by the launched version and the runnable version,
   * returns the process status code */
  def run(args: Array[String]): Int = {
    val ls = new Ls(new File("."))
    println(ls.output())
    0
  }
  /** Standard runnable class entrypoint */
  def main(args: Array[String]) {
    run(args)
  }
}

case class Exit(val code: Int) extends xsbti.Exit

package com.github.ackintosh

class Ls(dir: java.io.File) {
  def output(): String = {
    dir.listFiles().map(_.getName()).mkString(" ")
  }
}
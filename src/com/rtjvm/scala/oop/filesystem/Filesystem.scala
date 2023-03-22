package com.rtjvm.scala.oop.filesystem

import com.rtjvm.scala.oop.commands.Command
import com.rtjvm.scala.oop.files.Directory

import java.util.Scanner

object Filesystem extends App {

  val root = Directory.ROOT
  // [1,2,3,4]
  // List(1,2,3,4).foldLeft(0)((x,y) => x + y)
//  io.Source.stdin.getLines().foldLeft(State(root, root))((currentState, newLine) => {
//    currentState.show
//    Command.from(newLine).apply(currentState)
//  })
//
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {

    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }


}

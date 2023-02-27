package com.rtjvm.scala.oop.commands

import com.rtjvm.scala.oop.filesystem.State


class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("command not found!")

  object Command {

    def from(input: String): Command =
      new UnknownCommand
  }
}



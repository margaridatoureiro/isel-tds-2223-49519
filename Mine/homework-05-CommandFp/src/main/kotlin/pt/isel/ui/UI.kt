package pt.isel.ui

import pt.isel.ttt.Board

fun readCommandsOop(cmds: Map<String, CommandOop>) {
    var board: Board? = null
    while(true) {
        print("> ")
        val input = readln()
        val words = input.trim().split(' ') // E.g. ["play", "X", "0", "1"]
        val cmd = cmds[words[0].uppercase()]
        if(cmd == null) {
            println("Invalid command")
            continue
        }
        try {
            board = cmd.action(board, words.drop(1))
            if(board == null) break
            cmd.show(board)
        } catch (e: Exception) {
            println(e.message)
            println(cmd.syntax)
        }
    }
}

/* IN PROGRESS, TO BE CONCLUDED */

/* possible solution: creating a CommandGeneric used by CommandOop and CommandFp*/
/* would allow to use a single function readCommand */

/*fun readCommandsFp(cmds: Map<String, CommandFp>) {
    var board: Board? = null
    while(true) {
        print("> ")
        val input = readln()
        val words = input.trim().split(' ') // E.g. ["play", "X", "0", "1"]
        val cmd = cmds[words[0].uppercase()]
        if(cmd == null) {
            println("Invalid command")
            continue
        }
        try {
            board = cmd.action(board, words.drop(1))
            if(board == null) break
            cmd.show(board)
        } catch (e: Exception) {
            println(e.message)
            println(cmd.syntax)
        }
    }
}*/

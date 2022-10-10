import pt.isel.ttt.BOARD_SIZE
import pt.isel.ttt.Board
import pt.isel.ttt.BoardWin
import pt.isel.ttt.Position

val sepLine = "\n"+"---+".repeat(BOARD_SIZE -1)+"---"

fun printBoard(board: Board?) {
    Position.values.forEach { pos ->
        if (board != null) {
            print(" ${board.get(pos)?.player?.symbol ?: " "} ")
        }
        if (pos.col == BOARD_SIZE -1)
            if (pos.lin < BOARD_SIZE -1) println(sepLine)
            else println()
        else
            print("|")
    }
    if(board is BoardWin)
        board.winner.apply{ println("Player ${board.winner} wins.") }
}
/*
 O |   |
---+---+---
 X | O |
---+---+---
 O |   | X
 */
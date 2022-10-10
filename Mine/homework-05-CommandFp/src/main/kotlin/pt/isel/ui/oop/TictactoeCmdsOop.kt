package pt.isel.ui
import printBoard
import pt.isel.ttt.*

object CmdQuitOop : CommandOop {
    override fun action(board: Board?, args: List<String>) = null
    override fun show(board: Board) {}
    override val syntax: String get() = "quit"
}
object CmdStartOop : CommandOop {
    override fun action(board: Board?, args: List<String>) = BoardRun()
    override fun show(board: Board) = printBoard(board)
    override val syntax: String get() = "start"
}

object CmdPlayOop : CommandOop {
    override fun show(board: Board) = printBoard(board)
    override val syntax: String get() = "play <X|O> <line> <col>"
    override fun action(board: Board?, args: List<String>): Board? = playAction(board, args)
}

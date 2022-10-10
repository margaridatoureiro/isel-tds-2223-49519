package pt.isel.ui

import pt.isel.ttt.Board
import pt.isel.ttt.Position
import pt.isel.ttt.toPlayer

class CommandFp (
    val action: (board: Board?, args: List<String>) -> Board?,
    val show: (Board?) -> Unit,
    val syntax : String
)

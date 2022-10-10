package pt.isel.ui
import printBoard
import pt.isel.ttt.BoardRun

val cmdStartFp = CommandFp(
    action = { game, args ->
                BoardRun()
                playAction(game, args)
             },
    show = { game -> printBoard(game) },
    syntax = "start"
)

val cmdPlaytFp = CommandFp(
    action = { game, args ->
                playAction(game, args)
                game
            },
    show = { game -> printBoard(game) },
    syntax = "play <X|O> <line> <col>"
)

val cmdQuitFp = CommandFp(
    action = { _, _ -> null },
    show = { },
    syntax = "quit"
)


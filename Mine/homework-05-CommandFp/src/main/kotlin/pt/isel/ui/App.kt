package pt.isel.ui

fun main() {

    /*OOP VERSION*/
    /*readCommandsOop(mapOf<String, CommandOop>(
        "QUIT" to CmdQuitOop,
        "PLAY" to CmdPlayOop,
        "START" to CmdStartOop
    ))*/

    /*----------------------------------------------*/

    /* FP VERSION*/
    readCommandsFp(mapOf<String, CommandFp>(
        "START" to cmdStartFp,
        "PLAY" to cmdPlaytFp,
        "QUIT" to cmdQuitFp
    ))
}



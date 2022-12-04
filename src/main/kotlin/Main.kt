import Signals.*
import States.*

fun main(args: Array<String>) {
    val sttInput = args.joinToString(separator = " ")
    when (fsmState)
    {
        signalIdle -> stateIdle(sttInput)
        signalListening -> stateListening(sttInput)
        signalAct1 -> stateAct1()
        signalAct2 -> stateAct2()
        signalAct3 -> stateAct3()
        else -> stateIdle(sttInput)
    }
    println(fsmState)
}
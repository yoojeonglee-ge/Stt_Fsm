package States

import Signals.*

// This state should be saved externally to avoid constant initialization
var fsmState = signalIdle;

fun stateIs(state: Int)
{
    fsmState = state;
}
fun stateIdle(data: String)
{
    if("hello edison" == data)
    {
        stateIs(signalListening)
    }
}

fun stateListening(data: String)
{
    when (data)
    {
        "act one" -> stateIs(signalAct1)
        "act two" -> stateIs(signalAct2)
        "act three" -> stateIs(signalAct3)
        else -> stateIs(signalIdle)
    }
}

fun stateAct1()
{
    // do act 1 function
}

fun stateAct2()
{
    // do act 2 function
}

fun stateAct3()
{
    // do act 3 function
}
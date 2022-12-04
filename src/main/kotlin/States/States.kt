package States

import Signals.*

// This state should be saved externally to avoid constant initialization
var Fsm_State = Signal_Idle;

fun StateIs(state: Int)
{
    Fsm_State = state;
}
fun State_Idle(data: String)
{
    if("hello edison" == data)
    {
        StateIs(Signal_Listening)
    }
}

fun State_Listening(data: String)
{
    when (data)
    {
        "act one" -> StateIs(Signal_Act_1)
        "act two" -> StateIs(Signal_Act_2)
        "act three" -> StateIs(Signal_Act_3)
        else -> StateIs(Signal_Idle)
    }
}

fun State_Act_1()
{
    // do act 1 function
}

fun State_Act_2()
{
    // do act 2 function
}

fun State_Act_3()
{
    // do act 3 function
}
package States

import Signals.*

var Fsm_State = Signal_Idle;

fun State_Idle(data: String)
{
    if("hello edison" == data)
    {
        Fsm_State = Signal_Listening
    }
}

fun State_Listening(data: String)
{
    when (data)
    {
        "act one" -> Fsm_State = Signal_Act_1
        "act two" -> Fsm_State = Signal_Act_2
        "act three" -> Fsm_State = Signal_Act_3
        else -> Fsm_State = Signal_Listening
    }
}

fun State_Act_1()
{
    // do act 1 function
}

fun State_Act_2()
{
    // do act 1 function
}

fun State_Act_3()
{
    // do act 1 function
}
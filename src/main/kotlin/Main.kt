import Signals.*
import States.*

fun main(args: Array<String>) {
    val stt_input = args.joinToString(separator = " ")
    when (Fsm_State)
    {
        Signal_Idle -> State_Idle(stt_input)
        Signal_Listening -> State_Listening(stt_input)
        Signal_Act_1 -> State_Act_1()
        Signal_Act_2 -> State_Act_2()
        Signal_Act_3 -> State_Act_3()
        else -> State_Idle(stt_input)
    }
    println(Fsm_State)
}
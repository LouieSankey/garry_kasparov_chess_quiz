package com.example.masterclassquizcompanion

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{


        val questionList = ArrayList<Question>()
        val q1 = Question(1, "If white's pawn moves forward one space, " +
                "this is an example of a...", R.drawable.ic_double_attack,
                "Skewer",
                "Pin",
                "Double Attack",
                "Slice Attack",
                3)

        questionList.add(q1)

        val q2 = Question(1, "How many skewers are available to the white bishop?", R.drawable.skewers,
                "0",
                "1",
                "2",
                "3",
                3)

        questionList.add(q2)

        val q3 = Question(1, "When white pushes its center pawn on e4 forward, there is a discovered attack on...", R.drawable.discoverd_attack,
                "the king",
                "the king and queen",
                "the queen",
                "the bishop",
                2)

        questionList.add(q3)

        val q4 = Question(4, "If white moves its rook to g5, it could be considered a...", R.drawable.pin,
                "Pin",
                "Discovered Attack",
                "En passant",
                "Checkmate",
                1)

        questionList.add(q4)

        val q5 = Question(5, "When white moves its pawn from f2 to f4 (to in between the rooks) this is what kind of tactic?", R.drawable.interference,
                "Overloading",
                "Backtracking",
                "Sicilian Defense",
                "Interference",
                4)

        questionList.add(q5)

        return questionList

    }
}
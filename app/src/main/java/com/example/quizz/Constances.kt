package com.example.quizz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which animal is this?",
            R.drawable.img_deer, "deer", "Cat", "Cow", "Elephant", 1
        )

        val que2 = Question(
            2, "Which animal is this?",
            R.drawable.img_tiger, "deer", "tiger", "Cow", "Elephant", 2
        )

        val que3 = Question(
            3, "Which animal is this?",
            R.drawable.img_lion, "deer", "Cat", "lion", "Elephant", 3
        )

        val que4 = Question(
            4, "Which animal is this?",
            R.drawable.img_giraffe, "deer", "Cat", "Cow", "Giraffe", 4
        )

        val que5 = Question(
            5, "Which animal is this?",
            R.drawable.img_horse, "deer", "horse", "Cow", "Elephant", 2
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        return questionsList
    }
}
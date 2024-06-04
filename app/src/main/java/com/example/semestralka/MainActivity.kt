package com.example.semestralka

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var totalQuestionsTextView: TextView
    private lateinit var questionTextView: TextView
    private lateinit var ansA: Button
    private lateinit var ansB: Button
    private lateinit var ansC: Button
    private lateinit var ansD: Button
    private lateinit var submitBtn: Button
    private lateinit var editTextName: EditText
    private lateinit var editTextSurname: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhoneNumber: EditText

    private var score = 0
    private val totalQuestion = Question.questions.size
    private var currentQuestionIndex = 0
    private var selectedAnswer = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        totalQuestionsTextView = findViewById(R.id.pocet)
        questionTextView = findViewById(R.id.otazka_1)
        ansA = findViewById(R.id.ans_A)
        ansB = findViewById(R.id.ans_B)
        ansC = findViewById(R.id.ans_C)
        ansD = findViewById(R.id.ans_D)
        submitBtn = findViewById(R.id.submit_btn)

        ansA.setOnClickListener(this)
        ansB.setOnClickListener(this)
        ansC.setOnClickListener(this)
        ansD.setOnClickListener(this)
        submitBtn.setOnClickListener(this)

        totalQuestionsTextView.text = "Pocet Otaziek : $totalQuestion"

        loadNewQuestion()
    }

    override fun onClick(view: View) {
        ansA.setBackgroundColor(Color.WHITE)
        ansB.setBackgroundColor(Color.WHITE)
        ansC.setBackgroundColor(Color.WHITE)
        ansD.setBackgroundColor(Color.WHITE)



        val clickedButton = view as Button
        if (clickedButton.id == R.id.submit_btn) {
            if (selectedAnswer == Question.correctAnswers[currentQuestionIndex]) {
                score++
            }
            currentQuestionIndex++
            loadNewQuestion()
        } else {
            // choices button clicked
            selectedAnswer = clickedButton.text.toString()
            clickedButton.setBackgroundColor(Color.MAGENTA)
        }
    }

    private fun loadNewQuestion() {
        if (currentQuestionIndex == totalQuestion) {
            finishQuiz()
            return
        }

        questionTextView.text = Question.questions[currentQuestionIndex]
        ansA.text = Question.choices[currentQuestionIndex][0]
        ansB.text = Question.choices[currentQuestionIndex][1]
        ansC.text = Question.choices[currentQuestionIndex][2]
        ansD.text = Question.choices[currentQuestionIndex][3]
    }

    private fun finishQuiz() {
        val passStatus = if (score >= totalQuestion * 0.60) "Spravil/a ste zapocet" else "mrzi to nas ale prisli ste na test nepripraveny/na"

        AlertDialog.Builder(this)
            .setTitle(passStatus)
            .setMessage("Studen s menom  a priezviskom  dostal za test $score spravnych odpovedi  z $totalQuestion")
            .setPositiveButton("Spustit nanovo?") { dialogInterface, i -> restartQuiz() }
            .setCancelable(false)
            .show()
    }

    private fun restartQuiz() {
        score = 0
        currentQuestionIndex = 0
        loadNewQuestion()
    }
}
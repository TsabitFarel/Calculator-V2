package idn.tsabit.moderncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var numberOne = 0
    private var isPlus = false
    private var isMinus = false
    private var isMulti = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init the lateinit var variable
        textView = findViewById(R.id.txtResult)
    }

    // Making the function to make the button clicked and displayed on the TextView
    fun operatorFunction(view: View) {
        when(view.id) {
            R.id.btnOne -> {
                numberClicked(1)
            }

            R.id.btnTwo -> {
                numberClicked(2)
            }

            R.id.btnThree -> {
                numberClicked(3)
            }

            R.id.btnFour -> {
                numberClicked(4)
            }

            R.id.btnFive -> {
                numberClicked(5)
            }

            R.id.btnSix -> {
                numberClicked(6)
            }

            R.id.btnSeven -> {
                numberClicked(7)
            }

            R.id.btnEight -> {
                numberClicked(8)
            }

            R.id.btnNine -> {
                numberClicked(9)
            }

            R.id.btnZero -> {
                numberClicked(0)
            }

            R.id.btnClear -> {
                textView.text = ""
            }

            R.id.btnPlus -> {
                plusClicked()
            }

            R.id.btnSubtract -> {
               subtractClicked()
            }

            R.id.btnMultiplication -> {
                multiClicked()
            }

            R.id.btnDivide -> {
                divideClicked()
            }

            R.id.btnResult -> {
                resultClicked()
            }
        }
    }

    // Making the functions to make the code clean
    private fun numberClicked(numberClicked: Int) {
        val number = textView.text.toString() + numberClicked.toString()
        textView.text = number
    }

    private fun plusClicked() {
        numberOne = textView.text.toString().toInt()
        textView.text = ""
        isPlus = true
    }

    private fun subtractClicked() {
        numberOne = textView.text.toString().toInt()
        textView.text = ""
        isMinus = true
    }

    private fun multiClicked() {
        numberOne = textView.text.toString().toInt()
        textView.text = ""
        isMulti = true
    }

    private fun divideClicked() {
        numberOne = textView.text.toString().toInt()
        textView.text = ""
    }

    private fun resultClicked() {
        when {
            isPlus -> plus()
            isMinus -> subtract()
            isMulti -> multiplication()
            else -> divide()
        }
    }

    private fun plus() {
        val numberTwo = textView.text.toString().toInt()
        val result = numberOne + numberTwo
        textView.text = result.toString()
        isPlus = false
    }

    private fun subtract() {
        val numberTwo = textView.text.toString().toInt()
        val result = numberOne - numberTwo
        textView.text = result.toString()
        isMinus = false
    }

    private fun multiplication() {
        val numberTwo = textView.text.toString().toInt()
        val result = numberOne * numberTwo
        textView.text = result.toString()
        isMulti = false
    }

    private fun divide() {
        val numberTwo = textView.text.toString().toInt()
        val result = numberOne / numberTwo
        textView.text = result.toString()
    }
}
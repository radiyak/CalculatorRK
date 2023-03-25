package com.example.calculatorrk

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatorrk.databinding.FragmentButtonsBinding
import java.lang.Math.abs
import kotlin.math.sqrt


class ButtonsFragment : Fragment() {
    var buttonnumber=""
    private lateinit var binding: FragmentButtonsBinding
    var number=""
    var number2=""
    var answer=0
    var answer2=0.0
    var operand1=0
    //var operand2: Number=0
    var operator="+"
    var call: ButtonsFragment.ButtonsListener ?=null
    interface ButtonsListener{
        fun numberClick(num:String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        call=context as ButtonsListener
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentButtonsBinding.inflate(inflater, container, false)
        binding.zero.setOnClickListener(){
            number+=binding.zero.text.toString()

            call?.numberClick(number)
        }
        binding.one.setOnClickListener(){
            number+=binding.one.text.toString()

            call?.numberClick(number)
        }
        binding.two.setOnClickListener(){
            number+=binding.two.text.toString()

            call?.numberClick(number)
        }
        binding.three.setOnClickListener(){
            number+=binding.three.text.toString()

            call?.numberClick(number)
        }
        binding.four.setOnClickListener(){
            number+=binding.four.text.toString()

            call?.numberClick(number)
        }
        binding.five.setOnClickListener(){
            number+=binding.five.text.toString()

            call?.numberClick(number)
        }
        binding.six.setOnClickListener(){
            number+=binding.six.text.toString()

            call?.numberClick(number)
        }
        binding.seven.setOnClickListener(){
            number+=binding.seven.text.toString()

            call?.numberClick(number)
        }
        binding.eight.setOnClickListener(){
            number+=binding.eight.text.toString()

            call?.numberClick(number)
        }
        binding.nine.setOnClickListener(){
            number+=binding.nine.text.toString()

            call?.numberClick(number)
        }
        binding.plus.setOnClickListener(){

            operand1=number.toInt()
            //number=""

            operator="+"

            call?.numberClick(number)
            number=""
        }
        binding.minus.setOnClickListener(){
            operand1=number.toInt()
            //number=""

            operator="-"

            call?.numberClick(number)
            number=""
        }
        binding.multiply.setOnClickListener(){
            operand1=number.toInt()
            //number=""
            operator="*"

            call?.numberClick(number)
            number=""
        }
        binding.divide.setOnClickListener(){

            operand1=number.toInt()


            operator="/"
            call?.numberClick(number)
            number=""

        }
        binding.square.setOnClickListener(){
            operand1=number.toInt()
            //number=""


            operator="SQRT"

            call?.numberClick(number)
            number=""
        }
        binding.mod.setOnClickListener(){
            operand1=number.toInt()
            //number=""


            operator="%"

            call?.numberClick(number)
            number=""
        }
        binding.clearall.setOnClickListener(){

            number=""
            call?.numberClick(number)

        }
        binding.clear.setOnClickListener(){
            if(number.length>0){

            number=number.substring(0,number.length-1)}
            call?.numberClick(number)

        }
        binding.sign.setOnClickListener(){
            if(number.toInt()>0){
                number=(number.toInt()-2*number.toInt()).toString()



            }
            else{
                number=abs(number.toInt()).toString()

            }
            call?.numberClick(number)

        }
        binding.equals.setOnClickListener(){
            when(operator){
                "+"->{


                    answer=operand1+number.toInt()

                }
                "-"->{
                    answer=operand1-number.toInt()

                }
                "/"->{
                    answer2=operand1/number.toDouble()


                }
                "*"->{
                    answer=operand1*number.toInt()

                }
                "SQRT"->{
                    answer2=sqrt(operand1.toDouble())
                }
                "%"->{
                    answer=operand1 % number.toInt()
                }



        }

            //number=""
            if(operator!="/" && operator!="SQRT"){
                number=answer.toString()
                call?.numberClick(answer.toString())}
            else{

                number=answer2.toString()
                call?.numberClick(answer2.toString())

            }
        }
        return binding.root
    }


}
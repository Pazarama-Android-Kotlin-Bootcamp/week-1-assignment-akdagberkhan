package com.akdagberkhan.ders_1

fun main(args: Array<String>)
{
    println(FirstFactorial(8))
    println(Validation("k5aa_ka5"))
    println(QuestionsMarks("aa6?9"))
}
//ÖDEV - 4
fun FirstFactorial(num: Int): Int {

    var result: Int = 1
    var i : Int = num
    while(i > 0)
    {
        result *= i
        i--
    }

    return result;
}
//ÖDEV - 4 SONN
//ÖDEV - 1
fun Validation(str : String): Boolean
{
    var result : Boolean = false
    val myArrayStr = arrayOf("a","b","c","d","e","f","g","h","j","k","l","ş","i","s","q","w","e","r","t","y","u","ı","o","p","ğ","ü","z","x","v","n","m","ö","ç")
    val myArrayNum = arrayOf("0","1","2","3","4","5","6","7","8","9")
    var check : Int = 1

    myArrayNum.forEach {
        if(str.get(0).toString().equals(it))
        {

            check = -1
        }
    }
    if (str.length>=4 && str.length<=25 && !str.get(str.length-1).equals("_") && !check.equals(-1))
    {
        str.forEach { st : Char -> Unit
            if (st.equals("_")) {
                ++check
            }
            else {
                myArrayNum.forEach {
                    if (st.toString().equals(it)) {
                        ++check
                    }
                }
                myArrayStr.forEach {
                    if (st.toString().equals(it)) {
                        ++check
                    }

                }
            }
        }

    }
    else
        result = false

    if(str.length.equals(check))
    {
        result = true
    }
    return result
}
//ÖDEV - 1 SON

//ÖDEV - 5
fun QuestionsMarks(str : String) : Boolean
{
    val myArrayNum = arrayOf("0","1","2","3","4","5","6","7","8","9")
    val mySumArrayIndex = arrayListOf<Int>()
    val mySumArrayStr = arrayListOf<String>()
    var result : Boolean = false
    var sum : Int = 0
    str.forEach {
        mySumArrayStr.add(it.toString())
    }
    mySumArrayStr.forEach { st : String -> Unit
        myArrayNum.forEach {
            if (st.toString().equals(it))
            {
                mySumArrayIndex.add(mySumArrayStr.indexOf(st))
            }
        }
    }
    if (mySumArrayIndex.size < 2) result = false

    var i : Int = 1
    while (i<mySumArrayIndex.size)
    {
        if ((mySumArrayStr[mySumArrayIndex[i-1]].toInt()+mySumArrayStr[mySumArrayIndex[i]].toInt()) == 10)
        {
            result = true
        }
        i++
    }


    return result
}
//ÖDEV - 5 SON

//ÖDEV - 2
//ÖDEV - 2 SON
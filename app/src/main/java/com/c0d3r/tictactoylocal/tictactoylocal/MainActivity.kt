package com.c0d3r.tictactoylocal.tictactoylocal

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view: View){
        val btnSelected = view as Button
        var cellID = 0
        when(btnSelected.id){
            R.id.btn1 -> cellID=1
            R.id.btn2 -> cellID=2
            R.id.btn3 -> cellID=3
            R.id.btn4 -> cellID=4
            R.id.btn5 -> cellID=5
            R.id.btn6 -> cellID=6
            R.id.btn7 -> cellID=7
            R.id.btn8 -> cellID=8
            R.id.btn9 -> cellID=9

        }
        //Toast.makeText(this,"ID "+cellID, Toast.LENGTH_LONG).show()
        PlayGame(cellID,btnSelected)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1
    fun PlayGame(cellID:Int, btnSelected:Button){
        if (activePlayer == 1){
            btnSelected.setBackgroundColor(Color.GREEN)
            player1.add(cellID)
            activePlayer = 2
        }else{
            btnSelected.setBackgroundColor(Color.BLUE)
            player2.add(cellID)
            activePlayer = 1
        }
        btnSelected.isEnabled = false
        checkWinner()
    }

    fun checkWinner(){
        var winner = -1

        //row1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner =  1
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner =  2
        }

        //row2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner =  1
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner =  2
        }

        //row1
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner =  1
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner =  2
        }

        //col1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner =  1
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner =  2
        }

        //col2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner =  1
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner =  2
        }

        //col3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner =  1
        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner =  2
        }


        if(winner != -1){
            if(winner ==1){
                Toast.makeText(this,"Thw winner is player 1", Toast.LENGTH_LONG).show()
           }
            else if(winner == 2){
                Toast.makeText(this,"Thw winner is player 2", Toast.LENGTH_LONG).show()
            }
        }
    }
}

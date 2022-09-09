package com.example.gatoplusdaniel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,cont,conta=0;
    String letra;
    EditText Ganador;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button10, button11, button12, button13, button14, button15, button16, button17, button18,
            button19, button20, button21, button22, button23, button24, button25, button26, button27,
            button28, button29, button30, button31, button32, button33, button34, button35, button36,
            buttonre, buttonsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        Ganador = (EditText) findViewById(R.id.Ganador);

        button1 = (Button) findViewById(R.id.buttonid1);
        button2 = (Button) findViewById(R.id.buttonid2);
        button3 = (Button) findViewById(R.id.buttonid3);
        button4 = (Button) findViewById(R.id.buttonid4);
        button5 = (Button) findViewById(R.id.buttonid5);
        button6 = (Button) findViewById(R.id.buttonid6);
        button7 = (Button) findViewById(R.id.buttonid7);
        button8 = (Button) findViewById(R.id.buttonid8);
        button9 = (Button) findViewById(R.id.buttonid9);
        button10 = (Button) findViewById(R.id.buttonid10);
        button11 = (Button) findViewById(R.id.buttonid11);
        button12 = (Button) findViewById(R.id.buttonid12);
        button13 = (Button) findViewById(R.id.buttonid13);
        button14 = (Button) findViewById(R.id.buttonid14);
        button15 = (Button) findViewById(R.id.buttonid15);
        button16 = (Button) findViewById(R.id.buttonid16);
        button17 = (Button) findViewById(R.id.buttonid17);
        button18 = (Button) findViewById(R.id.buttonid18);
        button19 = (Button) findViewById(R.id.buttonid19);
        button20 = (Button) findViewById(R.id.buttonid20);
        button21 = (Button) findViewById(R.id.buttonid21);
        button22 = (Button) findViewById(R.id.buttonid22);
        button23 = (Button) findViewById(R.id.buttonid23);
        button24 = (Button) findViewById(R.id.buttonid24);
        button25 = (Button) findViewById(R.id.buttonid25);
        button26 = (Button) findViewById(R.id.buttonid26);
        button27 = (Button) findViewById(R.id.buttonid27);
        button28 = (Button) findViewById(R.id.buttonid28);
        button29 = (Button) findViewById(R.id.buttonid29);
        button30 = (Button) findViewById(R.id.buttonid30);
        button31 = (Button) findViewById(R.id.buttonid31);
        button32 = (Button) findViewById(R.id.buttonid32);
        button33 = (Button) findViewById(R.id.buttonid33);
        button34 = (Button) findViewById(R.id.buttonid34);
        button35 = (Button) findViewById(R.id.buttonid35);
        button36 = (Button) findViewById(R.id.buttonid36);
        buttonre = (Button) findViewById(R.id.buttonidre);
        buttonsal = (Button) findViewById(R.id.buttonidsalir);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        buttonre.setOnClickListener(this);
        buttonsal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cont++;
        turno = cont % 2;

        if(turno == 1)
        {
            printt('x', v);
        }
        else
        {
            printt('o', v);
        }
    }

    public void printt (char letra, View v){

        if(v.getId() == R.id.buttonidre){

            Ganador.setEnabled(true);
            Ganador.setText("");

            button1.setEnabled(true);
            button1.setText("");

            button2.setEnabled(true);
            button2.setText("");

            button3.setEnabled(true);
            button3.setText("");

            button4.setEnabled(true);
            button4.setText("");

            button5.setEnabled(true);
            button5.setText("");

            button6.setEnabled(true);
            button6.setText("");

            button7.setEnabled(true);
            button7.setText("");

            button8.setEnabled(true);
            button8.setText("");

            button9.setEnabled(true);
            button9.setText("");

            button10.setEnabled(true);
            button10.setText("");

            button11.setEnabled(true);
            button11.setText("");

            button12.setEnabled(true);
            button12.setText("");

            button13.setEnabled(true);
            button13.setText("");

            button14.setEnabled(true);
            button14.setText("");

            button15.setEnabled(true);
            button15.setText("");

            button16.setEnabled(true);
            button16.setText("");

            button17.setEnabled(true);
            button17.setText("");

            button18.setEnabled(true);
            button18.setText("");

            button19.setEnabled(true);
            button19.setText("");

            button20.setEnabled(true);
            button20.setText("");

            button21.setEnabled(true);
            button21.setText("");

            button22.setEnabled(true);
            button22.setText("");

            button23.setEnabled(true);
            button23.setText("");

            button24.setEnabled(true);
            button24.setText("");

            button25.setEnabled(true);
            button25.setText("");

            button26.setEnabled(true);
            button26.setText("");

            button27.setEnabled(true);
            button27.setText("");

            button28.setEnabled(true);
            button28.setText("");

            button29.setEnabled(true);
            button29.setText("");

            button30.setEnabled(true);
            button30.setText("");

            button31.setEnabled(true);
            button31.setText("");

            button32.setEnabled(true);
            button32.setText("");

            button33.setEnabled(true);
            button33.setText("");

            button34.setEnabled(true);
            button34.setText("");

            button35.setEnabled(true);
            button35.setText("");

            button36.setEnabled(true);
            button36.setText("");
        }

        if(v.getId() == R.id.buttonidsalir){
            System.exit(0);
        }

        if(v.getId() == R.id.buttonid1){
            button1.setText(letra+"");
            button1.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid2){
            button2.setText(letra+"");
            button2.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid3){
            button3.setText(letra+"");
            button3.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid4){
            button4.setText(letra+"");
            button4.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid5){
            button5.setText(letra+"");
            button5.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid6){
            button6.setText(letra+"");
            button6.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid7){
            button7.setText(letra+"");
            button7.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid8){
            button8.setText(letra+"");
            button8.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid9){
            button9.setText(letra+"");
            button9.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid10) {
            button10.setText(letra + "");
            button10.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid11) {
            button11.setText(letra + "");
            button11.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid12) {
            button12.setText(letra + "");
            button12.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid13) {
            button13.setText(letra + "");
            button13.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid14) {
            button14.setText(letra + "");
            button14.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid15) {
            button15.setText(letra + "");
            button15.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid16) {
            button16.setText(letra + "");
            button16.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid17) {
            button17.setText(letra + "");
            button17.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid18) {
            button18.setText(letra + "");
            button18.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid19) {
            button19.setText(letra + "");
            button19.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid20) {
            button20.setText(letra + "");
            button20.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid21) {
            button21.setText(letra + "");
            button21.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid22) {
            button22.setText(letra + "");
            button22.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid23) {
            button23.setText(letra + "");
            button23.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid24) {
            button24.setText(letra + "");
            button24.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid25) {
            button25.setText(letra + "");
            button25.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid26) {
            button26.setText(letra + "");
            button26.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid27) {
            button27.setText(letra + "");
            button27.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid28) {
            button28.setText(letra + "");
            button28.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid29) {
            button29.setText(letra + "");
            button29.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid30) {
            button30.setText(letra + "");
            button30.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid31) {
            button31.setText(letra + "");
            button31.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid32) {
            button32.setText(letra + "");
            button32.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid33) {
            button33.setText(letra + "");
            button33.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid34) {
            button34.setText(letra + "");
            button34.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid35) {
            button35.setText(letra + "");
            button35.setEnabled(false);
        }else
        if(v.getId() == R.id.buttonid36) {
            button36.setText(letra + "");
            button36.setEnabled(false);
        }

        Ganadoor(letra);
    }

    public void Ganadoor(char letra){

        //Horizontales
        if(button1.getText().toString().equals(letra+"") && (button2.getText().toString().equals(letra+"")) && (button3.getText().toString().equals(letra+"")) && (button4.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button2.getText().toString().equals(letra+"") && (button3.getText().toString().equals(letra+"")) && (button4.getText().toString().equals(letra+"")) && (button5.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button3.getText().toString().equals(letra+"") && (button4.getText().toString().equals(letra+"")) && (button5.getText().toString().equals(letra+"")) && (button6.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button7.getText().toString().equals(letra+"") && (button8.getText().toString().equals(letra+"")) && (button9.getText().toString().equals(letra+"")) && (button10.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button8.getText().toString().equals(letra+"") && (button9.getText().toString().equals(letra+"")) && (button10.getText().toString().equals(letra+"")) && (button11.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button9.getText().toString().equals(letra+"") && (button10.getText().toString().equals(letra+"")) && (button11.getText().toString().equals(letra+"")) && (button12.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button13.getText().toString().equals(letra+"") && (button14.getText().toString().equals(letra+"")) && (button15.getText().toString().equals(letra+"")) && (button16.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button14.getText().toString().equals(letra+"") && (button15.getText().toString().equals(letra+"")) && (button16.getText().toString().equals(letra+"")) && (button17.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button15.getText().toString().equals(letra+"") && (button16.getText().toString().equals(letra+"")) && (button17.getText().toString().equals(letra+"")) && (button18.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button19.getText().toString().equals(letra+"") && (button20.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button20.getText().toString().equals(letra+"") && (button21.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button21.getText().toString().equals(letra+"") && (button22.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+"")) && (button24.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button25.getText().toString().equals(letra+"") && (button26.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button26.getText().toString().equals(letra+"") && (button27.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button27.getText().toString().equals(letra+"") && (button28.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+"")) && (button30.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button31.getText().toString().equals(letra+"") && (button32.getText().toString().equals(letra+"")) && (button33.getText().toString().equals(letra+"")) && (button34.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button32.getText().toString().equals(letra+"") && (button33.getText().toString().equals(letra+"")) && (button34.getText().toString().equals(letra+"")) && (button35.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button36.setEnabled(false);

        }else if(button33.getText().toString().equals(letra+"") && (button34.getText().toString().equals(letra+"")) && (button35.getText().toString().equals(letra+"")) && (button36.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);

            //Verticales
        }else if(button1.getText().toString().equals(letra+"") && (button7.getText().toString().equals(letra+"")) && (button13.getText().toString().equals(letra+"")) && (button19.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button7.getText().toString().equals(letra+"") && (button13.getText().toString().equals(letra+"")) && (button19.getText().toString().equals(letra+"")) && (button25.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button13.getText().toString().equals(letra+"") && (button19.getText().toString().equals(letra+"")) && (button25.getText().toString().equals(letra+"")) && (button31.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button2.getText().toString().equals(letra+"") && (button8.getText().toString().equals(letra+"")) && (button14.getText().toString().equals(letra+"")) && (button20.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button8.getText().toString().equals(letra+"") && (button14.getText().toString().equals(letra+"")) && (button20.getText().toString().equals(letra+"")) && (button26.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button14.getText().toString().equals(letra+"") && (button20.getText().toString().equals(letra+"")) && (button26.getText().toString().equals(letra+"")) && (button32.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button3.getText().toString().equals(letra+"") && (button9.getText().toString().equals(letra+"")) && (button15.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button9.getText().toString().equals(letra+"") && (button15.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button15.getText().toString().equals(letra+"") && (button21.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+"")) && (button33.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button4.getText().toString().equals(letra+"") && (button10.getText().toString().equals(letra+"")) && (button16.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button10.getText().toString().equals(letra+"") && (button16.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button16.getText().toString().equals(letra+"") && (button22.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+"")) && (button34.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button5.getText().toString().equals(letra+"") && (button11.getText().toString().equals(letra+"")) && (button17.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button11.getText().toString().equals(letra+"") && (button17.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button17.getText().toString().equals(letra+"") && (button23.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+"")) && (button35.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button36.setEnabled(false);

        }else if(button6.getText().toString().equals(letra+"") && (button12.getText().toString().equals(letra+"")) && (button18.getText().toString().equals(letra+"")) && (button24.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button12.getText().toString().equals(letra+"") && (button18.getText().toString().equals(letra+"")) && (button24.getText().toString().equals(letra+"")) && (button30.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button18.getText().toString().equals(letra+"") && (button24.getText().toString().equals(letra+"")) && (button30.getText().toString().equals(letra+"")) && (button36.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);

        //Diagonales

        }else if(button4.getText().toString().equals(letra+"") && (button9.getText().toString().equals(letra+"")) && (button14.getText().toString().equals(letra+"")) && (button19.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button5.getText().toString().equals(letra+"") && (button10.getText().toString().equals(letra+"")) && (button15.getText().toString().equals(letra+"")) && (button20.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button10.getText().toString().equals(letra+"") && (button15.getText().toString().equals(letra+"")) && (button20.getText().toString().equals(letra+"")) && (button25.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button6.getText().toString().equals(letra+"") && (button11.getText().toString().equals(letra+"")) && (button16.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button11.getText().toString().equals(letra+"") && (button16.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+"")) && (button26.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button16.getText().toString().equals(letra+"") && (button21.getText().toString().equals(letra+"")) && (button26.getText().toString().equals(letra+"")) && (button31.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button12.getText().toString().equals(letra+"") && (button17.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button17.getText().toString().equals(letra+"") && (button22.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+"")) && (button32.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button18.getText().toString().equals(letra+"") && (button23.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+"")) && (button33.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button3.getText().toString().equals(letra+"") && (button10.getText().toString().equals(letra+"")) && (button17.getText().toString().equals(letra+"")) && (button24.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button2.getText().toString().equals(letra+"") && (button9.getText().toString().equals(letra+"")) && (button16.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button9.getText().toString().equals(letra+"") && (button16.getText().toString().equals(letra+"")) && (button23.getText().toString().equals(letra+"")) && (button30.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button1.getText().toString().equals(letra+"") && (button8.getText().toString().equals(letra+"")) && (button15.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button8.getText().toString().equals(letra+"") && (button15.getText().toString().equals(letra+"")) && (button22.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button15.getText().toString().equals(letra+"") && (button22.getText().toString().equals(letra+"")) && (button29.getText().toString().equals(letra+"")) && (button36.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button28.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);

        }else if(button7.getText().toString().equals(letra+"") && (button14.getText().toString().equals(letra+"")) && (button21.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(button14.getText().toString().equals(letra+"") && (button21.getText().toString().equals(letra+"")) && (button28.getText().toString().equals(letra+"")) && (button35.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button27.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button34.setEnabled(false);
            button36.setEnabled(false);

        }else if(button13.getText().toString().equals(letra+"") && (button20.getText().toString().equals(letra+"")) && (button27.getText().toString().equals(letra+"")) && (button34.getText().toString().equals(letra+""))) {
            Ganador.setText("El ganador es " + letra);
            Ganador.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
            button26.setEnabled(false);
            button28.setEnabled(false);
            button29.setEnabled(false);
            button30.setEnabled(false);
            button31.setEnabled(false);
            button32.setEnabled(false);
            button33.setEnabled(false);
            button35.setEnabled(false);
            button36.setEnabled(false);

        }else if(conta<36){
            conta++;
        }else {
            Ganador.setText("Empate");
        }
    }
}

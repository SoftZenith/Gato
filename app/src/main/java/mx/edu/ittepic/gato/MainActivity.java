package mx.edu.ittepic.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReiniciar;
    boolean turno = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnReiniciar = (Button) findViewById(R.id.button10);
    }

    public void reiniciar(View view){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        turno = true;
    }

    public void uno (View view){
        if(turno){
            btn1.setText("X");
        }else{
            btn1.setText("O");
        }
        turno = !turno;
        btn1.setEnabled(false);
        ganador();
    }

    public void dos (View view){
        if(turno){
            btn2.setText("X");
        }else{
            btn2.setText("O");
        }
        turno = !turno;
        btn2.setEnabled(false);
        ganador();
    }

    public void tres (View view){
        if(turno){
            btn3.setText("X");
        }else{
            btn3.setText("O");
        }
        turno = !turno;
        btn3.setEnabled(false);
        ganador();
    }

    public void cuatro (View view){
        if(turno){
            btn4.setText("X");
        }else{
            btn4.setText("O");
        }
        turno = !turno;
        btn4.setEnabled(false);
        ganador();
    }

    public void cinco (View view){
        if(turno){
            btn5.setText("X");
        }else{
            btn5.setText("O");
        }
        turno = !turno;
        btn5.setEnabled(false);
        ganador();
    }

    public void seis (View view){
        if(turno){
            btn6.setText("X");
        }else{
            btn6.setText("O");
        }
        turno = !turno;
        btn6.setEnabled(false);
        ganador();
    }

    public void siete (View view){
        if(turno){
            btn7.setText("X");
        }else{
            btn7.setText("O");
        }
        turno = !turno;
        btn7.setEnabled(false);
        ganador();
    }

    public void ocho (View view){
        if(turno){
            btn8.setText("X");
        }else{
            btn8.setText("O");
        }
        turno = !turno;
        btn8.setEnabled(false);
        ganador();
    }

    public void nueve (View view){
        if(turno){
            btn9.setText("X");
        }else{
            btn9.setText("O");
        }
        turno = !turno;
        btn9.setEnabled(false);
        ganador();
    }

    public void ganador(){
        //Ganador X
        if(btn2.getText().toString().equals("X") &&
                btn3.getText().toString().equals("X") &&
                btn4.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn5.getText().toString().equals("X") &&
                btn6.getText().toString().equals("X") &&
                btn7.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn1.getText().toString().equals("X") &&
                btn9.getText().toString().equals("X") &&
                btn8.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn4.getText().toString().equals("X") &&
                btn5.getText().toString().equals("X") &&
                btn1.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn2.getText().toString().equals("X") &&
                btn6.getText().toString().equals("X") &&
                btn9.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn7.getText().toString().equals("X") &&
                btn3.getText().toString().equals("X") &&
                btn8.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn6.getText().toString().equals("X") &&
                btn8.getText().toString().equals("X") &&
                btn4.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn1.getText().toString().equals("X") &&
                btn3.getText().toString().equals("X") &&
                btn6.getText().toString().equals("X")){
            Toast.makeText(this,"Ganador: X", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }
        // Ganador O

        if(btn2.getText().toString().equals("O") &&
                btn3.getText().toString().equals("O") &&
                btn4.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn5.getText().toString().equals("O") &&
                btn6.getText().toString().equals("O") &&
                btn7.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn1.getText().toString().equals("O") &&
                btn9.getText().toString().equals("O") &&
                btn8.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn4.getText().toString().equals("O") &&
                btn5.getText().toString().equals("O") &&
                btn1.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn2.getText().toString().equals("O") &&
                btn6.getText().toString().equals("O") &&
                btn9.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn7.getText().toString().equals("O") &&
                btn3.getText().toString().equals("O") &&
                btn8.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn6.getText().toString().equals("O") &&
                btn8.getText().toString().equals("O") &&
                btn4.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }if(btn1.getText().toString().equals("O") &&
                btn3.getText().toString().equals("O") &&
                btn6.getText().toString().equals("O")){
            Toast.makeText(this,"Ganador: O", Toast.LENGTH_LONG).show();
            reiniciar(btnReiniciar);
        }
    }

}
package com.example.tarea_3;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tarea_3.Imagenes;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Imagenes imagenes;
    Random rand = new Random();
    int[] vector = new int[6];
    String resul;

    int numeroAleatorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vector[0]=0;

    }

    public int[] converVector(String x1){
        String[] partes = x1.split(",");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }
        Arrays.sort(numeros);
        return numeros;
    }

    public int iguales(String x1){
        int resul=1;
        int[] numeros=converVector(x1);
        for (int i=1; i<numeros.length;i++) {
            if(numeros[i]==numeros[i-1]){
                resul=resul+1;
            }
        }
        return resul;
    }
    public void Boton(View v){
        resul="";
        imagenes = new Imagenes(this);
        TextView texto= (TextView) findViewById(R.id.textView2);
        texto.setText("");
        for(int i=1;i<=5;i++){
            numeroAleatorio=rand.nextInt(6) ;
            vector[i]=numeroAleatorio;
            numeroAleatorio=numeroAleatorio+1;
            resul=resul+numeroAleatorio+",";
        }
        int[] escalera= {1,2,3,4,5};
        int[] escalera2={2,3,4,5,6};
        int[] escalera3={1,3,4,5,6};
        if(iguales(resul)<=1){
            if(Arrays.equals(converVector(resul),escalera)| Arrays.equals(converVector(resul),escalera2) | Arrays.equals(converVector(resul),escalera3)){
                texto.setText("ESCALERA");
            }
        }
        else{
            switch (iguales(resul)){
                case(2):
                    texto.setText("FULL");
                    break;
                case(3):
                    texto.setText("FULL");
                    break;
                case(4):
                    texto.setText("POKER");
                    break;
                case(5):
                    texto.setText("GRANDE");
                    break;
            }
        }






        Drawable myImage = imagenes.getImagen(vector[1]);
        ImageView imageView = findViewById(R.id.imageView5);
        imageView.setImageDrawable(myImage);
        myImage = imagenes.getImagen(vector[2]);
        ImageView imageView1 = findViewById(R.id.imageView6);
        imageView1.setImageDrawable(myImage);
        myImage = imagenes.getImagen(vector[3]);
        ImageView imageView2 = findViewById(R.id.imageView7);
        imageView2.setImageDrawable(myImage);
        myImage = imagenes.getImagen(vector[4]);
        ImageView imageView3 = findViewById(R.id.imageView8);
        imageView3.setImageDrawable(myImage);
        myImage = imagenes.getImagen(vector[5]);
        ImageView imageView4 = findViewById(R.id.imageView9);
        imageView4.setImageDrawable(myImage);

    }
}
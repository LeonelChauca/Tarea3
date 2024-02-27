package com.example.tarea_3;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public class Imagenes {

    private static ArrayList<Drawable> imageList;


    @SuppressLint("UseCompatLoadingForDrawables")
    public Imagenes(Context context) {
        imageList = new ArrayList<>();
        imageList.add(context.getResources().getDrawable(R.drawable.dado1));
        imageList.add(context.getResources().getDrawable(R.drawable.dado2));
        imageList.add(context.getResources().getDrawable(R.drawable.dado3));
        imageList.add(context.getResources().getDrawable(R.drawable.dado4));
        imageList.add(context.getResources().getDrawable(R.drawable.dados5));
        imageList.add(context.getResources().getDrawable(R.drawable.dado6));
    }

    public static Drawable getImagen(int index){
        return imageList.get(index);
    }
}

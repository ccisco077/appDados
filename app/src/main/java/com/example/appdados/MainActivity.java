package com.example.appdados;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.color.MaterialColors;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int[] colorsRandom = {
            R.color.md_theme_dark_onPrimary,
            R.color.md_theme_light_tertiary,
            R.color.md_theme_light_onTertiary,
            R.color.md_theme_dark_primary,
            R.color.md_theme_dark_onSecondary,
            R.color.md_theme_dark_shadow,
            R.color.md_theme_dark_background,
            R.color.md_theme_dark_outlineVariant,
            R.color.md_theme_dark_outline,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLanzar = findViewById(R.id.btnLanzar);
        btnLanzar.setOnClickListener(view -> {
            btnLanzar(view);
        });

        Button btnTesting = findViewById(R.id.btnTesting);
        btnTesting.setOnClickListener(view -> {
            int colorSelect = colorsRandom[ new Random().nextInt(colorsRandom.length) ];
            View fondo = findViewById(R.id.fondo);
            fondo.setBackgroundColor(colorSelect);
        });
    }

    public void btnLanzar(View view) {
        ImageView imageDado = findViewById(R.id.resultImg);
        TextView textResult = findViewById(R.id.textResult);

        int result = new Random().nextInt(5)+1;
        switch (result) {
            case 1: imageDado.setImageResource(R.drawable.result_1); break;
            case 2: imageDado.setImageResource(R.drawable.result_2); break;
            case 3: imageDado.setImageResource(R.drawable.result_3); break;
            case 4: imageDado.setImageResource(R.drawable.result_4); break;
            case 5: imageDado.setImageResource(R.drawable.result_5); break;
            case 6: imageDado.setImageResource(R.drawable.result_6); break;
        }

        textResult.setText("Resultado es: "+ result);
    }
}
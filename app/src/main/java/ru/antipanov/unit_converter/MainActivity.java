package ru.antipanov.unit_converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Создаем обработчик для кнопки. При нажатии кнопки "Area", которая находится в MainActivity,
    происходит переход на Area_Activity. У кнопки "Area" во вкладке onClick присваиваем значение
    onClick_Area, далее создаем активности и обработчики по аналогии.
    1. Создаем Activity
    2. Создаем обработчик в MainActivity
    3. Привязываем метод onClick к соответсвующей кнопке */
    public void onClick_Area(View view){
        Intent intent = new Intent(MainActivity.this, Area.class);
        startActivity(intent);
    }

    public void onClick_Mass(View view){
        Intent intent = new Intent(MainActivity.this, Mass.class);
        startActivity(intent);
    }

    public void onClick_Speed(View view){
        Intent intent = new Intent(MainActivity.this, Speed.class);
        startActivity(intent);
    }

    public void onClick_Time(View view){
        Intent intent = new Intent(MainActivity.this, Time.class);
        startActivity(intent);
    }

    public void onClick_Temperature(View view) {
        Intent intent = new Intent(MainActivity.this, Temperature.class);
        startActivity(intent);
    }

    public void onClick_Lenght(View view) {
        Intent intent = new Intent(MainActivity.this, Lenght.class);
        startActivity(intent);
    }

    public void onClick_Volume(View view) {
        Intent intent = new Intent(MainActivity.this, Volume.class);
        startActivity(intent);
    }

    public void onClick_Pressure(View view) {
        Intent intent = new Intent(MainActivity.this, Pressure.class);
        startActivity(intent);
    }

    public void onClick_Power(View view) {
        Intent intent = new Intent(MainActivity.this, Power.class);
        startActivity(intent);
    }

    public void onClick_Torque(View view) {
        Intent intent = new Intent(MainActivity.this, Torque.class);
        startActivity(intent);
    }

    public void onClick_Fuel(View view) {
        Intent intent = new Intent(MainActivity.this, Fuel.class);
        startActivity(intent);
    }

    public void onClick_Energy(View view) {
        Intent intent = new Intent(MainActivity.this, Energy.class);
        startActivity(intent);
    }

    public void onClick_Digital(View view) {
        Intent intent = new Intent(MainActivity.this, Digital.class);
        startActivity(intent);
    }

    public void onClick_Cooking(View view) {
        Intent intent = new Intent(MainActivity.this, Cooking.class);
        startActivity(intent);
    }
}

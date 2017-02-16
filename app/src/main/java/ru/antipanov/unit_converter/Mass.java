package ru.antipanov.unit_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
    }

    public double massConvert(double originalNum, String originalUnit, String desiredUnit)
    { //Begin massConvert
        //Make two variable doubles, one the original double and one the new one
        double num1 = originalNum;
        double num2 = 0.0d;


        //Store the units into new strings. I find this to be safer, as I can't override the originals this way.
        //Also convert them to lower case
        String original = originalUnit.toLowerCase();
        String newU = desiredUnit.toLowerCase();

        switch(original)
        { //Begin conversion table
            case "pounds":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.4536d;
                        break;
                    case "grams":
                        num2 = originalNum * 453.592d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 453592.37d;
                        break;
                    case "ounce":
                        num2 = originalNum * 16d;
                        break;
                    case "grain":
                        num2 = originalNum * 7000d;
                        break;
                    case "stone":
                        num2 = originalNum * 0.0714d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0005d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0005d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0004d;
                        break;
                }
                break;
            case "kilograms":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 2.20462d;
                        break;
                    case "kilograms":
                        num2 = originalNum;
                        break;
                    case "grams":
                        num2 = originalNum * 1000d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 1000000d;
                        break;
                    case "ounce":
                        num2 = originalNum * 35.274d;
                        break;
                    case "grain":
                        num2 = originalNum * 15432.3584d;
                        break;
                    case "stone":
                        num2 = originalNum * 0.1575d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.001d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0011d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.001d;
                        break;
                }
                break;
            case "grams":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 0.0022d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.001d;
                        break;
                    case "grams":
                        num2 = originalNum;
                        break;
                    case "milligrams":
                        num2 = originalNum * 1000d;
                        break;
                    case "ounce":
                        num2 = originalNum * 0.0353d;
                        break;
                    case "grain":
                        num2 = originalNum * 15.4324d;
                        break;
                    case "stone":
                        num2 = originalNum * 0.0002d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0d;
                        break;
                }
                break;
            case "milligrams":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 0.0d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.0d;
                        break;
                    case "grams":
                        num2 = originalNum * 0.001d;
                        break;
                    case "milligrams":
                        num2 = originalNum;
                        break;
                    case "ounce":
                        num2 = originalNum * 0.0d;
                        break;
                    case "grain":
                        num2 = originalNum * 0.0154d;
                        break;
                    case "stone":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0d;
                        break;
                }
                break;
            case "ounce":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 0.0625d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.0283d;
                        break;
                    case "grams":
                        num2 = originalNum * 28.3495d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 28349.5231d;
                        break;
                    case "ounce":
                        num2 = originalNum;
                        break;
                    case "grain":
                        num2 = originalNum * 437.5d;
                        break;
                    case "stone":
                        num2 = originalNum * 0.0045d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0d;
                        break;
                }
                break;
            case "grain":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 0.0001d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.0001d;
                        break;
                    case "grams":
                        num2 = originalNum * 0.0648d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 64.7989;
                        break;
                    case "ounce":
                        num2 = originalNum * 0.0023;
                        break;
                    case "grain":
                        num2 = originalNum;
                        break;
                    case "stone":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.0d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0d;
                        break;
                }
                break;
            case "stone":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 14d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 6.3503d;
                        break;
                    case "grams":
                        num2 = originalNum * 6350.2932d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 6350239.18d;
                        break;
                    case "ounce":
                        num2 = originalNum * 224d;
                        break;
                    case "grain":
                        num2 = originalNum * 98000d;
                        break;
                    case "stone":
                        num2 = originalNum;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.0064d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 0.007d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.0062d;
                        break;
                }
                break;
            case "ton (metric)":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 2204.6226d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 1000d;
                        break;
                    case "grams":
                        num2 = originalNum * 1000000d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 1000000000d;
                        break;
                    case "ounce":
                        num2 = originalNum * 35273.9619d;
                        break;
                    case "grain":
                        num2 = originalNum * 15432358.3529d;
                        break;
                    case "stone":
                        num2 = originalNum * 157.473d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 1.1023d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.9842d;
                        break;
                }
                break;
            case "ton (us)":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 2000d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 907.1847d;
                        break;
                    case "grams":
                        num2 = originalNum * 907184.74d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 907184740d;
                        break;
                    case "ounce":
                        num2 = originalNum * 32000d;
                        break;
                    case "grain":
                        num2 = originalNum * 14000000d;
                        break;
                    case "stone":
                        num2 = originalNum * 142.8571d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 0.9072d;
                        break;
                    case "ton (us)":
                        num2 = originalNum;
                        break;
                    case "ton (uk)":
                        num2 = originalNum * 0.8929d;
                        break;

                }
                break;
            case "ton (uk)":
                switch(newU)
                {
                    case "pounds":
                        num2 = originalNum * 2240d;
                        break;
                    case "kilograms":
                        num2 = originalNum * 1016.0469d;
                        break;
                    case "grams":
                        num2 = originalNum * 1016046.9088d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 1016046908.8d;
                        break;
                    case "ounce":
                        num2 = originalNum * 35840d;
                        break;
                    case "grain":
                        num2 = originalNum * 15680000d;
                        break;
                    case "stone":
                        num2 = originalNum * 160d;
                        break;
                    case "ton (metric)":
                        num2 = originalNum * 1.016d;
                        break;
                    case "ton (us)":
                        num2 = originalNum * 1.12d;
                        break;
                    case "ton (uk)":
                        num2 = originalNum;
                        break;
                }
                break;
        } //End conversion table

        //Return the final number
        return num2;
    } //End massConvert
}

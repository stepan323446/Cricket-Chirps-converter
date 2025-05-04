package com.example.domaci_rad_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.domaci_rad_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void Calculate(View view) {
        try {
            int countChirps = Integer.parseInt(binding.numberOfChipsText.getText().toString());
            int fahrenheit = countChirps + 40;

            float celsius = countChirps / 3.0f + 4.0f;
            double celsiusRounded = Math.round(celsius * 10.0) / 10.0;

            String result = fahrenheit + "°F. " + celsiusRounded + "°C";

            binding.resultText.setText(result);
        }
        catch(NumberFormatException error) {
            Toast.makeText(this, "Your number is invalid", Toast.LENGTH_LONG).show();
        }
    }
}
package android.example.yaya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quit(View button) {
        moveTaskToBack(true);
    }

    public void setMeal(View button) {
        int buttonId = button.getId();
        ImageView meal = (ImageView)findViewById(R.id.display_image);

        if(buttonId == R.id.chicken_button ){
            meal.setImageResource(R.drawable.chicken);

        }else if(buttonId == R.id.beef_button){
            meal.setImageResource(R.drawable.beef);

        }else if(buttonId == R.id.fish_button){
            meal.setImageResource(R.drawable.fish);

        }
    }
}
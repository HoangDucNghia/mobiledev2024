package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Fragment;
import android.view.LayoutInflater;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        WeatherFragment firstFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main,firstFragment).commit();
        /*EdgeToEdge.enable(this);
         setContentView(R.layout.activity_weather);
         View main = findViewById(R.id.main);
         main.setBackgroundColor(0xFFFF0000);
         ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
         Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
         v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
         return insets;
         });**/
    }
    public WeatherActivity(){
        super();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("OnStart","start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("OnResume", "resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("OnPause", "pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("OnStop", "stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("OnDestroy", "destroy");
    }

}
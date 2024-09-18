package vn.edu.usth.irc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.widget.Toolbar;

public class IRC extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_irc);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });**/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.search_bar){
            Intent intent = new Intent(this,SearchActivity.class);
            startActivity(intent);
        }
        if(id==R.id.logout_button){
            Toast.makeText(this,"Log out",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.add_server){
            Toast.makeText(this,"Create a new server",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.change_settings){
            Toast.makeText(this,"Change setting",Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    public IRC(){
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
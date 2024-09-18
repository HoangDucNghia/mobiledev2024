package vn.edu.usth.irc;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.view.View;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ServerActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private PagerAdapter pageradapter;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });**/


        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.server1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public ServerActivity(){
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
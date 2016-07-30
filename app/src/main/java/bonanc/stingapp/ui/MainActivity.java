package bonanc.stingapp.ui;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.widget.Button;

import bonanc.stingapp.R;

public class MainActivity extends FragmentActivity {
    private Button mainButton;
    private Button videoButton;
    private Button audioButton;
    private Button wallpaperButton;
    private Button mailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainButton = (Button) findViewById(R.id.main_menu);
        mainButton.setOnClickListener(mainButtonClicked);
        videoButton = (Button) findViewById(R.id.video);
        videoButton.setOnClickListener(videoButtonClicked);
        audioButton = (Button) findViewById(R.id.audio);
        audioButton.setOnClickListener(audioButtonClicked);
        wallpaperButton = (Button) findViewById(R.id.wallpaper);
        wallpaperButton.setOnClickListener(wallpaperButtonClicked);
        mailButton = (Button) findViewById(R.id.mail);
        mailButton.setOnClickListener(mailButtonClicked);
        MainFragment newFragment = new MainFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    OnClickListener mainButtonClicked = new OnClickListener(){
        @Override
        public void onClick(View v){
            MainFragment newFragment = new MainFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    };
    OnClickListener videoButtonClicked = new OnClickListener(){
        @Override
        public void onClick(View v){
            VideoFragment newFragment = new VideoFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    };
    OnClickListener audioButtonClicked = new OnClickListener(){
        @Override
        public void onClick(View v){
            AudioFragment newFragment = new AudioFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    };
    OnClickListener wallpaperButtonClicked = new OnClickListener(){
        @Override
        public void onClick(View v){
            WallpaperFragment newFragment = new WallpaperFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    };
    OnClickListener mailButtonClicked = new OnClickListener(){
        @Override
        public void onClick(View v){
            MailFragment newFragment = new MailFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

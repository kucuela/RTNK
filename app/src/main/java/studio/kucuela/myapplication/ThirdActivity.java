package studio.kucuela.myapplication;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;


public class ThirdActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //uvodne animacije texta

        final TextView txt222 = (TextView) findViewById(R.id.textView);
        txt222.setText("  PRDAVAC \n  najmanja veličina dopuša");
        txt222.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

        final TextView txt221 = (TextView) findViewById(R.id.textView2);
        txt221.setText("  STANDARDNI \n  standardna veličina dopuša");
        txt221.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

        final TextView txt322 = (TextView) findViewById(R.id.textView17);
        txt322.setText("  DOMAĆINSKI \n  xxl veličina dopuša");
        txt322.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));



        Toast.makeText(getBaseContext(), "Dobrodošli na Dopuš sekciju.", Toast.LENGTH_SHORT).show();


        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content1a);
        FloatingActionButton imageView = (FloatingActionButton) findViewById(R.id.btn_buyaa);
        rippleBackground.startRippleAnimation();


        final RippleBackground rippleBackground1 = (RippleBackground) findViewById(R.id.content1aa);
        FloatingActionButton imageView1 = (FloatingActionButton) findViewById(R.id.btn_buyaaa);
        rippleBackground1.startRippleAnimation();

        final RippleBackground rippleBackground12 = (RippleBackground) findViewById(R.id.content1aaa);
        FloatingActionButton imageView12 = (FloatingActionButton) findViewById(R.id.btn_buyaaaa);
        rippleBackground12.startRippleAnimation();

        FloatingActionButton btn_buyaa = (FloatingActionButton) this.findViewById(R.id.btn_buyaa);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.prdavac);
        final TextView txt = (TextView) findViewById(R.id.textView);

        btn_buyaa.setOnClickListener(new View.OnClickListener(){

                                   public void onClick(View v) {
                                       mp.start();
                                       txt.setText("Smotaj nam jedan bedni prdavac \nod toga što je ostalo!");
                                       txt.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));


                                   }










        });




        FloatingActionButton btn_buyaaa = (FloatingActionButton) this.findViewById(R.id.btn_buyaaa);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.standard);
        final TextView txt2 = (TextView) findViewById(R.id.textView2);
        btn_buyaaa.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp1.start();
                txt2.setText("Dopuš, molim dozvolu za dopuš!\nDopuš, molim dozvolu za dopuš!");
                txt2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

            }


        });

        FloatingActionButton btn_buyaaaa = (FloatingActionButton) this.findViewById(R.id.btn_buyaaaa);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.domacinski);
        final TextView txt17 = (TextView) findViewById(R.id.textView17);
        btn_buyaaaa.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp2.start();
                txt17.setText("Smotaj nam jedan onako domaćinski!");
                txt17.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

            }


        });









        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );
            getSupportActionBar().setTitle("Dopuš sekcija");
            actionBar.show();
        }




    }
    // Method(s) that manage Toolbar.

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }



    /*// onOptionsItemSelected method is called whenever an item in the Toolbar is selected.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create:
                finish();
                startActivity(getIntent());

            case R.id.action_update:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);

            case R.id.action_delete:
                Intent intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }*/

    // Overrides setTitle method to support older api levels
    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_create) {
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);




            return true;
        }

        if (id == R.id.action_update) {
            Intent intent1 = new Intent(this, SecondActivity.class);
            startActivity(intent1);




            return true;
        }

        if (id == R.id.action_delete) {
            Intent intent1 = new Intent(this, ThirdActivity.class);
            startActivity(intent1);
            finish();




            return true;
        }

        return super.onOptionsItemSelected(item);
    }












}

package studio.kucuela.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;


public class SecondActivity extends AppCompatActivity {


    CoordinatorLayout kordi;

    TextView textView100a;

    TextView textView200a;

    TextView textView300a;

    TextView textView400a;

    TextView textView500a;

    TextView textView600a;

    TextView textView700a;

    TextView textView800a;

    TextView textView900a;

    TextView textView1000a;

    private TextView infoa;

    private EditText inputa;

    Spinner sp6a;

    ArrayAdapter<String> adapter6a;

    String numbers6a[] = {"-", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5"};

    Spinner sp7a;

    ArrayAdapter<String> adapter7a;

    String numbers7a[] = {"-", "1", "2", "3", "4", "Probilo!"};

    Spinner sp8a;

    ArrayAdapter<String> adapter8a;

    String numbers8a[] = {"-", "More", "Oblaci", "Olujno more", "Olujni oblaci"};

    Spinner sp9a;

    ArrayAdapter<String> adapter9a;

    String numbers9a[] = {"-", "Plava", "Bela", "Žuta", "Narandžasta", "Još uvek je dan"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //getSupportActionBar().setTitle("BRZI RTN TEST");





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        infoa = (TextView) findViewById(R.id.textViewZlodia);
        inputa = (EditText) findViewById(R.id.editText11a);

        //uvodne animacije texta

        final TextView txt2 = (TextView) findViewById(R.id.textView);
        txt2.setText("RTN \nopšta naduvanost");
        txt2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

        final TextView txt21 = (TextView) findViewById(R.id.textView2);
        txt21.setText("KACA \ndubina ludila");
        txt21.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

        final TextView txt22 = (TextView) findViewById(R.id.textView3);
        txt22.setText("MORE ILI OBLACI \nambijent mora ili ambijent oblaka");
        txt22.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));

        final TextView txt23 = (TextView) findViewById(R.id.textView4);
        txt23.setText("SVETLA \ndominantna boja svetla napolju");
        txt23.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.slide_in_left));


        Toast.makeText(getBaseContext(), "Dobrodošli na brzi Rtn test.",
                Toast.LENGTH_SHORT).show();

        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );
            getSupportActionBar().setTitle("Brzi Rtn test");
            actionBar.show();
        }

        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content1a);
        FloatingActionButton imageView = (FloatingActionButton) findViewById(R.id.btn_buya);
        rippleBackground.startRippleAnimation();



        textView100a = (TextView) findViewById(R.id.textView100a);
        textView200a = (TextView) findViewById(R.id.textView200a);
        textView300a = (TextView) findViewById(R.id.textview300a);
        textView400a = (TextView) findViewById(R.id.textview400a);
        textView500a = (TextView) findViewById(R.id.textview500a);
        textView600a = (TextView) findViewById(R.id.textview600a);
        textView700a = (TextView) findViewById(R.id.textview700a);
        textView800a = (TextView) findViewById(R.id.textview800a);
        textView900a = (TextView) findViewById(R.id.textview900a);
        textView1000a = (TextView) findViewById(R.id.textview1000a);


        sp6a = (Spinner) findViewById(R.id.spinner6a);
        sp7a = (Spinner) findViewById(R.id.spinner7a);
        sp8a = (Spinner) findViewById(R.id.spinner8a);
        sp9a = (Spinner) findViewById(R.id.spinner9a);

        //RTN
        adapter6a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numbers6a);
        sp6a.setAdapter(adapter6a);
        sp6a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        //KACA
        adapter7a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numbers7a);
        sp7a.setAdapter(adapter7a);
        sp7a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        //MORE
        adapter8a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numbers8a);
        sp8a.setAdapter(adapter8a);
        sp8a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

        //SVETLA
        adapter9a = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numbers9a);
        sp9a.setAdapter(adapter9a);
        sp9a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });



    }

    // Method(s) that manage Toolbar.

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
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

            finish();




            return true;

        }

        return super.onOptionsItemSelected(item);
    }


    //SHARE DUGME
    public void floatera(View view) {




        Intent sendIntent = new Intent();
        String date = String.valueOf(android.text.format.DateFormat.format("EE,dd.MMMM, HH:mm", new java.util.Date()));
        String inputText = inputa.getText().toString();
        infoa.setText(inputText);
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "REZULTATI BRZOG TESTA" + "\n\nVREME: " + date + "\n\nRTN: " + sp6a.getSelectedItem().toString() + "\nKACA: " + sp7a.getSelectedItem().toString() + "\nMORE/OBLACI: " + sp8a.getSelectedItem().toString() + "\nSVETLA: " + sp9a.getSelectedItem().toString() + "\n\nOPŠTI UTISAK/NAPOMENE: " + "\n" + inputa.getText());
        sendIntent.setType("text/plain");

        startActivity(sendIntent);
    }



}

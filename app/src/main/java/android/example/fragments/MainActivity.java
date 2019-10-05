package android.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.text_view_fragment);
        ExampleFragment fragment=ExampleFragment.newInstance("heyya",123);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}

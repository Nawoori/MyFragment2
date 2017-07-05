package com.nawoori.android.fragment2;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListFragment fragment1;
    FragmentViewer fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new ListFragment();
        fragment2 = new FragmentViewer();

    }

    public void onImageChange(int index){

    }
}

package com.example.m212ac1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);


// configuration de l'adaptateur
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

// ajouter les fragments
        viewPagerAdapter.add(new FragmentA(), "Home");
        viewPagerAdapter.add(new FragmentB(), "Products");

// définir l'adaptateur
        viewPager.setAdapter(viewPagerAdapter);

// Les titres de la page (fragment) seront affichés dans le
// tabLayout, il faut donc définir le visualisateur de page.
// On utilise la fonction setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}
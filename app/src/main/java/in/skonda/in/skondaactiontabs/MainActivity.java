package in.skonda.in.skondaactiontabs;

import android.app.Application;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private TabsSectionsPagerAdapter mTabsSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mTabsViewPager;


    private SliderSectionsPagerAdapter mSliderSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mSliderViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addVideos();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mTabsSectionsPagerAdapter = new TabsSectionsPagerAdapter(getSupportFragmentManager(), this);

        // Set up the ViewPager with the sections adapter.
        mTabsViewPager = (ViewPager) findViewById(R.id.container);
        mTabsViewPager.setAdapter(mTabsSectionsPagerAdapter);

//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mTabsViewPager);



        mSliderSectionsPagerAdapter = new SliderSectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mSliderViewPager = (ViewPager) findViewById(R.id.vpcontainer);
        mSliderViewPager.setAdapter(mSliderSectionsPagerAdapter);

        TabLayout dotTabs = (TabLayout) findViewById(R.id.dotTabs);
        dotTabs.setupWithViewPager(mSliderViewPager, true);
        dotTabs.setBackgroundColor(getResources().getColor(R.color.colorDark80) );
    }




    public void addVideos() {
        VideoUrls.addUri("https://skonda.in/Dangal.mp4");
        VideoUrls.addUri("https://skonda.in/Force.mp4");
        VideoUrls.addUri("https://skonda.in/Mehram.mp4");
        VideoUrls.addUri("https://skonda.in/Dangal.mp4");
    }
}

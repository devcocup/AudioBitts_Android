package co.audiobitts.audiobitts.Activity;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import co.audiobitts.audiobitts.Fragment.ExploreFragment;
import co.audiobitts.audiobitts.Fragment.MyBittsFragment;
import co.audiobitts.audiobitts.R;

public class MainActivity extends AppCompatActivity implements
    ExploreFragment.OnFragmentInteractionListener,
    MyBittsFragment.OnFragmentInteractionListener{

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView menuView;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawer = findViewById(R.id.drawer_layout);
        drawerToggle = setupDrawerToggle();
        mDrawer.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        menuView = findViewById(R.id.menuView);
        setupMenuContent(menuView);
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.menu_open, R.string.menu_close);
    }

    private void setupMenuContent(NavigationView navigationView) {
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectMenuItem(item);
                return true;
            }
        });
    }

    public void selectMenuItem(MenuItem item) {
        Fragment fragment = null;
        Class fragmentClass;
        switch (item.getItemId()) {
            case R.id.menu_explore_fragment:
                fragmentClass = ExploreFragment.class;
                break;
            case R.id.menu_my_bitts_fragment:
                fragmentClass = MyBittsFragment.class;
                break;
            default:
                fragmentClass = ExploreFragment.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContent, fragment).commit();

        item.setChecked(true);
//        setTitle(item.getTitle());

        mDrawer.closeDrawers();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

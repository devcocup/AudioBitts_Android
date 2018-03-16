package co.audiobitts.audiobitts;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mindorks.placeholderview.PlaceHolderView;

public class ExploreActivity extends AppCompatActivity {

    private PlaceHolderView menuView;
    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private PlaceHolderView mGalleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        mDrawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        menuView = (PlaceHolderView) findViewById(R.id.drawerView);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mGalleryView = (PlaceHolderView) findViewById(R.id.galleryView);
        setUpMenu();
    }

    private void setUpMenu() {
        menuView
                .addView(new MenuHeader())
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_EXPLORE))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_MY_BITTS))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_NOTIFICATIONS))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_RATE_US))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_TELL_A_FRIEND))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_SETTINGS))
                .addView(new MenuItem(this.getApplicationContext(), MenuItem.MENU_ITEM_SIGNUP));

        ActionBarDrawerToggle menuToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, R.string.open_menu, R.string.close_menu) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        mDrawer.addDrawerListener(menuToggle);
        menuToggle.syncState();

    }
}

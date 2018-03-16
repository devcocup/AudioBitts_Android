package co.audiobitts.audiobitts;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

/**
 * Created by Heltgolf on 3/15/2018.
 */
@Layout(R.layout.menu_item)
public class MenuItem {
    public static final int MENU_ITEM_EXPLORE = 1;
    public static final int MENU_ITEM_MY_BITTS = 2;
    public static final int MENU_ITEM_NOTIFICATIONS = 3;
    public static final int MENU_ITEM_RATE_US = 4;
    public static final int MENU_ITEM_TELL_A_FRIEND = 5;
    public static final int MENU_ITEM_SETTINGS = 6;
    public static final int MENU_ITEM_SIGNUP = 7;

    private int mMenuPosition;
    private Context mContext;
    private MenuCallBack mCallBack;

    @View(R.id.itemIcon)
    private ImageView itemIcon;

    @View(R.id.itemNameText)
    private TextView itemNameText;

    public MenuItem(Context context, int mPosition) {
        mContext = context;
        mMenuPosition = mPosition;
    }

    @Resolve
    private void onResolved() {
        switch (mMenuPosition){
            case MENU_ITEM_EXPLORE:
                itemNameText.setText(mContext.getString(R.string.menu_explore));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.explore));
                break;
            case MENU_ITEM_MY_BITTS:
                itemNameText.setText(mContext.getString(R.string.menu_my_bitts));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.my_bitts));
                break;
            case MENU_ITEM_NOTIFICATIONS:
                itemNameText.setText(mContext.getString(R.string.menu_notifications));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.notifications));
                break;
            case MENU_ITEM_RATE_US:
                itemNameText.setText(mContext.getString(R.string.menu_rate_us));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.rate_us));
                break;
            case  MENU_ITEM_TELL_A_FRIEND:
                itemNameText.setText(mContext.getString(R.string.menu_tell_a_friend));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.tell_a_friend));
                break;
            case MENU_ITEM_SETTINGS:
                itemNameText.setText(mContext.getString(R.string.menu_settings));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.settings));
                break;
            case MENU_ITEM_SIGNUP:
                itemNameText.setText(mContext.getString(R.string.menu_sign_up));
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.sign_up));
                break;
        }
    }

    @Click(R.id.mainView)
    private void onMenuItemClick() {
        switch (mMenuPosition){
            case MENU_ITEM_EXPLORE:
                if (mCallBack != null)
                    mCallBack.onExploreSelected();
                break;
            case MENU_ITEM_MY_BITTS:
                if (mCallBack != null)
                    mCallBack.onMyBittsSelected();
                break;
            case MENU_ITEM_NOTIFICATIONS:
                if (mCallBack != null)
                    mCallBack.onNotificationSelected();
                break;
            case MENU_ITEM_RATE_US:
                if (mCallBack != null)
                    mCallBack.onRateUSSelected();
                break;
            case MENU_ITEM_TELL_A_FRIEND:
                if (mCallBack != null)
                    mCallBack.onTellAFriendSelected();
                break;
            case MENU_ITEM_SETTINGS:
                if (mCallBack != null)
                    mCallBack.onSettingsSelected();
                break;
            case MENU_ITEM_SIGNUP:
                if (mCallBack != null)
                    mCallBack.onSignUpSelected();
                break;
        }
    }

    public void setMenuCallBack(MenuCallBack callBack) {
        mCallBack = callBack;
    }

    public interface MenuCallBack {
        void onExploreSelected();
        void onMyBittsSelected();
        void onNotificationSelected();
        void onRateUSSelected();
        void onTellAFriendSelected();
        void onSettingsSelected();
        void onSignUpSelected();
    }

}

package co.audiobitts.audiobitts;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

/**
 * Created by Heltgolf on 3/15/2018.
 */
@NonReusable
@Layout(R.layout.menu_header)
public class MenuHeader {
    @View(R.id.profileImageView)
    private ImageView profileImage;

    @View(R.id.nameText)
    private TextView nameText;

    @Resolve
    private void onResolved() {
        nameText.setText("Hi Guest!");
    }
}

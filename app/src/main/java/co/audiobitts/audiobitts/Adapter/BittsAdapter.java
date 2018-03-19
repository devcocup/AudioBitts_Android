package co.audiobitts.audiobitts.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import co.audiobitts.audiobitts.Class.Bitt;
import co.audiobitts.audiobitts.R;

/**
 * Created by Heltgolf on 3/20/2018.
 */

public class BittsAdapter extends RecyclerView.Adapter<BittsAdapter.ViewHolder> {

    private Context mContext;
    private List<Bitt> bittList;

    public BittsAdapter(Context context, List<Bitt> bitts) {
        this.mContext = context;
        this.bittList = bitts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bitt_cardview, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Bitt bitt = bittList.get(position);
        holder.username.setText(bitt.getUsername());
        holder.bitt_title.setText(bitt.getTitle());
        holder.bitt_arrive_time.setText(bitt.getArrive_time());
        holder.user_profile.setImageResource(R.drawable.profile_placeholder);
        holder.play_image.setImageResource(R.drawable.bitt_placeholder);
        holder.play_count.setText(bitt.getPlay_count());
        holder.comment_count.setText(bitt.getComment_count());
        holder.like_count.setText(bitt.getLike_count());
        holder.description.setText(bitt.getDescription());
        holder.duration.setText(bitt.getPlay_duration());
    }

    @Override
    public int getItemCount() {
        return bittList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView username, bitt_title, bitt_arrive_time, play_count, comment_count, like_count, duration, description;
        public ImageView user_profile, play_image;
        public ViewHolder(View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.bitt_user_name);
            bitt_title = itemView.findViewById(R.id.bitt_title);
            bitt_arrive_time = itemView.findViewById(R.id.bitt_arrive_time);
            play_count = itemView.findViewById(R.id.bitt_play_count);
            comment_count = itemView.findViewById(R.id.bitt_comment_count);
            like_count = itemView.findViewById(R.id.bitt_like_count);
            duration = itemView.findViewById(R.id.bitt_duration);
            description = itemView.findViewById(R.id.bitt_description);
            user_profile = itemView.findViewById(R.id.bitt_user_profile);
            play_image = itemView.findViewById(R.id.bitt_play_image);
        }
    }
}

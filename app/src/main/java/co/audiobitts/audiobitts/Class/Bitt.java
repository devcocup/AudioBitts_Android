package co.audiobitts.audiobitts.Class;

/**
 * Created by Heltgolf on 3/20/2018.
 */

public class Bitt {
    private String username;
    private String user_profile;
    private String title;
    private String arrive_time;
    private String play_count;
    private String comment_count;
    private String play_image;
    private String like_count;
    private String play_duration;
    private String description;

    public Bitt() {

    }

    public Bitt(String username, String user_profile, String title, String time, String play_count, String comment_count,
                String play_image, String like_count, String play_duration, String description) {
        this.username = username;
        this.user_profile = user_profile;
        this.title = title;
        this.arrive_time = time;
        this.play_count = play_count;
        this.comment_count = comment_count;
        this.play_image = play_image;
        this.like_count = like_count;
        this.play_duration = play_duration;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(String user_profile) {
        this.user_profile = user_profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlay_count() {
        return play_count;
    }

    public void setPlay_count(String play_count) {
        this.play_count = play_count;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public String getPlay_image() {
        return play_image;
    }

    public void setPlay_image(String play_image) {
        this.play_image = play_image;
    }

    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }

    public String getPlay_duration() {
        return play_duration;
    }

    public void setPlay_duration(String play_duration) {
        this.play_duration = play_duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }
}

package in.skonda.in.skondaactiontabs;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by sudarsan.konda on 07/18/2017.
 */

public class VideoUrls {
    public static ArrayList<Uri> videos = new ArrayList<>();

    public static String[] tabNames = {"VIDEOS", "IMAGES", "MILESTONE", "MILESTONE"};

    public static void addUri(String videoString) {
        Uri uri = Uri.parse(videoString);
        videos.add(uri);
    }

}

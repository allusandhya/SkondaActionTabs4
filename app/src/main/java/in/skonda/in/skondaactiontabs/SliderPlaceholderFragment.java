package in.skonda.in.skondaactiontabs;

/**
 * Created by sudarsan.konda on 07/19/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A placeholder fragment containing a simple view.
 */
public class SliderPlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public SliderPlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SliderPlaceholderFragment newInstance(int sectionNumber) {
        SliderPlaceholderFragment fragment = new SliderPlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_slide, container, false);
        final VideoView videoView = (VideoView) rootView.findViewById(R.id.videoView);
//            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        Log.d("skondad:", "view returned" );

//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        videoView.setVideoURI(VideoUrls.videos.get(getArguments().getInt(ARG_SECTION_NUMBER)));
        videoView.setMediaController(new MediaController(getActivity()));
        videoView.seekTo(100);

        LinearLayout playLayout = (LinearLayout) rootView.findViewById(R.id.playLayout);
        playLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(videoView.isPlaying()) {
                    videoView.pause();
                }
                else
                    videoView.start();
            }
        });

        return rootView;
    }
}

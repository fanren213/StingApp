package bonanc.stingapp.ui;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

import bonanc.stingapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {

    private VideoView videoView;
    private Button buttonVideo1;
    private Button buttonVideo2;
    private Button buttonVideo3;
    private Button buttonPause;
    private int per;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideoFragment newInstance(String param1, String param2) {
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_video, container, false);
        buttonVideo1 = (Button) v.findViewById(R.id.video1);
        buttonVideo2 = (Button) v.findViewById(R.id.video2);
        buttonVideo3 = (Button) v.findViewById(R.id.video3);
        buttonPause = (Button) v.findViewById(R.id.pause);
        videoView = (VideoView) v.findViewById(R.id.videoView);
        buttonVideo1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
                        + R.raw.video1));
                videoView.seekTo(0);
                videoView.start();
            }
        });
        buttonVideo2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
                        + R.raw.video2));
                videoView.seekTo(0);
                videoView.start();
            }
        });
        buttonVideo3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/"
                        + R.raw.video3));
                videoView.seekTo(0);
                videoView.start();
            }
        });
        buttonPause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView.isPlaying()) {
                    videoView.pause();
                    per = videoView.getCurrentPosition();
                }
            }
        });
        return v;
    }


}

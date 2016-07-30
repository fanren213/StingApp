package bonanc.stingapp.ui;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.IOException;

import bonanc.stingapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AudioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AudioFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    private Button buttonAudio1;
    private Button buttonAudio2;
    private Button buttonAudio3;
    private Button buttonPause;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AudioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AudioFragment newInstance(String param1, String param2) {
        AudioFragment fragment = new AudioFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public AudioFragment() {
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
        View v = inflater.inflate(R.layout.fragment_audio, container, false);
        buttonAudio1 = (Button) v.findViewById(R.id.audio1);
        buttonAudio2 = (Button) v.findViewById(R.id.audio2);
        buttonAudio3 = (Button) v.findViewById(R.id.audio3);
        buttonPause = (Button) v.findViewById(R.id.pause2);
        buttonAudio1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.a_thousand_years);
                mediaPlayer.start();

            }
        });
        buttonAudio2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.every_breath_you_take);
                mediaPlayer.start();
            }
        });
        buttonAudio3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mediaPlayer = MediaPlayer.create(getContext(),R.raw.shape_of_my_heart);
                mediaPlayer.start();
            }
        });
        buttonPause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
            }
        });

        return v;
    }
    private void stopPlaying() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


}

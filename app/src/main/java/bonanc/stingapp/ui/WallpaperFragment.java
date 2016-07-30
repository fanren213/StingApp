package bonanc.stingapp.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import bonanc.stingapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WallpaperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WallpaperFragment extends Fragment {
    private Button buttonWallpaper1;
    private Button buttonWallpaper2;
    private Button buttonWallpaper3;
    private ImageView imageView;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WallpaperFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WallpaperFragment newInstance(String param1, String param2) {
        WallpaperFragment fragment = new WallpaperFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public WallpaperFragment() {
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
        View v = inflater.inflate(R.layout.fragment_wallpaper, container, false);
        buttonWallpaper1 = (Button) v.findViewById(R.id.wallpaper1);
        buttonWallpaper2 = (Button) v.findViewById(R.id.wallpaper2);
        buttonWallpaper3 = (Button) v.findViewById(R.id.wallpaper3);
        imageView = (ImageView) v.findViewById(R.id.imageView2);
        buttonWallpaper1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.wallpaper1);
            }
        });
        buttonWallpaper2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.wallpaper2);
            }
        });
        buttonWallpaper3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.wallpaper3);
            }
        });
        return v;
    }


}

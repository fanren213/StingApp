package bonanc.stingapp.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bonanc.stingapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);;
        TextView textViewWebsite = (TextView) v.findViewById(R.id.website);
        TextView textViewFacebook = (TextView) v.findViewById(R.id.facebook);
        TextView textViewTwitter = (TextView) v.findViewById(R.id.twitter);
        textViewWebsite.setClickable(true);
        textViewFacebook.setClickable(true);
        textViewTwitter.setClickable(true);
        textViewWebsite.setMovementMethod(LinkMovementMethod.getInstance());
        textViewFacebook.setMovementMethod(LinkMovementMethod.getInstance());
        textViewTwitter.setMovementMethod(LinkMovementMethod.getInstance());
        textViewWebsite.setText(Html.fromHtml(getString(R.string.website)));
        textViewFacebook.setText(Html.fromHtml(getString(R.string.facebook)));
        textViewTwitter.setText(Html.fromHtml(getString(R.string.twitter)));
        return v;
    }


}

package bonanc.stingapp.ui;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bonanc.stingapp.R;
import bonanc.stingapp.util.DatabaseOps;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MailFragment extends Fragment {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private Button buttonSubmit;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MailFragment newInstance(String param1, String param2) {
        MailFragment fragment = new MailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public MailFragment() {
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
        View v = inflater.inflate(R.layout.fragment_mail, container, false);
        editText1 = (EditText) v.findViewById(R.id.first_name);
        editText2 = (EditText) v.findViewById(R.id.last_name);
        editText3 = (EditText) v.findViewById(R.id.mail_add);
        buttonSubmit = (Button) v.findViewById(R.id.submit);
        buttonSubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstName = editText1.getText().toString();
                    String lastName = editText2.getText().toString();
                    String email = editText3.getText().toString();
                    if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty())
                        throw new Exception("Please fill all the blanks.");
                    DatabaseOps databaseOps = new DatabaseOps(v.getContext());
                    databaseOps.insertData(firstName, lastName, email);
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_EMAIL, "sting@sting.com");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Add to mail list");
                    intent.putExtra(Intent.EXTRA_TEXT, firstName + " " + lastName);
                    startActivity(Intent.createChooser(intent, "Sending email"));
                } catch (Exception e) {
                    new AlertDialog.Builder(v.getContext())
                        .setTitle("Exception")
                        .setMessage(e.getMessage())
                        .setPositiveButton("OK", null)
                        .create()
                        .show();
                    Log.e("EXCEPTION", e.getMessage());
                } finally {
                    editText1.setText("");
                    editText2.setText("");
                    editText3.setText("");
                }

            }
        });
        return v;
    }


}

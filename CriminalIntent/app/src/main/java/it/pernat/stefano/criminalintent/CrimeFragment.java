package it.pernat.stefano.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Locale;

import it.pernat.stefano.criminalintent.logic.Crime;

/**
 * Created by stefanopernat on 05/05/16.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    private static String CRIME_DATE_FORMAT = "EEEE, MMM d, yyyy";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crime, container, false);

        this.mTitleField = (EditText) view.findViewById(R.id.crime_title);
        this.mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //left blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //mTitleField.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                //left blank for now
            }
        });

        this.mDateButton = (Button) view.findViewById(R.id.crime_date);
        SimpleDateFormat sdf = new SimpleDateFormat(CRIME_DATE_FORMAT, Locale.US);

        this.mDateButton.setText(sdf.format(this.mCrime.getDate()));
        this.mDateButton.setEnabled(false);

        this.mSolvedCheckBox = (CheckBox) view.findViewById(R.id.crime_solved);
        this.mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });

        return view;

    }
}

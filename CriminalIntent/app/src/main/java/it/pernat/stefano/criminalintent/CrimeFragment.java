package it.pernat.stefano.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import it.pernat.stefano.criminalintent.logic.Crime;

/**
 * Created by stefanopernat on 05/05/16.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;

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

        mTitleField = (EditText) view.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //left blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTitleField.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //left blank for now
            }
        });

        return view;

    }
}

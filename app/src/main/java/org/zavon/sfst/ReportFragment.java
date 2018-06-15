package org.zavon.sfst;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;

import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;


public class ReportFragment extends Fragment {
Button btn;




    public static ReportFragment newInstance() {
        ReportFragment fragment = new ReportFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_report, container,         false);


        btn = (Button) rootView.findViewById(R.id.button);


           btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                createPDF();
            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace();
            }
        }
    });

        public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_smoothPursuit:
                if (checked);

            else
                // Remove the meat
                break;
            case R.id.checkbox_distinct:
                if (checked);
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            case R.id.checkbox_priorTo45:
                if (checked);
            else
                break;

        }
    }

}
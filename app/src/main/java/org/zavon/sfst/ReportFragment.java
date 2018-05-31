package org.zavon.sfst;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


public class ReportFragment extends Fragment {
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
        return inflater.inflate(R.layout.fragment_report, container, false);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_smoothPursuit:
                if (checked);
                // Put some meat on the sandwich
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
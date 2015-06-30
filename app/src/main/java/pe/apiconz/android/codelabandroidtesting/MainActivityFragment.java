package pe.apiconz.android.codelabandroidtesting;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void sayHello(View v){
        TextView textView = (TextView)  getView().findViewById(R.id.textView);
        EditText editText = (EditText) getView().findViewById(R.id.editText);
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }
}

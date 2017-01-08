package carlosrivera.me.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import carlosrivera.me.stormy.R;

/**
 * Created by carlo on 12/30/2016.
 */

public class AlertDialogFragment extends DialogFragment {
    // extends more recent dialogfragment

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_button_text,null);
        // null button just dismisses the dialog

        // create with method
        AlertDialog dialog = builder.create();
        return dialog;
        // return super.onCreateDialog(savedInstanceState);
    }
}

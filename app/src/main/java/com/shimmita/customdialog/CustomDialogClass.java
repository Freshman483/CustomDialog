package com.shimmita.customdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CustomDialogClass extends AppCompatDialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
       // MainActivity mainActivity = new MainActivity();

        AlertDialog.Builder builder_dialog_customised = new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater =LayoutInflater.from(getActivity());//getActivity().getLayoutInflater();
       View view = layoutInflater.inflate(R.layout.customdialoglayout, null);
        builder_dialog_customised.setView(view);
        builder_dialog_customised.setTitle("Custom Dialog Alert");
        builder_dialog_customised.setCancelable(false);
        builder_dialog_customised.setMessage("This Is A Customised Dialog Alert that can Pass a layout inside.welcome");
        builder_dialog_customised.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText user_holder = view.findViewById(R.id.editText_username);
                EditText password_holder = view.findViewById(R.id.editText_password);
                Toast.makeText(getActivity(), "Username->" + user_holder.getText().toString() + "\n" +
                        "Passord->" + password_holder.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });

        builder_dialog_customised.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Toast.makeText(getActivity(), "Cancelled!", Toast.LENGTH_LONG).show();
            }
        });

        return builder_dialog_customised.create();
    }
}

package com.example.alertpoc;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;

public class Applicat extends Application {
	public static void alertDialogWithTitle(Context context,String message,String title) {
		AlertDialog alertDialog = new AlertDialog.Builder(context)
				.create();
		alertDialog.setTitle(title);

		// Setting Dialog Message
		alertDialog.setMessage(message);
		
		alertDialog.setCancelable(false);
		alertDialog.setCanceledOnTouchOutside(false);


		// Setting OK Button
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// Write your code here to execute after dialog closed
				dialog.dismiss();
			}
		});

		// Showing Alert Message
		alertDialog.show();
	}

}

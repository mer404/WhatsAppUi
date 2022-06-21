package com.example.whatsappui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private static final int pic_id = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profileA;
        Button btnupload;

        profileA = findViewById(R.id.profile);
        btnupload = findViewById(R.id.btnupload);
        btnupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                photoChoose();
            }

            private void photoChoose() {

                photoChoose();
                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(i, "Select Picture"), 123);


            }

            public void onActivityResult(int requestCode, int resultCode, Intent data) {


            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {


            if (requestCode == pic_id) {


                Uri selectedImageUri = data.getData();

                ImageView profileA = null;

                if (null != selectedImageUri) {
                    // update the preview image in the layout
                    profileA.setImageURI(selectedImageUri);

                    super.onActivityResult(requestCode, resultCode, data);
                }
            }
        }
    }
}
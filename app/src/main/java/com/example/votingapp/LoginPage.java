package com.example.votingapp;

import static com.example.votingapp.R.id.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity{

    public View.OnClickListener click(){
        Intent intent = new Intent(this, Verification_page.class);

        startActivity(intent);

        return null;
    }



}

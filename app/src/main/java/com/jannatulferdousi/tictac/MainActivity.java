package com.jannatulferdousi.tictac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {


 AdView mAdView;

    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startGame = "x";
    int b1 = 5,b2=5,b3=5,b4=5,b5=5,b6=6,b7=5,b8=5,b9=5,aCount =0,bCount=0,i=0;
    private TextView scorea,scoreb;
    private Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.buttonImage1);
        btn2 = findViewById(R.id.buttonImage2);
        btn3 = findViewById(R.id.buttonImage3);
        btn4 = findViewById(R.id.buttonImage4);
        btn5 = findViewById(R.id.buttonImage5);
        btn6 = findViewById(R.id.buttonImage6);
        btn7 = findViewById(R.id.buttonImage7);
        btn8 = findViewById(R.id.buttonImage8);
        btn9 = findViewById(R.id.buttonImage9);

        scorea = findViewById(R.id.ScoreA);
        scoreb = findViewById(R.id.ScoreB);

        Reset = findViewById(R.id.Reset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);
                resetValues();
                aCount=0;
                bCount=0;
                scorea.setText("Score A:- "+String.valueOf(aCount));
                scoreb.setText("Score B:- "+String.valueOf(bCount));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                }
                else {
                    btn1.setImageResource(R.drawable.circle);
                    b1 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                }
                else {
                    btn2.setImageResource(R.drawable.circle);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                }
                else {
                    btn3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn4.setImageResource(R.drawable.cross);
                    b4=1;
                    i++;
                }
                else {
                    btn4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn5.setImageResource(R.drawable.cross);
                    b5= 1;
                    i++;
                }
                else {
                    btn5.setImageResource(R.drawable.circle);
                    b5= 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                }
                else {
                    btn6.setImageResource(R.drawable.circle);
                    b6= 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn7.setImageResource(R.drawable.cross);
                    b7= 1;
                    i++;
                }
                else {
                    btn7.setImageResource(R.drawable.circle);
                    b7= 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn8.setImageResource(R.drawable.cross);
                    b8= 1;
                    i++;
                }
                else {
                    btn8.setImageResource(R.drawable.circle);
                    b8= 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startGame.equals("x"))
                {
                    btn9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                }
                else {
                    btn9.setImageResource(R.drawable.circle);
                    b9= 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

    }

    private  void winningGame()
    {

        if ((b1==1) && (b2==1) && (b3==1))
        {
           AlertDialog.Builder builder = new AlertDialog.Builder(this);
           builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {

                   btn1.setImageDrawable(null);
                   btn2.setImageDrawable(null);
                   btn3.setImageDrawable(null);
                   btn4.setImageDrawable(null);
                   btn5.setImageDrawable(null);
                   btn6.setImageDrawable(null);
                   btn7.setImageDrawable(null);
                   btn8.setImageDrawable(null);
                   btn9.setImageDrawable(null);
                   resetValues();
               }
           });
           AlertDialog alertDialog = builder.create();
           alertDialog.show();
           aCount++;
           scorea.setText("Score A :-" +String.valueOf(aCount));
        }
       else if ((b4==1) && (b5==1) && (b6==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }
        else if ((b7==1) && (b8==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }
       else if ((b1==1) && (b4==1) && (b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }
        else if ((b2==1) && (b5==1) && (b8==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }
        else if ((b3==1) && (b6==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }
        else if ((b1==1) && (b5==1) && (b9==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }

        else if ((b3==1) && (b5==1) && (b7==1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player A Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            aCount++;
            scorea.setText("Score A :-" +String.valueOf(aCount));
        }



        else if ((b1==0) && (b2==0) && (b3==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }


        else if ((b4==0) && (b5==0) && (b6==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }
        else if ((b7==0) && (b8==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }

        else if ((b1==0) && (b2==0) && (b3==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }
        else if ((b1==0) && (b4==0) && (b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }
        else if ((b2==0) && (b5==0) && (b8==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }

        else if ((b3==0) && (b6==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }

        else if ((b1==0) && (b5==0) && (b9==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }

        else if ((b3==0) && (b5==0) && (b7==0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player B Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            bCount++;
            scoreb.setText("Score B :-" +String.valueOf(bCount));
        }
        else{
            if (i==9){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void choosePlayer()
    {
        if (startGame.equals("x")){

            startGame="o";
        }
        else {
           startGame = "x" ;
        }
    }

    private void resetValues() {
                b1=5;
                b2=5;
                b3=5;
                b4=5;
                b5=5;
                b6=6;
                b7=5;
                b8=5;
                b9=5;
                i=0;



             ///////Adview



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adViewMainActivity2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

}
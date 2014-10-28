package ua.ck.monitor.shiyko_02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FadeInActivity extends Activity implements AnimationListener {

    TextView txtMessage;
    Button btn1, btn2, btn3, btn4, btn5, btn6;

    // Animation
    Animation anim1, anim2, anim3, anim4, anim5, anim6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        txtMessage = (TextView) findViewById(R.id.text_anim);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);

        // load the animation
        anim1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        anim3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        anim4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        anim5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        anim6 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        // set animation listener
        anim1.setAnimationListener(this);
        anim2.setAnimationListener(this);
        anim3.setAnimationListener(this);
        anim4.setAnimationListener(this);
        anim5.setAnimationListener(this);
        anim6.setAnimationListener(this);

        // button click event
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim1);          // start the animation
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim2);          // start the animation
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim3);          // start the animation
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim4);          // start the animation
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim5);          // start the animation
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(anim6);          // start the animation
            }
        });
    }

    @Override
    public void onAnimationEnd(Animation anim) {
        // Take any action after completing the animation

        // check for fade in animation
/*      if((anim==anim1)||(anim==anim2)||(anim==anim3)||(anim==anim4)||(anim==anim5)||(anim==anim6)){
            Toast.makeText(getApplicationContext(), "Animation Stopped",
                    Toast.LENGTH_SHORT).show();
        }
*/
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }

}
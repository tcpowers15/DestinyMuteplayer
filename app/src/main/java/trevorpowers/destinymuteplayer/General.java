package trevorpowers.destinymuteplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class General extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_general);
  }

  public void gotoBack(View view){
    Intent intent = new Intent(this, MainMenu.class);
    startActivity(intent);
  }

  public void playOK(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playWatchOut(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playAgreed(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playIWill(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playNevermind(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playSuperIsReady(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playSayAgain(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playLOL(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playDisagree(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playIveGotIt(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }

  public void playWait(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bloop);
    mp.start();
  }
}

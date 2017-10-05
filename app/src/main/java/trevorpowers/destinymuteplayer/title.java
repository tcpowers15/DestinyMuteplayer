package trevorpowers.destinymuteplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class title extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_title);

  }
  public void gotoMenu(View view){
    Intent intent = new Intent(this, MainMenu.class);
    startActivity(intent);
  }
}

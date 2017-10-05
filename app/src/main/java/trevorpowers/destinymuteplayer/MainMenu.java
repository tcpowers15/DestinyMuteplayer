package trevorpowers.destinymuteplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity  {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
  }

  public void gotoGeneral(View view){
    Intent intent = new Intent(this, General.class);
    startActivity(intent);
  }

  public void gotoLeviathan(View view){
    Intent intent = new Intent(this, Leviathan.class);
    startActivity(intent);
  }
}

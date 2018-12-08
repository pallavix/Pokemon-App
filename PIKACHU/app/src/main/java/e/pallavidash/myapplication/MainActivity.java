package e.pallavidash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class MainActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view) {
        ImageView img = $(R.id.dragon);

        int id = view.getId();
        if (id == R.id.dragonite_button) {
            img.setImageResource(R.drawable.dragonite);
        } else if (id == R.id.charizard_button) {
            img.setImageResource(R.drawable.charizard);
        } else if (id == R.id.pikachu_button) {
            img.setImageResource(R.drawable.pikachu);
        }
    }
}
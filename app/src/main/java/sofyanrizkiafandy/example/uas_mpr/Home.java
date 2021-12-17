package sofyanrizkiafandy.example.uas_mpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void logbook(View view) {
        Intent intent = new Intent(Home.this, LogBookActivity.class);
        startActivity(intent);
    }
}
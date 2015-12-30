package com.remcoblom.internetgekkiedating;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle bundle = getIntent().getExtras();

        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        prefs = getSharedPreferences("savedRankings", MODE_PRIVATE);
        float ratingScore = prefs.getFloat(getString(bundle.getInt("name")), 0.0f);
        ratingBar.setRating(ratingScore);

        ImageView profilepic = (ImageView) findViewById(R.id.profilepic);
        int drawable = (int) bundle.get("picture");
        profilepic.setImageResource(drawable);

        TextView name = (TextView) findViewById(R.id.name);
        String getName = getString(bundle.getInt("name"));
        name.setText(getName);

        TextView age = (TextView) findViewById(R.id.age);
        String getAge = getString(bundle.getInt("age"));
        age.append(" " + getAge);

        TextView place = (TextView) findViewById(R.id.place);
        String getPlace = getString(bundle.getInt("place"));
        place.append(" " + getPlace);

        TextView work = (TextView) findViewById(R.id.work);
        String getWork = getString(bundle.getInt("work"));
        work.append(" " + getWork);

        TextView food = (TextView) findViewById(R.id.food);
        String getFood = getString(bundle.getInt("food"));
        food.append(" " + getFood);

        TextView hobbies = (TextView) findViewById(R.id.hobbies);
        String getHobbies = getString(bundle.getInt("hobbies"));
        hobbies.append(" " + getHobbies);

    }

    public void onClickButton(View view) {

        Bundle bundle = getIntent().getExtras();
        prefs = getSharedPreferences("savedRankings", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        prefsEditor.putFloat(getString(bundle.getInt("name")), ratingBar.getRating());
        prefsEditor.apply();

        Intent intent = new Intent();
        intent.putExtra("rating", ratingBar.getRating());
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent intent = new Intent();
            setResult(RESULT_CANCELED, intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}

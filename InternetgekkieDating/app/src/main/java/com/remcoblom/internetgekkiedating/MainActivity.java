package com.remcoblom.internetgekkiedating;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQ_CODE = 1;

    RatingBar ratingBroodje;
    RatingBar ratingPizza;
    RatingBar ratingSjors;
    RatingBar ratingRaps;
    RatingBar ratingStellage;
    RatingBar ratingRaymond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBroodje = (RatingBar) findViewById(R.id.ratingBroodje);
        ratingPizza = (RatingBar) findViewById(R.id.ratingPizza);
        ratingSjors = (RatingBar) findViewById(R.id.ratingSjors);
        ratingRaps = (RatingBar) findViewById(R.id.ratingRaps);
        ratingStellage = (RatingBar) findViewById(R.id.ratingStellage);
        ratingRaymond = (RatingBar) findViewById(R.id.ratingRaymond);

        SharedPreferences prefs = getSharedPreferences("savedRankings", MODE_PRIVATE);

        ratingBroodje.setRating(prefs.getFloat(getString(R.string.broodjebelegmeneer), 0.0f));
        ratingPizza.setRating(prefs.getFloat(getString(R.string.pizzameisje), 0.0f));
        ratingSjors.setRating(prefs.getFloat(getString(R.string.rappersjors), 0.0f));
        ratingRaps.setRating(prefs.getFloat(getString(R.string.rapsmevrouw), 0.0f));
        ratingStellage.setRating(prefs.getFloat(getString(R.string.stellagemevrouw), 0.0f));
        ratingRaymond.setRating(prefs.getFloat(getString(R.string.zangerraymond), 0.0f));
    }

    public void onClickPicture(View view) {

        Intent intent = new Intent(this, ProfileActivity.class);

        switch (view.getId()) {
            case R.id.broodjebeleg:
                intent.putExtra("picture", R.drawable.broodjebeleg);
                intent.putExtra("name", R.string.broodjebelegmeneer);
                intent.putExtra("age", R.string.age_broodjebeleg);
                intent.putExtra("place", R.string.place_broodjebeleg);
                intent.putExtra("work", R.string.work_broodjebeleg);
                intent.putExtra("food", R.string.food_broodjebeleg);
                intent.putExtra("hobbies", R.string.hobbies_broodjebeleg);
                break;
            case R.id.pizza:
                intent.putExtra("picture", R.drawable.pizza);
                intent.putExtra("name", R.string.pizzameisje);
                intent.putExtra("age", R.string.age_pizza);
                intent.putExtra("place", R.string.place_pizza);
                intent.putExtra("work", R.string.work_pizza);
                intent.putExtra("food", R.string.food_pizza);
                intent.putExtra("hobbies", R.string.hobbies_pizza);
                break;
            case R.id.rappersjors:
                intent.putExtra("picture", R.drawable.rappersjors);
                intent.putExtra("name", R.string.rappersjors);
                intent.putExtra("age", R.string.age_rappersjors);
                intent.putExtra("place", R.string.place_rappersjors);
                intent.putExtra("work", R.string.work_rappersjors);
                intent.putExtra("food", R.string.food_rappersjors);
                intent.putExtra("hobbies", R.string.hobbies_rappersjors);
                break;
            case R.id.rapsen:
                intent.putExtra("picture", R.drawable.rapsen);
                intent.putExtra("name", R.string.rapsmevrouw);
                intent.putExtra("age", R.string.age_rapsen);
                intent.putExtra("place", R.string.place_rapsen);
                intent.putExtra("work", R.string.work_rapsen);
                intent.putExtra("food", R.string.food_rapsen);
                intent.putExtra("hobbies", R.string.hobbies_rapsen);
                break;
            case R.id.stellage:
                intent.putExtra("picture", R.drawable.stellage);
                intent.putExtra("name", R.string.stellagemevrouw);
                intent.putExtra("age", R.string.age_stellage);
                intent.putExtra("place", R.string.place_stellage);
                intent.putExtra("work", R.string.work_stellage);
                intent.putExtra("food", R.string.food_stellage);
                intent.putExtra("hobbies", R.string.hobbies_stellage);
                break;
            case R.id.zangerraymond:
                intent.putExtra("picture", R.drawable.zangerraymond);
                intent.putExtra("name", R.string.zangerraymond);
                intent.putExtra("age", R.string.age_zangerraymond);
                intent.putExtra("place", R.string.place_zangerraymond);
                intent.putExtra("work", R.string.work_zangerraymond);
                intent.putExtra("food", R.string.food_zangerraymond);
                intent.putExtra("hobbies", R.string.hobbies_zangerraymond);
                break;
        }

        startActivityForResult(intent, REQ_CODE);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode != RESULT_CANCELED && requestCode == REQ_CODE) {
            float data = intent.getFloatExtra("rating", 0);
            Toast.makeText(MainActivity.this, "Score: " + String.valueOf(data), Toast.LENGTH_SHORT).show();
        }

        ratingBroodje = (RatingBar) findViewById(R.id.ratingBroodje);
        ratingPizza = (RatingBar) findViewById(R.id.ratingPizza);
        ratingSjors = (RatingBar) findViewById(R.id.ratingSjors);
        ratingRaps = (RatingBar) findViewById(R.id.ratingRaps);
        ratingStellage = (RatingBar) findViewById(R.id.ratingStellage);
        ratingRaymond = (RatingBar) findViewById(R.id.ratingRaymond);

        SharedPreferences prefs = getSharedPreferences("savedRankings", MODE_PRIVATE);

        ratingBroodje.setRating(prefs.getFloat(getString(R.string.broodjebelegmeneer), 0.0f));
        ratingPizza.setRating(prefs.getFloat(getString(R.string.pizzameisje), 0.0f));
        ratingSjors.setRating(prefs.getFloat(getString(R.string.rappersjors), 0.0f));
        ratingRaps.setRating(prefs.getFloat(getString(R.string.rapsmevrouw), 0.0f));
        ratingStellage.setRating(prefs.getFloat(getString(R.string.stellagemevrouw), 0.0f));
        ratingRaymond.setRating(prefs.getFloat(getString(R.string.zangerraymond), 0.0f));
    }
}

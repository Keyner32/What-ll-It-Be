package com.example.gabekeyner.project_2.Main_Menus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gabekeyner.project_2.DataBaseCritera.DrinksClassHelper;
import com.example.gabekeyner.project_2.R;

public class SearchResultsClickedItem extends AppCompatActivity {
    TextView titleView;
    TextView abvView;
    TextView descView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results_clicked_item);


        final DrinksClassHelper helper = DrinksClassHelper.getInstance(SearchResultsClickedItem.this);

        titleView = (TextView) findViewById(R.id.titleView);

        abvView = (TextView) findViewById(R.id.abvView);

        descView = (TextView) findViewById(R.id.descView);

//        imageView = (ImageView) findViewById(R.id.imageView);

        int id = getIntent().getIntExtra("id", -1);

        String title = helper.getTitleByID(id);
        String abv = helper.getAbvByID(id);
        String desc = helper.getDescByID(id);

//        switch(title){
//
//            case "corona":
//                Picasso.with(context).load("image url").fetch();
//                Picasso.with(context).load("image url").into(imageView);
//        }

        //Set text to seleccted itme on list
        titleView.setText(title);
        abvView.setText(abv);
        descView.setText(desc);

    }
}

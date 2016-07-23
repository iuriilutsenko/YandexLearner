package ru.yandex.yandexlearner;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;

import java.util.Collections;
import java.util.List;

import ru.yandex.yandexlearner.adapter.ExerciseAdapter;
import ru.yandex.yandexlearner.pojo.ExerciseItemInfo;
import ru.yandex.yandexlearner.pojo.ExerciseItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Режим обучения");
        }

        final ImageView imageView = (ImageView) findViewById(R.id.fastButton);

        if (imageView != null) {
            imageView.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.fast_active);
                        }
                    }
            );
        }

        setUI();
    }

    private void setUI() {
        ExerciseItemInfo beef = new ExerciseItemInfo("beef");

        final ExerciseItem taco = new ExerciseItem("КАРТОЧКИ",
                ContextCompat.getColor(this, R.color.red_item_menu),
                Collections.singletonList(beef));
        //ExerciseItem quesadilla = new ExerciseItem("quesadilla", Collections.singletonList(beef));
        //ExerciseItem burger = new ExerciseItem("burger", Collections.singletonList(beef));
        final List<ExerciseItem> exerciseItems = Collections.singletonList(taco);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        final ExerciseAdapter adapter = new ExerciseAdapter(this, exerciseItems);
        adapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {
            @Override
            public void onListItemExpanded(int position) {

            }

            @Override
            public void onListItemCollapsed(int position) {
            }
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

}

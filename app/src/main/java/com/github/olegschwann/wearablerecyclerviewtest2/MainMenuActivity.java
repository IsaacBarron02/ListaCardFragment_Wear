package com.github.olegschwann.wearablerecyclerviewtest2;

import android.os.Bundle;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainMenuActivity extends WearableActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        WearableRecyclerView recyclerView = findViewById(R.id.main_menu_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setEdgeItemsCenteringEnabled(true);
        recyclerView.setLayoutManager(new WearableLinearLayoutManager(this));

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(R.mipmap.fullstack, "Desarrollo Web FullStack"));
        menuItems.add(new MenuItem(R.mipmap.javascript, "Javascript"));
        menuItems.add(new MenuItem(R.mipmap.flutter, "Flutter"));


        recyclerView.setAdapter(new MainMenuAdapter(this, menuItems, new MainMenuAdapter.AdapterCallback() {
            @Override
            public void onItemClicked(final Integer menuPosition) {
                switch (menuPosition) {
                    case 0:
                        action_1(

                        );
                        break;
                    case 1:
                        action_2();
                        break;
                    case 2:
                        action_3();
                        break;
                }
            }
        }));
    }

    public void action_1(){
        Log.i("ACTION", "action_1()");
    }

    public void action_2(){
        Log.i("ACTION", "action_2()");
    }

    public void action_3(){
        Log.i("ACTION", "action_3()");
    }
}



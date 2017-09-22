package com.sanba.im.lessonproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;


public class BootMainActivity extends AppCompatActivity {

    private BottomNavigationBar bottom_navigation_bar_container;
    private BadgeItem badgeItem;
    private BottomNavigationItem msgItem;
    private BottomNavigationItem taskItem;
    private BottomNavigationItem noticeItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boot_activity_main);


        bottom_navigation_bar_container = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar_container);
//        bottom_navigation_bar_container.setAutoHideEnabled(true);//自动隐藏

        //BottomNavigationBar.MODE_SHIFTING;
        //BottomNavigationBar.MODE_FIXED;
        //BottomNavigationBar.MODE_DEFAULT;
        bottom_navigation_bar_container.setMode(BottomNavigationBar.MODE_FIXED);

        // BottomNavigationBar.BACKGROUND_STYLE_DEFAULT;
        // BottomNavigationBar.BACKGROUND_STYLE_RIPPLE
        // BottomNavigationBar.BACKGROUND_STYLE_STATIC
        bottom_navigation_bar_container.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);


        bottom_navigation_bar_container.setBarBackgroundColor(R.color.white);//背景颜色
//        bottom_navigation_bar_container.setInActiveColor(R.color.nav_gray);//未选中时的颜色
//        bottom_navigation_bar_container.setActiveColor(R.color.white);//选中时的颜色

        badgeItem = new BadgeItem().setBackgroundColor(Color.RED).setText("99").setHideOnSelect(true);//角标

        msgItem = new BottomNavigationItem(R.mipmap.ic_launcher, "消息");
//        msgItem.setActiveColor(Color.GREEN);
//        msgItem.setInActiveColor(Color.RED);
        msgItem.setBadgeItem(badgeItem);
//        badgeItem.show();
        taskItem = new BottomNavigationItem(R.mipmap.ic_launcher, "任务");
//        taskItem.setActiveColor(Color.BLACK);
//        taskItem.setInActiveColor(Color.BLUE);
        noticeItem = new BottomNavigationItem(R.mipmap.ic_launcher, "公告");
//        noticeItem.setActiveColor(Color.GRAY);
//        noticeItem.setInActiveColor(Color.YELLOW);
        bottom_navigation_bar_container.addItem(msgItem).addItem(taskItem).addItem(noticeItem)
                .initialise();

        bottom_navigation_bar_container.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {

            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

}

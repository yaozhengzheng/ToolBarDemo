package com.yao.feicui.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("title");
        toolbar.setSubtitle("subtitle");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ab_android);
        toolbar.setOnMenuItemClickListener(mOnMenuItemClickListener);
    }
    private Toolbar.OnMenuItemClickListener mOnMenuItemClickListener=
            new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            String msg="";
            switch (item.getItemId()){
                case R.id.action_edit:
                    msg+="Click edit";
                    break;
                case R.id.action_share:
                    msg += "Click share";
                    break;
                case R.id.action_settings:
                    msg += "Click setting";
                    break;
            }
            if(!msg.equals("")) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}

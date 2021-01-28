package akashsarkar188.ui.overview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView closeButton, downButton;
    private RelativeLayout overviewLayout, shadedLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.darkStatusIcons);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        onClickListeners();
    }

    private void initView() {

        closeButton = findViewById(R.id.closeButton);
        downButton = findViewById(R.id.downButton);
        overviewLayout = findViewById(R.id.overviewLayout);
        shadedLayout = findViewById(R.id.shadedLayout);
    }

    private void onClickListeners() {

        downButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                overviewLayout.setVisibility(View.VISIBLE);
                shadedLayout.setVisibility(View.VISIBLE);
            }
        });

        closeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                overviewLayout.setVisibility(View.GONE);
                shadedLayout.setVisibility(View.GONE);
            }
        });
    }
}
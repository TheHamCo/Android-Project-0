package co.dijam.michael.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.popularMoviesButton, R.id.stockHawkButton, R.id.buildItBiggerButton, R.id.makeYourAppMaterialButton, R.id.goUbiquitousButton, R.id.capstoneButton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popularMoviesButton:
                showToast(R.string.popular_movies);
                break;
            case R.id.stockHawkButton:
                showToast(R.string.stock_hawk);
                break;
            case R.id.buildItBiggerButton:
                showToast(R.string.build_it_bigger);
                break;
            case R.id.makeYourAppMaterialButton:
                showToast(R.string.make_your_app_material);
                break;
            case R.id.goUbiquitousButton:
                showToast(R.string.go_ubiquitous);
                break;
            case R.id.capstoneButton:
                showToast(R.string.capstone_my_own_app);
                break;
        }
    }

    private void showToast(int appNameStringId) {
        Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch) + getString(appNameStringId), Toast.LENGTH_SHORT).show();
    }
}

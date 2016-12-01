package co.dijam.michael.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.popularMoviesButton)
    Button popularMoviesButton;
    @BindView(R.id.stockHawkButton)
    Button stockHawkButton;
    @BindView(R.id.buildItBiggerButton)
    Button buildItBiggerButton;
    @BindView(R.id.makeYourAppMaterialButton)
    Button makeYourAppMaterialButton;
    @BindView(R.id.goUbiquitousButton)
    Button goUbiquitousButton;
    @BindView(R.id.capstoneButton)
    Button capstoneButton;

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
                break;
            case R.id.stockHawkButton:
                break;
            case R.id.buildItBiggerButton:
                break;
            case R.id.makeYourAppMaterialButton:
                break;
            case R.id.goUbiquitousButton:
                break;
            case R.id.capstoneButton:
                break;
        }
    }
}

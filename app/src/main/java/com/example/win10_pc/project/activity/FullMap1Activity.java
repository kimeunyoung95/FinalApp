package com.example.win10_pc.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.win10_pc.project.R;
import com.example.win10_pc.project.beacon.distance.AndroidModel;
import com.example.win10_pc.project.beacon.logging.LogManager;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:33
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :dd
 */
public class FullMap1Activity  extends AppCompatActivity {

    Button book_location_search;
    Button book_location_a;
    Button book_location_b;
    Button book_location_c;
    String mVersion;
    String mBuildNumber;
    String mModel;
    String mManufacturer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullmap_main);

        book_location_search = (Button) findViewById(R.id.book_location_search);
        book_location_a = (Button) findViewById(R.id.book_location_a);
        book_location_b = (Button) findViewById(R.id.book_location_b);
        book_location_c = (Button) findViewById(R.id.book_location_c);

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String mVersion) {
        this.mVersion = mVersion;
    }

    public String getBuildNumber() {
        return mBuildNumber;
    }

    public String getModel() {
        return mModel;
    }


    public String getManufacturer() {
        return mManufacturer;
    }

    public void setBuildNumber(String mBuildNumber) {
        this.mBuildNumber = mBuildNumber;
    }

    public void setModel(String mModel) {
        this.mModel = mModel;
    }

    public void setManufacturer(String mManufacturer) {
        this.mManufacturer = mManufacturer;
    }

    /**
     * Calculates a qualitative match score between two different Android device models for the
     * purposes of how likely they are to have similar Bluetooth signal level responses
     *
     * @param otherModel
     * @return match quality, higher numbers are a better match
     */

   /* public int matchScore(AndroidModel otherModel) {
        int score = 0;
        if (this.mManufacturer.equalsIgnoreCase(otherModel.mManufacturer)) {
            score = 1;
            book_location_search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BzoneActivity.class);
                    startActivity(intent);
                }
            });
        }
        if (score == 1 && this.mModel.equals(otherModel.mModel)) {
            score = 2;


            book_location_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), AzoneActivity.class);
                    startActivity(intent);
                }
            });

        }
        if (score == 2 && this.mBuildNumber.equals(otherModel.mBuildNumber)) {
            score = 3;
            book_location_c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), CzoneActivity.class);
                    startActivity(intent);
                }
            });

        }

        LogManager.d(TAG, "Score is %s for %s compared to %s", score, toString(), otherModel);
        return score;
    }

    @Override
    public String toString() {
        return "" + mManufacturer + ";" + mModel + ";" + mBuildNumber + ";" + mVersion;
    }
*/

}


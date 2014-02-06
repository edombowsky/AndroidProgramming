package course.labs.activitylab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity {

    private static final String RESTART_KEY = "restart";
    private static final String RESUME_KEY = "resume";
    private static final String START_KEY = "start";
    private static final String CREATE_KEY = "create";

    // String for LogCat documentation
    private final static String TAG = "Lab-ActivityTwo";

    // Lifecycle counters
    private int mCreate  = 0;
    private int mStart   = 0;
    private int mResume  = 0;
    private int mRestart = 0;

    TextView mTvCreate, mTvStart, mTvResume, mTvRestart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        mTvCreate  = (TextView) findViewById(R.id.create);
        mTvStart   = (TextView) findViewById(R.id.start);
        mTvResume  = (TextView) findViewById(R.id.resume);
        mTvRestart = (TextView) findViewById(R.id.restart);

        Button closeButton = (Button) findViewById(R.id.bClose);
        closeButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO:
                // This function closes Activity Two
                // Hint: use Context's finish() method



            }
        });

        // Check for previously saved state
        if (savedInstanceState != null) {

            // TODO:
            // Restore value of counters from saved state
            // Only need 4 lines of code, one for every count variable



        }

        // TODO: Emit LogCat message



        mCreate++;
        displayCounts();
    }

    // Lifecycle callback methods overrides

    @Override
    public void onStart() {
        super.onStart();

        // TODO: Emit LogCat message


        mStart++;
        displayCounts();
    }

    @Override
    public void onResume() {
        super.onResume();

        // TODO: Emit LogCat message


        mResume++;
        displayCounts();
    }

    @Override
    public void onPause() {
        super.onPause();

        // TODO: Emit LogCat message



    }

    @Override
    public void onStop() {
        super.onStop();

        // TODO: Emit LogCat message



    }

    @Override
    public void onRestart() {
        super.onRestart();

        // TODO: Emit LogCat message


        mRestart++;
        displayCounts();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // TODO: Emit LogCat message

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // TODO:
        // Save counter state information with a collection of key-value pairs
        // 4 lines of code, one for every count variable






    }

    // Updates the displayed counters
    public void displayCounts() {

        mTvCreate.setText("onCreate() calls: " + mCreate);
        mTvStart.setText("onStart() calls: " + mStart);
        mTvResume.setText("onResume() calls: " + mResume);
        mTvRestart.setText("onRestart() calls: " + mRestart);

    }
}

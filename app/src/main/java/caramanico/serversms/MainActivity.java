package caramanico.serversms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        processaPagina("http://tecmundo.com.br");
    }
    private String processaPagina(String url){
        url = "http://googleweblight.com/?lite_url="+url;
        Log.e(TAG, url);
        return url;
    }

}

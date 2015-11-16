package samples.exoguru.gridlayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by sifat on 11/15/2015.
 */
public class DownloadActivity extends Activity {

    private ListView listView;
    private String[] texts={"Arif","Oshan","Sifat","Subha","Krishty",
            "Shabnam","Haque","Tasrif","Samio","Khalid","Salman","Kobitor","Pecha","Uth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        listView= (ListView) findViewById(R.id.lvDownload);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new ArrayList<String>()));*/
    }
}

package txt.com.bai17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String danhsachsdt[] = {"0905778864","0905778865","0905778866","0905778867","0905778868","0905778869","0905778870","0905778871","0905778872","0905778873","0905778874","0905778875","0905778876","0905778877","0905778878","0905778879","0905778880","0905778880","0905778892","0905778883","0905778884","0905778885","0905778886","0905778887","0905778888","0905778889","0905778890"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewsdt);

        ArrayAdapter arrayAdapterlistsdt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, danhsachsdt);
        listView.setAdapter(arrayAdapterlistsdt);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, danhsachsdt[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}

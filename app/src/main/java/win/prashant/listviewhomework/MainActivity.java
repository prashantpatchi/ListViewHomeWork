package win.prashant.listviewhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static win.prashant.listviewhomework.R.layout.support_simple_spinner_dropdown_item;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    //array to make list of country

    String coursename[] = {"Android", "Java", "Php", "Dotnet", "Oracle", "Hadoop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call list by id
        listView = findViewById(R.id.listviewCourse);

        //fetch the data from array use array adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, coursename);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();

                //to connect to different page we use intent
                Intent in=new Intent(MainActivity.this,CourseDetails.class);
                startActivity(in);
            }
        });
    }
}

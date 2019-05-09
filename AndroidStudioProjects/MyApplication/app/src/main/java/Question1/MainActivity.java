package Question1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a533.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    List<jobOfferModel> todoList = new ArrayList<>();

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new jobOfferModelAdapter(todoList);
        recyclerView.setAdapter(adapter);
        addData();
    }

    public void addData(){
        jobOfferModel todoToAdd = new jobOfferModel("Vendeur","Vendre des choses",25);
        todoList.add(todoToAdd);
        todoToAdd = new jobOfferModel("Programmeur","Utiliser google correctement",35);
        todoList.add(todoToAdd);
        todoToAdd = new jobOfferModel("3rd job","3rd wheeling",25);
        todoList.add(todoToAdd);
        adapter.notifyDataSetChanged();
    }

}

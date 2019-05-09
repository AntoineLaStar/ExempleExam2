package Question2;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.a533.myapplication.R;

public class Question2 extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        setListener();
    }

    private void setListener(){
        Button btnAfficher = findViewById(R.id.btn_afficher);
        btnAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.layout_dialog);

                Button btn_captain = dialog.findViewById(R.id.btn_captain2);
                Button btn_annuler =  dialog.findViewById(R.id.btn_annuler2);

                btn_annuler.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Question2.this, "It’s treason\n" +
                                "then", Toast.LENGTH_SHORT).show();
                    }
                });

                btn_captain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Question2.this, "Vroom", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();
            }
        });
    }

}

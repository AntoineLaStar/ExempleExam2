package Question1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.a533.myapplication.R;

import java.util.List;

public class jobOfferModelAdapter extends RecyclerView.Adapter<jobOfferModelAdapter.MyViewHolder>{

    List<jobOfferModel> jobOfferList;

    public jobOfferModelAdapter(List<jobOfferModel> jobOfferList){
        this.jobOfferList = jobOfferList;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView poste;
        TextView description;
        TextView salaire;
        Button btn_delete;

        public MyViewHolder(View itemView) {
            super(itemView);
            poste = itemView.findViewById(R.id.txtTitre);
            description = itemView.findViewById(R.id.txtDescription);
            salaire = itemView.findViewById(R.id.txtSalaire);
            btn_delete = itemView.findViewById(R.id.btn_delete);

        }
    }


    @NonNull
    @Override
    public jobOfferModelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_offre_emplois_layout, parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull jobOfferModelAdapter.MyViewHolder holder, final int position) {
        jobOfferModel jobOfferToDisplay = jobOfferList.get(position);
        holder.poste.setText(jobOfferToDisplay.getPoste());
        holder.description.setText(jobOfferToDisplay.getDescription());
        holder.salaire.setText(String.valueOf(jobOfferToDisplay.getSalaire()));
        holder.btn_delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                jobOfferList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobOfferList.size();
    }
}


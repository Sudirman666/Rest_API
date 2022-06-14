package com.sudirman.rest_api_191103538.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sudirman.rest_api_191103538.Model.Kontak;
import com.sudirman.rest_api_191103538.R;

import java.util.List;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.MyViewHolder> {
    List<Kontak> mKontakList;
    public KontakAdapter(List<Kontak> KontakList){

        mKontakList = KontakList;
    }

    @NonNull
    @Override
    public KontakAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mview = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_list,parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mview);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nTextViewId, nTextViewNama, nTextViewNomor;

        public MyViewHolder(View itemView){
            super(itemView);
            nTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            nTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            nTextViewNomor = (TextView) itemView.findViewById(R.id.tvNomor);
        }
    }
}

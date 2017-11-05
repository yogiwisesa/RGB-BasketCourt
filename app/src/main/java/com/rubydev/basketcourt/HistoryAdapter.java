package com.rubydev.basketcourt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yogi Wisesa on 11/5/2017.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder>{
    private List<Score> list = new ArrayList<>();
    private Context context;

    public HistoryAdapter(List<Score> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView  = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Score score = list.get(position);
        holder.tvPertandingan.setText(score.getTeam_a() + " vs " + score.getTeam_b());
        holder.tvTanggal.setText(score.getDate());
        holder.tvTeamA.setText(score.getTeam_a());
        holder.tvScoreA.setText("" + score.getScore_a());
        holder.tvTeamB.setText(score.getTeam_b());
        holder.tvScoreB.setText("" + score.getScore_b());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvPertandingan, tvTanggal, tvTeamA, tvScoreA,tvTeamB ,tvScoreB;

        public ViewHolder(View itemView) {
            super(itemView);
            tvPertandingan = itemView.findViewById(R.id.tvPertandingan);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
            tvTeamA = itemView.findViewById(R.id.tvTeamA);
            tvScoreA = itemView.findViewById(R.id.tvScoreA);
            tvTeamB = itemView.findViewById(R.id.tvTeamB);
            tvScoreB = itemView.findViewById(R.id.tvScoreB);

        }
    }
}

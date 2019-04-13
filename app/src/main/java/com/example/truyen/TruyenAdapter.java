package com.example.truyen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class TruyenAdapter extends RecyclerView.Adapter<TruyenAdapter.viewholder> {
    private Context context;
    private List<Truyen> truyenList;

    public TruyenAdapter(Context context, List<Truyen> list) {
        this.context = context;
        this.truyenList = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.truyen_item, null);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder viewholder, int position) {
        Truyen truyen = truyenList.get(position);

        viewholder.tvtentruyen.setText(truyen.getTentruyen());
        viewholder.tvtacgia.setText(truyen.getTacgia());
        viewholder.tvSochuong.setText(String.valueOf(truyen.getSoChuong()));

        if (truyen.getGroupId() == Truyen.GROUPngontinh) {
            viewholder.iv.setImageResource(R.drawable.ic_book);
        }
        if (truyen.getGroupId() == Truyen.GROUPtruyentranh) {
            viewholder.iv.setImageResource(R.drawable.ic_bookmark);
        }
        if (truyen.getGroupId() == Truyen.GROUPtruyenhai) {
            viewholder.iv.setImageResource(R.drawable.ic_collections);
        }

    }

    @Override
    public int getItemCount() {
        return truyenList.size();
    }

    class viewholder extends RecyclerView.ViewHolder {
        TextView tvtentruyen;
        TextView tvtacgia;
        TextView tvSochuong;
        ImageView iv;

        public viewholder(View itemView) {
            super(itemView);
            tvtentruyen = itemView.findViewById(R.id.tvtentruyen);
            tvtacgia = itemView.findViewById(R.id.tvTG);
            tvSochuong = itemView.findViewById(R.id.tvSC);
            iv = itemView.findViewById(R.id.iv);

           itemView.findViewById(R.id.layout_item).setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   ShowItem(getAdapterPosition());
               }
           });
        }
    }
    public void ShowItem(int position){
        Truyen truyen = truyenList.get(position);
        Toast.makeText(context, truyen.getTentruyen(), Toast.LENGTH_SHORT).show();
    }
}

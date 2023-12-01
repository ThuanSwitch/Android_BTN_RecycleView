package com.example.nhom09_recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonHocAdapter extends RecyclerView.Adapter<MonHocAdapter.ViewHolder> {
    private List<MonHoc> lstMohoc ;
    public MonHocAdapter (List<MonHoc> lstMohocs)
    {
        lstMohoc = lstMohocs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //// tạo view
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);
        View monhocView = inflater.inflate(R.layout.item_mh,parent,false);
        ViewHolder viewHolder = new ViewHolder(monhocView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // gắn dữ liệu vào item_view
        MonHoc temp = lstMohoc.get(position);
        holder.txtMonHoc.setText(temp.maMh + "-" +temp.tenMh);
        holder.txtTenGV.setText(temp.tenGv);
        Context context = holder.imgView.getContext();
        int imageId = context.getResources().getIdentifier(temp.tenHinh,"mipmap",context.getPackageName());
        if(imageId != 0)
        {
            holder.imgView.setImageResource(imageId);
        }
    }

    @Override
    public int getItemCount() {

        return lstMohoc.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imgView;
            TextView txtMonHoc;
            TextView txtTenGV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = (ImageView) itemView.findViewById(R.id.imgMonhoc);
            txtMonHoc = (TextView) itemView.findViewById(R.id.txtHocPhan);
            txtTenGV = (TextView) itemView.findViewById(R.id.txtGiaoVien);
        }
    }
}

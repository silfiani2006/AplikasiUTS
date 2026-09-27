package com.SilfianiHasanah_F52124075.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] namaList;
    String[] nimList;
    String[] statusList;
    int[] imageList;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] namaList, String[] nimList, String[] statusList, int[] imageList) {
        this.context = context;
        this.namaList = namaList;
        this.nimList = nimList;
        this.statusList = statusList;
        this.imageList = imageList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return namaList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.item_list, viewGroup, false);
        }

        ImageView imgFoto = view.findViewById(R.id.imgFoto);
        TextView txtNama = view.findViewById(R.id.txtNama);
        TextView txtNim = view.findViewById(R.id.txtNim);
        TextView txtStatus = view.findViewById(R.id.txtStatus);

        imgFoto.setImageResource(imageList[i]);
        txtNama.setText("Nama: " + namaList[i]);
        txtNim.setText("NIM: " + nimList[i]);
        txtStatus.setText("Status: " + statusList[i]);

        return view;
    }
}
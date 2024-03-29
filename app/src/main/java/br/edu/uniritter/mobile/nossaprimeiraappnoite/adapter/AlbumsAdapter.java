package br.edu.uniritter.mobile.nossaprimeiraappnoite.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import br.edu.uniritter.mobile.nossaprimeiraappnoite.R;
import br.edu.uniritter.mobile.nossaprimeiraappnoite.model.Album;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder> {

    private final List<Album> listAlbums;

    public static class AlbumsViewHolder extends RecyclerView.ViewHolder {
        public View viewAlbums;
        public AlbumsViewHolder(@NonNull View itemView) {
            super(itemView);
            this.viewAlbums = itemView;
        }
    }

    public AlbumsAdapter(List<Album> albums) { this.listAlbums = albums; }

    @NonNull
    @Override
    public AlbumsAdapter.AlbumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detalhe_albums, parent, false);
        return new AlbumsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumsAdapter.AlbumsViewHolder holder, int position) {
        Album obj = this.listAlbums.get(position);
        TextView tv = holder.viewAlbums.findViewById(R.id.tvId);
        tv.setText(String.valueOf(obj.getId()));
        tv = holder.viewAlbums.findViewById(R.id.tvIdUser);
        tv.setText(String.valueOf(obj.getUserId()));
        tv = holder.viewAlbums.findViewById(R.id.tvTitle);
        tv.setText(obj.getTitle());
    }

    @Override
    public int getItemCount() { return this.listAlbums.size(); }
}
package gwc.com.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.ViewHolder> {
    private List<Teams> mTeamsList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View teamsView;
        ImageView TeamsImage;
        TextView TeamsName;

        public ViewHolder(View view) {
            super(view);
            teamsView = view;
            TeamsImage = (ImageView) view.findViewById(R.id.teams_image);
            TeamsName = (TextView) view.findViewById(R.id.teams_name);
        }
    }

    public TeamsAdapter(List<Teams> TeamsList) {
        mTeamsList = TeamsList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.teamsView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Teams teams = mTeamsList.get(position);
                Toast.makeText(v.getContext(), "You chose " + teams.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.TeamsImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Teams teams = mTeamsList.get(position);
                Toast.makeText(v.getContext(), "You chose " + teams.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Teams Teams = mTeamsList.get(position);
        holder.TeamsImage.setImageResource(Teams.getImageId());
        holder.TeamsName.setText(Teams.getName());
    }

    public int getItemCount() {
        return mTeamsList.size();
    }
}

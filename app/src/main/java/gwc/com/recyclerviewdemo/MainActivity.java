package gwc.com.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Teams> TeamsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTeams();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager =new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        TeamsAdapter adapter = new TeamsAdapter(TeamsList);
        recyclerView.setAdapter(adapter);
    }

    private void initTeams() {
        Teams Blazers = new Teams("Blazers", R.drawable.blazers);
        TeamsList.add(Blazers);
        Teams Bucks = new Teams("Bucks", R.drawable.bucks);
        TeamsList.add(Bucks);
        Teams Bulls = new Teams("Bulls", R.drawable.bulls);
        TeamsList.add(Bulls);
        Teams Cavaliers = new Teams("Cavaliers", R.drawable.cavaliers);
        TeamsList.add(Cavaliers);
        Teams Celtics = new Teams("Celtics", R.drawable.celtics);
        TeamsList.add(Celtics);
        Teams Clippers = new Teams("Clippers", R.drawable.clippers);
        TeamsList.add(Clippers);
        Teams Grazzlies = new Teams("Grazzlies", R.drawable.grizzlies);
        TeamsList.add(Grazzlies);
        Teams Hawks = new Teams("Hawks", R.drawable.hawks);
        TeamsList.add(Hawks);
        Teams Heat = new Teams("Heat", R.drawable.heat);
        TeamsList.add(Heat);
        Teams Hornets = new Teams("Hornets", R.drawable.hornets);
        TeamsList.add(Hornets);
        Teams Jazz = new Teams("Jazz", R.drawable.jazz);
        TeamsList.add(Jazz);
        Teams Kings = new Teams("Kings", R.drawable.kings);
        TeamsList.add(Kings);
        Teams Knicks = new Teams("Knicks", R.drawable.knicks);
        TeamsList.add(Knicks);
        Teams Lakers = new Teams("Lakers", R.drawable.lakers);
        TeamsList.add(Lakers);
        Teams Magic = new Teams("Magic", R.drawable.magic);
        TeamsList.add(Magic);
        Teams Mavericks = new Teams("Mavericks", R.drawable.mavericks);
        TeamsList.add(Mavericks);
        Teams Nets = new Teams("Nets", R.drawable.nets);
        TeamsList.add(Nets);
        Teams Nuggets = new Teams("Nuggets", R.drawable.nuggets);
        TeamsList.add(Nuggets);
        Teams Pacers = new Teams("Pacers", R.drawable.pacers);
        TeamsList.add(Pacers);
        Teams Pelicans = new Teams("Pelicans", R.drawable.pelicans);
        TeamsList.add(Pelicans);
        Teams Pistons = new Teams("Pistons", R.drawable.pistons);
        TeamsList.add(Pistons);
        Teams Raptors = new Teams("Raptors", R.drawable.raptors);
        TeamsList.add(Raptors);
        Teams Rockets = new Teams("Rockets", R.drawable.rockets);
        TeamsList.add(Rockets);
        Teams Sixers = new Teams("76ers", R.drawable.sixers);
        TeamsList.add(Sixers);
        Teams Spurs = new Teams("Spurs", R.drawable.spurs);
        TeamsList.add(Spurs);
        Teams Suns = new Teams("Suns", R.drawable.suns);
        TeamsList.add(Suns);
        Teams Thunders = new Teams("Thunders", R.drawable.thunders);
        TeamsList.add(Thunders);
        Teams Warriors = new Teams("Warriors", R.drawable.warriors);
        TeamsList.add(Warriors);
        Teams Wizards = new Teams("Wizards", R.drawable.wizards);
        TeamsList.add(Wizards);
        Teams Wolves = new Teams("Wolves", R.drawable.wolves);
        TeamsList.add(Wolves);
    }
}

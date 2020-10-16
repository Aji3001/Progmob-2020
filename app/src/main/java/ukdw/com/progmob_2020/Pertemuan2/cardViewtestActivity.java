package ukdw.com.progmob_2020.Pertemuan2;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ukdw.com.progmob_2020.Adapter.MahasiswaCardAdapter;
import ukdw.com.progmob_2020.Model.Mahasiswa;
import ukdw.com.progmob_2020.R;

public class cardViewtestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        CardView cv =(CardView)findViewById(R.id.rvCard);
        MahasiswaCardAdapter mahasiswaCardAdapter;

        //Data Dummyy...
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //Generate Data Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Kurniadi", "72170163", "08124142311");
        Mahasiswa m2 = new Mahasiswa("Sui", "72170164", "08121122233");
        Mahasiswa m3 = new Mahasiswa("Dylan", "72170165", "08151132133");
        Mahasiswa m4 = new Mahasiswa("Laura", "72170166", "08124123211");
        Mahasiswa m5 = new Mahasiswa("Scarlet", "72170167", "081242145131");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        mahasiswaCardAdapter = new MahasiswaCardAdapter(cardViewtestActivity.this);
        //fungsi data set yang memungkinkan mengirimkan data ke adapter
        mahasiswaCardAdapter.setMahasiswaList(mahasiswaList);

        cv.setLayoutManager(new LinearLayoutManager(cardViewtestActivity.this));
        cv.setAdapter(mahasiswaCardAdapter);



    }
}

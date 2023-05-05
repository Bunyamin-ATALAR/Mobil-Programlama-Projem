package tr.edu.medipol.ybs95180026;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DerslerActivity extends AppCompatActivity {

  //  ListView listem;
 //   String [] dersler={"MOBİL PROGRAMLAMA","BİLİŞİM HUKUKU","OYUN TEORİSİ","DİJİTAL PAZARLAMA","SOSYAL BİLİMLERDE ARAŞTIRMA YÖNTEMLERİ","VERİ MADENCİLİĞİ VE İŞ ZEKASI"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dersler);

        ListView listView=findViewById(R.id.listem);
        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("MOBİL PROGRAMLAMA");
        arrayList.add("BİLİŞİM HUKUKU");
        arrayList.add("OYUN TEORİSİ");
        arrayList.add("DİJİTAL PAZARLAMA");
        arrayList.add("SOSYAL BİLİMLERDE ARAŞTIRMA YÖNTEMLERİ");
        arrayList.add("VERİ MADENCİLİĞİ VE İŞ ZEKASI");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DerslerActivity.this, "Seçtiğiniz Ders:  "+arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
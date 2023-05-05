package tr.edu.medipol.ybs95180026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SehirActivity extends AppCompatActivity {

    Button harsena,kaya,hazeran,aynali,sehzadeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehir);
        harsena=findViewById(R.id.harsena);
        kaya=findViewById(R.id.kaya);
        hazeran=findViewById(R.id.hazeran);
        aynali=findViewById(R.id.aynali);
        sehzadeler=findViewById(R.id.sehzadeler);

        harsena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.kulturportali.gov.tr/turkiye/amasya/gezilecekyer/amasya-kales");
                
            }
        });
        kaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.kulturportali.gov.tr/turkiye/amasya/gezilecekyer/kralkaya-mezarlari");
            }
        });
        hazeran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.kulturportali.gov.tr/turkiye/amasya/gezilecekyer/hazeranlar-konagi---muze-ev-");
            }
        });
        aynali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.kulturportali.gov.tr/turkiye/amasya/gezilecekyer/aynali-magara");
            }
        });
        sehzadeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.kulturportali.gov.tr/turkiye/amasya/gezilecekyer/ozel-sehzadeler--muzes");
            }
        });

    }

    private void goLink(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
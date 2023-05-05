package tr.edu.medipol.ybs95180026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sehirtanimlamaa();
        derstanimlamaa();
        epostatanimlamaa();
        aramatanimlamaa();

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent derss=new Intent(getApplicationContext(),DerslerActivity.class);
                startActivity(derss);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent epostaa=new Intent(getApplicationContext(),EpostaActivity.class);
                startActivity(epostaa);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aramaa=new Intent(getApplicationContext(),AramaActivity.class);
                startActivity(aramaa);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sehirr=new Intent(getApplicationContext(),SehirActivity.class);
                startActivity(sehirr);
            }






        });
    }
    public void sehirtanimlamaa()
    {
        btn=findViewById(R.id.btnsehir);
    }
    public void derstanimlamaa()
    {
        btn2=findViewById(R.id.btndersler);
    }
    public void epostatanimlamaa()
    {
        btn3=findViewById(R.id.btneposta);
    }
    public void aramatanimlamaa()
    {
        btn4=findViewById(R.id.btnarama);
    }


}
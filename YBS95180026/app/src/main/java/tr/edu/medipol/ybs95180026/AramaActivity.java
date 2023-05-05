package tr.edu.medipol.ybs95180026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AramaActivity extends AppCompatActivity {

    EditText etnumaram,etmesajim;
    Button btnmesaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arama);
        etmesajim=findViewById(R.id.etmesajim);
        etnumaram=findViewById(R.id.etnumaram);
        btnmesaj=findViewById(R.id.btnmesaj);

        btnmesaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no=etnumaram.getText().toString();
                String mesaj=etmesajim.getText().toString();
                Intent sms=new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"+no));
                String name = "sms_body";
                sms.putExtra(name,mesaj);
                startActivity(sms);
            }
        });
    }
}

package tr.edu.medipol.ybs95180026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EpostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eposta);

        final EditText Mail_Adresim=(EditText) findViewById(R.id.editTextTextEmailAddress2);
        final EditText Mail_Konusu=(EditText) findViewById(R.id.editTextTextPersonName4);
        final EditText Mail_Icerik=(EditText) findViewById(R.id.editTextTextMultiLine2);

        Button Gonder=(Button) findViewById(R.id.btngonder);

        Gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mail_Gonder(Mail_Adresim.getText().toString(),Mail_Konusu.getText().toString(),Mail_Icerik.getText().toString());
            }
        });


    }

    private void Mail_Gonder(String adres, String konu, String icerik) {

        Intent mail_intent=new Intent(Intent.ACTION_SEND);
        mail_intent.setType("message/rfc822");
        mail_intent.putExtra(Intent.EXTRA_EMAIL,new String[]{adres});
        mail_intent.putExtra(Intent.EXTRA_SUBJECT,konu);
        mail_intent.putExtra(Intent.EXTRA_TEXT,icerik);
        startActivity(mail_intent);
    }


}
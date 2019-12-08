package applusiana.a9februari;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText namaDepan;
    private EditText namaBelakang;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaDepan = findViewById(R.id.etNama);
        namaBelakang = findViewById(R.id.etnamaBelakang);
        ok = findViewById(R.id.button);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Selamat Datang");
        alertDialog.setMessage("Hallo, "
                + namaDepan.getText().toString()
                + " "
                + namaBelakang.getText().toString()
                + ". Bagaimana kabarmu?");
        alertDialog.show();

    }
}

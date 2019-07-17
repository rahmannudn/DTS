import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pertemuan12.MainActivity;
import com.example.pertemuan12.R;

import helper.DbHelper;

public class AddEdit extends AppCompatActivity {
    EditText txt_id, txt_nama, txt_address;
    Button btn_submit, btn_cancel;
    DbHelper SQLite = new DbHelper (this);
    String id, name, address;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_add_edit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt_id = (EditText) findViewById(R.id.txt_id);
        txt_nama = (EditText) findViewById(R.id.txt_nama);
        address = getIntent().getStringExtra(MainActivity.TAG_ADDRESS);

        if (id == null || id == "") {
            setTitle("Add Data");
        } else {
            setTitle("Edit Data");
            txt_id.setText(id);
            txt_nama.setText(name);
            txt_address.setText(address);
        }

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (txt_id.getText().toString().equals("")) {
                        save();
                    } else {
                        edit();
                    }
                } catch (Exception e) {
                    Log.e("Submit", e.toString());
                }
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blank();
                finish();
            }
        });
    }
                @Override
        public void onBackPressed(){
            finish();
        }

                public boolean onOptionItemSelected(MenuItem item){
            switch (item.getItemId()){
                case android.R.id.home:
                blank();
                this.finish();
                return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

        private void blank() {
            txt_nama.requestFocus();
            txt_id.setText(null);
            txt_nama.setText(null);
            txt_address.setText(null);
        }

        private void save(){
            if (String.valueOf(txt_nama.getText()).equals(null) || String.valueOf(txt_nama.getText()).equals("") ||
                String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals(""))    {
                Toast.makeText(getApplicationContext(),
                        "Please input name or adddress", Toast.LENGTH_SHORT).show();

            }else{
                SQLite.insert(txt_nama.getText().toString().trim(),txt_address.getText().toString().trim());
                blank();
                finish();
            }
        }
        private void edit(){
            if (String.valueOf(txt_nama.getText()).equals(null) || String.valueOf(txt_nama.getText()).equals("")||
                    String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals("")) {
                Toast.makeText(getApplicationContext(),
                        "Please input name or adddress", Toast.LENGTH_SHORT).show();

            }else{
                SQLite.update(Integer.parseInt(txt_id.getText().toString().trim()), txt_nama.getText().toString().trim(),
                txt_address.getText().toString().trim());
                blank();
                finish();
            }
        }
    }

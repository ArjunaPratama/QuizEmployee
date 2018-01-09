package com.arjuna.quizemployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtname, txtsalary, txtjob, txtemployer;
    EditText name, job, employer, salary;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil data
        txtname = (TextView) findViewById(R.id.txtname);
        txtsalary = (TextView) findViewById(R.id.txtsalary);
        txtjob = (TextView) findViewById(R.id.txtjob);
        txtemployer = (TextView) findViewById(R.id.txtemployer);
        job = (EditText) findViewById(R.id.job);
        name = (EditText) findViewById(R.id.name);
        employer = (EditText) findViewById(R.id.employer);
        salary = (EditText) findViewById(R.id.salary);
        Submit = (Button) findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil String dari etnama dan etkelas
                String njob = job.getText().toString();
                String nname = name.getText().toString();
                String nemployer = employer.getText().toString();
                String nsallary = salary.getText().toString();

                txtname.setText("Name:" + nname);
                txtsalary.setText("Salary:" + nsallary);
                txtjob.setText("Job:" + njob);
                txtemployer.setText("Employer:" + nemployer);
            }

        });
    }
}
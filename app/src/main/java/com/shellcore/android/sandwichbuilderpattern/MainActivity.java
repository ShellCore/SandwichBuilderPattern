package com.shellcore.android.sandwichbuilderpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Componentes
    @BindView(R.id.rdb_baguette)
    RadioButton rdbBaguette;
    @BindView(R.id.rdb_bagel)
    RadioButton rdbBagel;
    @BindView(R.id.chk_ham)
    CheckBox chkHam;
    @BindView(R.id.chk_cheese)
    CheckBox chkCheese;
    @BindView(R.id.sw_salt)
    Switch swSalt;
    @BindView(R.id.txt_cancel)
    TextView txtCancel;
    @BindView(R.id.txt_accept)
    TextView txtAccept;
    @BindView(R.id.txt_order)
    TextView txtOrder;

    // Servicios
    public SandwichBuilder builder;

    // Variables
    public Sandwich sandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initializeData();
    }

    private void initializeData() {
        builder = new SandwichBuilder();
    }

    @OnClick(R.id.txt_accept)
    public void onClickBtnAccept() {
        sandwich = new Sandwich();

        if (rdbBaguette.isChecked()) {
            sandwich = builder.build(sandwich, new Baguette());
        } else if (rdbBagel.isChecked()) {
            sandwich = builder.build(sandwich, new Bagel());
        }

        if (chkHam.isChecked()) {
            sandwich = builder.build(sandwich, new Ham());
        }

        if (chkCheese.isChecked()) {
            sandwich = builder.build(sandwich, new Cheese());
        }

        if (swSalt.isChecked()) {
            sandwich = builder.build(sandwich, new Salt());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sandwich.getDescription())
                .append("\n")
                .append(sandwich.getKcal())
                .append(" kcal");
        txtOrder.setText(sb.toString());
    }
}

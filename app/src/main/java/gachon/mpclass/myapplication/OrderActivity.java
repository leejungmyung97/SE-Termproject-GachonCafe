package gachon.mpclass.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {
    Button order;
    TextView product1;
    TextView product2;
    TextView product3;
    TextView product4;
    TextView product5;
    int quantity, quantity2, quantity3, quantity4, quantity5;
    final int price1 = 2000;
    final int price2 = 3000;
    final int price3 = 2500;
    final int price4 = 1500;
    final int price5 = 1500;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        order = (Button) findViewById(R.id.order);
        product1 = (TextView) findViewById(R.id.menu1);
        product2 = (TextView) findViewById(R.id.menu2);
        product3 = (TextView) findViewById(R.id.menu3);
        product4 = (TextView) findViewById(R.id.menu4);
        product5 = (TextView) findViewById(R.id.menu5);
        order.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.order:
                if(getQuantity1().equals("0") && getQuantity2().equals("0") && getQuantity3().equals("0") && getQuantity4().equals("0") && getQuantity5().equals("0"))
                {
                    Toast.makeText(OrderActivity.this, "음료를 선택해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(this, PayActivity.class);
                    String[] arr1 = {"불고기버거", getQuantity1() + getCheck1(), getPrice1()};
                    String[] arr2 = {"치즈버거", getQuantity2() + getCheck2(), getPrice2()};
                    String[] arr3 = {"새우버거", getQuantity3() + getCheck3(), getPrice3()};
                    String[] arr4 = {"콜라", getQuantity4() + getCheck4(), getPrice4()};
                    String[] arr5 = {"사이다", getQuantity5() + getCheck5(), getPrice5()};
                    intent.putExtra("americano", arr1);
                    intent.putExtra("latte", arr2);
                    intent.putExtra("capuchino", arr3);
                    intent.putExtra("camomile", arr4);
                    startActivity(intent);
                    finish();
                    break;
                }
        }
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity == 0) {
            quantity = 0;
        } else {
            quantity = quantity - 1;
            display(quantity);
        }
    }

    private void display(int number) {
        TextView quantityText = (TextView) findViewById(R.id.quantity_number);
        quantityText.setText("" + number);
        TextView priceText = (TextView) findViewById(R.id.price_number);
        priceText.setText(NumberFormat.getCurrencyInstance().format(quantity * price1));
    }

    public void SecIncrement(View view) {
        quantity2 = quantity2 + 1;
        SecDisplay(quantity2);
    }

    public void SecDecrement(View view) {
        if (quantity2 == 0) {
            quantity2 = 0;
        } else {
            quantity2 = quantity2 - 1;
            SecDisplay(quantity2);
        }
    }

    private void SecDisplay(int number) {

        TextView SecQuantityText = (TextView) findViewById(R.id.quantity_number2);
        SecQuantityText.setText("" + number);
        TextView SecPriceText = (TextView) findViewById(R.id.price_number2);
        SecPriceText.setText(NumberFormat.getCurrencyInstance().format(quantity2 * price2));
    }


    public void Increment3(View view) {
        quantity3 = quantity3 + 1;
        Display3(quantity3);
    }

    public void Decrement3(View view) {
        if (quantity3 == 0) {
            quantity3 = 0;
        } else {
            quantity3 = quantity3 - 1;
            Display3(quantity3);
        }
    }

    private void Display3(int number) {

        TextView ThQuantityText = (TextView) findViewById(R.id.quantity_number3);
        ThQuantityText.setText("" + number);
        TextView ThPriceText = (TextView) findViewById(R.id.price_number3);
        ThPriceText.setText(NumberFormat.getCurrencyInstance().format(quantity3 * price3));

    }


    public void Increment4(View view) {
        quantity4 = quantity4 + 1;
        Display4(quantity4);
    }

    public void Decrement4(View view) {
        if (quantity4 == 0) {
            quantity4 = 0;
        } else {
            quantity4 = quantity4 - 1;
            Display4(quantity4);
        }
    }

    private void Display4(int number) {

        TextView FoQuantityText = (TextView) findViewById(R.id.quantity_number4);
        FoQuantityText.setText("" + number);
        TextView FoPriceText = (TextView) findViewById(R.id.price_number4);
        FoPriceText.setText(NumberFormat.getCurrencyInstance().format(quantity4 * price4));


    }

    public void Increment5(View view) {
        quantity5 = quantity5 + 1;
        Display5(quantity5);
    }

    public void Decrement5(View view) {
        if (quantity5 == 0) {
            quantity5 = 0;
        } else {
            quantity5 = quantity5 - 1;
            Display5(quantity5);
        }
    }

    private void Display5(int number) {

        TextView FoQuantityText = (TextView) findViewById(R.id.quantity_number5);
        FoQuantityText.setText("" + number);
        TextView FoPriceText = (TextView) findViewById(R.id.price_number5);
        FoPriceText.setText(NumberFormat.getCurrencyInstance().format(quantity5 * price5));


    }


    private String getPrice1() {
        return String.valueOf(quantity * price1);
    }

    private String getPrice2() {
        return String.valueOf(quantity2 * price2);
    }

    private String getPrice3() {
        return String.valueOf(quantity3 * price3);
    }

    private String getPrice4() {
        return String.valueOf(quantity4 * price4);
    }

    private String getPrice5() {
        return String.valueOf(quantity5 * price5);
    }

    private String getQuantity1()
    {
        TextView qu1 = (TextView) findViewById(R.id.quantity_number);
        return qu1.getText().toString();
    }
    private String getQuantity2()
    {
        TextView qu2 = (TextView) findViewById(R.id.quantity_number2);
        return qu2.getText().toString();
    }

    private String getQuantity3()
    {
        TextView qu3 = (TextView) findViewById(R.id.quantity_number3);
        return qu3.getText().toString();
    }

    private String getQuantity4()
    {
        TextView qu4 = (TextView) findViewById(R.id.quantity_number4);
        return qu4.getText().toString();
    }

    private String getQuantity5()
    {
        TextView qu5 = (TextView) findViewById(R.id.quantity_number5);
        return qu5.getText().toString();
    }

    private String getCheck1() {
        CheckBox ck1 = (CheckBox) findViewById(R.id.check1);
        if(ck1.isChecked())
            return "TakeOut";
        else
            return "";
    }

    private String getCheck2() {
        CheckBox ck2 = (CheckBox) findViewById(R.id.check2);
        if(ck2.isChecked())
            return "TakeOut";
        else
            return "";
    }

    private String getCheck3() {
        CheckBox ck3 = (CheckBox) findViewById(R.id.check3);
        if(ck3.isChecked())
            return "TakeOut";
        else
            return "";
    }

    private String getCheck4() {
        CheckBox ck4 = (CheckBox) findViewById(R.id.check4);
        if(ck4.isChecked())
            return "TakeOut";
        else
            return "";
    }

    private String getCheck5() {
        CheckBox ck5 = (CheckBox) findViewById(R.id.check5);
        if(ck5.isChecked())
            return "TakeOut";
        else
            return "";
    }
}

package edu.cyut.im.order_system;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class restaurant extends AppCompatActivity {
    Button first,second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);
        first=(Button)findViewById(R.id.first_Resuaurant);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(restaurant.this, first_restaurant.class);
                startActivity(intent);
                finish();

            }
        });
        second=(Button)findViewById(R.id.Second_Resaurant);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
